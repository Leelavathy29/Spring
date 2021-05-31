package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppRunner {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	    Trade  trade = context.getBean("mf",Trade.class);
	   // System.out.println("trade ::" + trade);
	    trade.purchase();
	    trade.purchase(200);
	    trade.purchase(1000, 200);
	    //double interest = trade.interestCalculation(1000,6,5.4F);
	    //System.out.println("Interest : " + interest);

	}
	
	
}
 