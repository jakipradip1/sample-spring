package com.jakipradip.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jakipradip.service.DrugService;
import com.jakipradip.service.DurgServiceImpl;
import com.jakipradip.vo.DrugVO;

public class SpringTest4 {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("SampleSpring.xml");
		DurgServiceImpl ds = context.getBean("ds1", DurgServiceImpl.class); //finding bean with interface to hideimplementation
		DurgServiceImpl ds1 =  context.getBean("ds1", DurgServiceImpl.class); //finding bean with interface to hideimplementation

		ds.setManufacturer("Galaxco");
		System.out.println("Object 1: " +ds.getManufacturer());
		
		System.out.println("Object 2: " + ds1.getManufacturer()); //setting scope=prototype for breaking singleton
		//by default bean are singleton
	}
}
