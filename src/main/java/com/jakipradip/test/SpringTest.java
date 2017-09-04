package com.jakipradip.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jakipradip.vo.DrugVO;

public class SpringTest {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("SampleSpring.xml");
		DrugVO  vo = context.getBean("drugVO", DrugVO.class);
		System.out.println(vo);
		
		((ConfigurableApplicationContext)context).close();
		
		//inti method is called after the property value are assigned using settermethods
	}
}
