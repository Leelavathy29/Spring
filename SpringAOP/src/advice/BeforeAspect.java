package advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class BeforeAspect {

	/*
	 * @Before("execution(public void aop.Trade.purchase())") public void
	 * logUserInfo() { System.out.println("Logging the user Information."); }
	 * 
	 * @Before("execution(public * aop.*.purchase())") public void
	 * logTransactionInfo() {
	 * System.out.println("Logging the Transaction Information."); }
	 * 
	 * @Before("execution(public * aop.*.pur*(*))") public void logForInitMethod() {
	 * System.out.println("Logging the Integer Information."); }
	 */

	@Before("allPurchase()")
	public void testPointCut() {
		System.out.println("Test Point Cut Advice on All Purchase Method ...");
	}

	@Pointcut("execution(public * *.*.purchase*(..))")
	public void allPurchase() {
		//System.out.println("Getter Logic ...");
	}

}
