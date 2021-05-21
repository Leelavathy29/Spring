package propertyExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

		Mobile obj = (Mobile) applicationContext.getBean("samsung");
		System.out.println(obj);

		// String data = applicationContext.getMessage("model.name", args, null, null);
		// String data = applicationContext.getMessage("model.name", null, "NO DATA ",
		// Locale.US);
		// String data = applicationContext.getMessage("model.name", new Object[] {
		// "TamilNadu", "NO DATA", Locale.JAPAN);

		// System.out.println(data);
		
		
		
		

	}
}
