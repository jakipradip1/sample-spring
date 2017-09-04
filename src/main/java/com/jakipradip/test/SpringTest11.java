package com.jakipradip.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jakipradip.order.OrderConfig;
import com.jakipradip.order.OrderService;
import com.jakipradip.service.DrugService;
import com.jakipradip.service.DurgServiceImpl;
import com.jakipradip.vo.DrugVO;

public class SpringTest11 {
	public static void main(String[] args){
		ApplicationContext context = new AnnotationConfigApplicationContext(OrderConfig.class);
		DrugVO vo = new DrugVO();
		vo.setDurgName("TestDrug");
		
		OrderService os = context.getBean(OrderService.class);
		os.order(vo);

	}
}
