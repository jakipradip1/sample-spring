package com.jakipradip.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jakipradip.service.DrugService;
import com.jakipradip.service.DurgServiceImpl;
import com.jakipradip.vo.DrugVO;

public class SpringTest3 {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("SampleSpring.xml");
		DrugService ds = context.getBean(DrugService.class); //finding bean with interface to hideimplementation
		System.out.println(ds.getDummyDrug()); //dependency injection///inserting dependency at runtime
		
		((ConfigurableApplicationContext)context).close(); // calling destroy method
	}
}
