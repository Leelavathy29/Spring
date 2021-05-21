package annotationBasedInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfiguration {

	@Bean(name="employee")
	public Employee getEmployee() {
		
		Employee emp = new Employee();
		emp.setEmployeeName("ABC");
		emp.setEmployeeSalary(5000);
		
		return emp;		
	}
}
