package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean("stdObj1")
	public Student createStudentbeanObj() {
		
		Student std=new Student();
		
		std.setName("Kamal");
		std.setRollno(101);
		std.setEmail("kamal@gmail.com");
		
		return std;
	}
	
	@Bean("stdObj2")
	public Student createStudentbeanObj2() {
		
		Student std=new Student();
		
		std.setName("Ankit");
		std.setRollno(102);
		std.setEmail("ankit@gmail.com");
		
		return std;
	}

}
