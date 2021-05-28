package advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BeforeAspect {
	
	@Before("execution(public void aop.Trade.purchase())")
	public void logUserInfo() {
		System.out.println("Logging the user Information.");
	}
	

}
