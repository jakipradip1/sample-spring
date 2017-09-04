package com.jakipradip.service;

import java.util.List;

import com.jakipradip.vo.DrugVO;

public interface DrugService {
	DrugVO findDrugById(final Long durgId);
	DrugVO orderOnline(final DrugVO vo);
	List<DrugVO> serach(final String durgName);
	DrugVO getDummyDrug();
}
