package advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AroundAspect {

	@Around("execution(public * *.*.*(..))")
	public Object logAndHandleUserValues(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Around Advice ...");

		Object[] args = pjp.getArgs();

		/*
		 * boolean isPandemic = true; if (isPandemic) {
		 * 
		 * args[0] = 1000; args[1] = 12;
		 * 
		 * args[2] = 4.3F; }
		 */

		Object resultObj = pjp.proceed(args);

		return resultObj;
	}

}
