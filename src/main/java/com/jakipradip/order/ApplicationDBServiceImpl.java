package com.jakipradip.order;

import org.springframework.stereotype.Component;

import com.jakipradip.vo.DrugVO;

@Component
public class ApplicationDBServiceImpl implements DBService {

	public void save(DrugVO durgVO) {
		durgVO.setDrugId(new Long(400));

	}

}
