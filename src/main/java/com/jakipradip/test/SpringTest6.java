package com.jakipradip.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jakipradip.service.AbstractService;
import com.jakipradip.service.DrugService;
import com.jakipradip.service.DurgServiceImpl;
import com.jakipradip.vo.DrugVO;
//will throw an error coz trying to create a bean of abstract object
public class SpringTest6 {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("SampleSpring.xml");
		AbstractService ds = context.getBean("abstract1", AbstractService.class); //finding bean with interface to hideimplementation
	
		
		System.out.println("Object 2: " + ds.getManufacturer()); //setting scope=prototype for breaking singleton
		//by default bean are singleton
	}
}
