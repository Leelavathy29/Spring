package events;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class MyContextStartEvent implements ApplicationListener<ContextStartedEvent>{

	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		String[] beanDefinitionNames = event.getApplicationContext().getBeanDefinitionNames();
		
		for(String temp : beanDefinitionNames) {
			
			System.out.println(temp);
		}
		
	}
	
	

}
