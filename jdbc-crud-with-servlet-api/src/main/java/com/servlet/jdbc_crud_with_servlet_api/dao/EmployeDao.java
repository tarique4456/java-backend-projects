 package com.servlet.jdbc_crud_with_servlet_api.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.*;

import com.servlet.jdbc_crud_with_servlet_api.connection.EmployeConnection;
import com.servlet.jdbc_crud_with_servlet_api.dto.Employe;

public class EmployeDao {

	Connection connection = EmployeConnection.getEmployeConnection();
	PreparedStatement ps = null;

	public Employe saveEmployeDao(Employe employe) {

		String insertEmployeQuery = "insert into employe(id,name,email,password,phone,doj,designation,gender)values(?,?,?,?,?,?,?,?)";
		

		try {
			ps = connection.prepareStatement(insertEmployeQuery);

			ps.setInt(1, employe.getId());
			ps.setString(2, employe.getName());
			ps.setString(3, employe.getEmail());
			ps.setString(4, employe.getPassword());
			ps.setLong(5, employe.getPhone());
			ps.setObject(6, employe.getDoj());
			ps.setString(7, employe.getDesignation());
			ps.setString(8, employe.getGender());

			int a = ps.executeUpdate();

			return a != 0 ? employe : null;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			if (ps != null && connection != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}

	}
public List<Employe> fetchAllEmployDataDao(){
		
		String displayEmployQuery="SELECT * FROM employe";
		ResultSet set=null;
		try {
		ps=connection.prepareStatement(displayEmployQuery);
		set=ps.executeQuery();
		
		List<Employe> employees = new ArrayList<Employe>();
		
		while(set.next()) {
			int id=set.getInt("id");
			String name=set.getString("name");
			String email=set.getString("email");
//			String password=set.getNString("password");
			Long phone=set.getLong("phone");
			LocalDate doj=set.getDate("doj").toLocalDate();
			String designation =set.getString("designation");
			String gender=set.getString("gender");
			
			Employe employe=new Employe();
			
			employe.setId(id);
			employe.setName(name);
			employe.setEmail(email);
//			employe.setPassword(password);
			employe.setPhone(phone);
			employe.setDoj(doj);
			employe.setDesignation(designation);
			employe.setGender(gender);
			
			employees.add(employe);
		}
		
		//after while loop
		
		return employees;
		
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}finally {
			if(set!=null && ps!=null && connection!=null) {
				try {
					set.close();
					ps.close();
					connection.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}


	public List<Employe> saveMultipleEmployeDao(List<Employe> employes){
		
		String insertEmployeQuery = "insert into employe(id,name,email,password,phone,doj,designation,gender)values(?,?,?,?,?,?,?,?)";
		
		try {
			connection.setAutoCommit(false);
			
			PreparedStatement ps=connection.prepareStatement(insertEmployeQuery);
			for(Employe employe:employes) {
				ps.setInt(1, employe.getId());
				ps.setString(2, employe.getName());
				ps.setString(3, employe.getEmail());
				ps.setString(4, employe.getPassword());
				ps.setLong(5, employe.getPhone());
				ps.setObject(6, employe.getDoj());
				ps.setString(7, employe.getDesignation());
				ps.setString(8, employe.getGender());
				
				ps.addBatch();
				
			}
			
			int a[]=ps.executeBatch();
			connection.commit();
			if(a.length!=0) {
				System.out.println(a.length+" Row affected in db table");
				return employes;
			}
			return null;
			
		}catch(SQLException e) {
//			e.printStackTrace();
			
			if(connection!=null) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
				
					e1.printStackTrace();
				}
			}
			
			e.printStackTrace();
			return null;
			
		}finally {
			try {
				if(connection!=null&&ps!=null) {
					ps.close();
					connection.close();
				}
				
			}catch(SQLException e2) {
				e2.printStackTrace();
				
			}
		}
	
		
	}
	
	public boolean deleteEmployeByIdDao(int id) {
		String deleteQyery="DELETE FROM employe WHERE id=?";
		
		try {
			PreparedStatement ps=connection.prepareStatement(deleteQyery);
			ps.setInt(1, id);
			
			int rowDeleted=ps.executeUpdate();
			
			return rowDeleted>0;
			
		
			
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
			
		}
	}
	
	public boolean deleteMultipleEmploye(List<Integer> employeId) {
		
		String deleteQuery="delete from employe where id=?";
		PreparedStatement ps=null;
		
		try {
			connection.setAutoCommit(false);
			
			 ps=connection.prepareStatement(deleteQuery);
			
			for(Integer id:employeId) {
				ps.setInt(1, id);
				ps.addBatch();
				
				int a[]=ps.executeBatch();
				connection.commit();
				
				for(int result:a) {
					if(result==0) {
						return false;
					}
				}
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}finally {
			try {
				if(ps!=null) {
					ps.close();
				}
				
				connection.setAutoCommit(true);
				
			}catch(SQLException e2) {
				e2.printStackTrace();
				
			}
		}
		return false;
	}
	
	public Employe getEmployeByEmailDao(String empEmail) {
		String displayEmployQuery="SELECT * FROM employe where email=?";
		ResultSet set=null;
		
		try {
		ps=connection.prepareStatement(displayEmployQuery);
		ps.setString(1, empEmail);
		set=ps.executeQuery();
		
		
		if(set.next()) {
			int id=set.getInt("id");
			String name=set.getString("name");
			String email=set.getString("email");
			String password=set.getNString("password");
			Long phone=set.getLong("phone");
			LocalDate doj=set.getDate("doj").toLocalDate();
			String designation =set.getString("designation");
			String gender=set.getString("gender");
			
			Employe employe=new Employe();
			
			employe.setId(id);
			employe.setName(name);
			employe.setEmail(email);
			employe.setPassword(password);
			employe.setPhone(phone);
			employe.setDoj(doj);
			employe.setDesignation(designation);
			employe.setGender(gender);
			
			return employe;
		}
		
		//after while loop
		
		return null;
		
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}finally {
			if(set!=null && ps!=null && connection!=null) {
				try {
					set.close();
					ps.close();
					connection.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}







