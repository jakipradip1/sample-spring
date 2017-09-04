package com.jakipradip.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jakipradip.service.DrugService;
import com.jakipradip.service.DurgServiceImpl;
import com.jakipradip.vo.DrugVO;

public class SpringTest8 {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("SampleSpring.xml");
		DrugVO drug = context.getBean("drugVOCon", DrugVO.class);
		DrugVO drug1 = context.getBean("drugVOCon1", DrugVO.class);
		System.out.println(drug.toString());
		System.out.println(drug1.toString());

	}
}
