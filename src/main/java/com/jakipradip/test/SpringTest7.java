package com.jakipradip.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jakipradip.service.DrugService;
import com.jakipradip.service.DurgServiceImpl;
import com.jakipradip.vo.DrugVO;

public class SpringTest7 {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("SampleSpring.xml");
		DrugVO drug = new DrugVO();
		drug.setDurgName("Test Drug");
		DurgServiceImpl ds = context.getBean("ds1", DurgServiceImpl.class); //finding bean with interface to hideimplementation
		DurgServiceImpl ds1 =  context.getBean("ds2", DurgServiceImpl.class); //finding bean with interface to hideimplementation
		DrugVO result = ds.orderOnline(drug);
		System.out.println("Object 1: " +ds.getManufacturer());
		DrugVO result1 = ds1.orderOnline(drug);

		System.out.println("Object 2: " + ds1.getManufacturer()); //setting scope=prototype for breaking singleton
		//by default bean are singleton
	}
}
