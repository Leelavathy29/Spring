package demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/hello")
public class SpringRestController {
	
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String helloRequestParam(@RequestParam String name) {
		String result = "Hello Request param " + name;
		return result;
	}

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public List<String> helloExample(@PathVariable String name) {
		List<String> sampleList = new ArrayList<String>();
		sampleList.add(name);
		sampleList.add("Leela");
		sampleList.add("Arvi");
		return sampleList;
	}
	
	
	
	@RequestMapping(value = "/{name}", method = RequestMethod.POST)
	public String helloAge(@PathVariable String name) {
		String result = "Hello Post Call " + name;
		return result;
	}
	
	
}
