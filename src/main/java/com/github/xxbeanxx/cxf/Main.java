package com.github.xxbeanxx.cxf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.webservicex.GlobalWeatherSoap;

/**
 * @author Greg Baker
 */
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		final ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/spring.xml");
		
		final GlobalWeatherSoap globalWeatherSoap = applicationContext.getBean(GlobalWeatherSoap.class);
		final String cities = globalWeatherSoap.getCitiesByCountry("canada");
		
		System.out.println(cities);
	}
	
}
