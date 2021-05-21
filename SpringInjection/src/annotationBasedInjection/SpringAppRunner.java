package annotationBasedInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringAppRunner {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
		
		Employee employee = applicationContext.getBean("employee",Employee.class);
		System.out.println(employee);
		String employeeName = employee.getEmployeeName();
		System.out.println(employeeName);
	//	System.out.println(bean.getEmployeeSalary());
		
	}
}
