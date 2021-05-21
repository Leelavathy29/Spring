package xmlBasedInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import annotationBasedInjection.Employee;

public class SpringRunner {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Student studentBean = applicationContext.getBean("studObj", Student.class);
		System.out.println("studentBean :: " + studentBean);
	}
	
}
