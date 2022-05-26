package com.example.service.admin;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.dao.AgencyRepository;
import com.example.domain.AgencyVO;

@Service
public class AdminAgencyServiceImpl implements AdminAgencyService{
	
	@Autowired
	private AgencyRepository aRepo;

	
	@Override
	public List<AgencyVO> getHotelPaging(Pageable paging) {		
		return aRepo.findByAgencyCategoryNum(paging, 1);
	}
	@Override
	public int countHotelRecord() {		
		return aRepo.countHotelRecord();
	}
	
	@Override
	public List<AgencyVO> getCafetPaging(Pageable paging) {		
		return aRepo.findByAgencyCategoryNum(paging,2);
	}
	
	@Override
	public int countCafeRecord() {	
		return aRepo.countCafeRecord();
	}
	
	
	

}
