package advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterAspect {
	
	@After("execution(public * *.*.purchase(*))")
	public void logforIntMethod() {
		System.out.println("After : Logging the user Information.");
	}
	
	/*
	 * @After("execution(public * *.*.pur*(..))") public void
	 * logForVariableArgument() {
	 * System.out.println("After : Logging the Integer Information."); }
	 */
	
	@AfterThrowing(pointcut="execution(public * *.*.purchase(..))",
			throwing="exp")
	public void logForExceptionMethod(Exception exp) {
		System.out.println("Exception Happened : " + exp.getMessage());
		exp.printStackTrace();
		System.out.println("After throwing : Logging the information");
	}
	
	
	@AfterReturning(
		    pointcut="execution(public * *.*.intere*(..))",
		    returning="retVal" )
	public void logForAfterReturning(Object retVal) {
		System.out.println("Interest in After Returning : " + retVal);
		System.out.println("After Returning :: Logging the Variable Argument Information.");
	}
}
