package com.jakipradip.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jakipradip.vo.DrugVO;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private DBService dbService;
	
	public void order(DrugVO drugVO) {
		dbService.save(drugVO);
		System.out.println(drugVO);	
	}
}
