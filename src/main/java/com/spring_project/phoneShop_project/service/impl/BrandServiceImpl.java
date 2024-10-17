package com.spring_project.phoneShop_project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_project.phoneShop_project.enitity.Brand;
import com.spring_project.phoneShop_project.repository.BrandRepository;
import com.spring_project.phoneShop_project.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService{
	
	@Autowired
	private BrandRepository brandRepository;

	@Override
	public Brand create(Brand brand) {
		return brandRepository.save(brand);
	}
	
	
}
