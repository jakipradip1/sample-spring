package com.jakipradip.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jakipradip.service.DrugService;
import com.jakipradip.service.DurgServiceImpl;
import com.jakipradip.vo.DrugVO;

public class SpringTest9 {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("SampleSpring.xml");
		DurgServiceImpl ds2 = context.getBean("ds2", DurgServiceImpl.class);
		System.out.println(ds2.getDrugContents().toString());
		System.out.println(ds2.getManufactures().toString());
		System.out.println(ds2.getContentDetails().toString());

	}
}
