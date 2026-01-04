package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddrObj() {
		
		Address addr=new Address();
		
		addr.setHouseno(5001);
		addr.setCity("Ranchi");
		addr.setPincode(835205);
		return addr;
	}
	
	@Bean
	public Student createStdObj() {
		
		Student std=new Student();
		
		std.setRollno(10001);
		std.setName("Tariquer Ansari");
		std.setAddress(createAddrObj());
		return std;
	}
	

}
