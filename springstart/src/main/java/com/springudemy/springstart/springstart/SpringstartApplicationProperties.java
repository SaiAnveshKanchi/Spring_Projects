package com.springudemy.springstart.springstart;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.springudemy.springstart.springstart.basic.BinarySearchImpl;
import com.springudemy.springstart.springstart.properties.SomeExternalService;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringstartApplicationProperties {

	public static void main(String[] args) {
		
		
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringstartApplicationProperties.class);
		SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);
		
		System.out.println(someExternalService.returnServiceURL());
		
		applicationContext.close();
	}

}
