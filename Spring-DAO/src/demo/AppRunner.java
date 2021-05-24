package demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRunner {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		context.start();
		// Region region = context.getBean("region", Region.class);

		// RegionDAO regionDAO = context.getBean("regDAO", RegionDAO.class);

		// regionDAO.insertRegionInfo(region);

		System.out.println("Inserted Successfully !!");
	}
}
