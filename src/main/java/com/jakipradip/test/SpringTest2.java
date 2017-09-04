package com.jakipradip.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jakipradip.service.DrugService;
import com.jakipradip.service.DurgServiceImpl;
import com.jakipradip.vo.DrugVO;

public class SpringTest2 {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("SampleSpring.xml");
		DrugVO  vo = (DrugVO) context.getBean("drugVO"); //getting bean through id
		//DrugService ds = context.getBean(DurgServiceImpl.class); // getting bean with class name
		DrugService ds = context.getBean(DrugService.class); //finding bean with interface to hideimplementation
		vo = ds.orderOnline(vo);
		System.out.println(vo);
		
		((ConfigurableApplicationContext)context).close();
	}
}
