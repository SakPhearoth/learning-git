package com.spring_project.phoneShop_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring_project.phoneShop_project.dto.BrandDTO;
import com.spring_project.phoneShop_project.enitity.Brand;
import com.spring_project.phoneShop_project.service.BrandService;
import com.spring_project.phoneShop_project.service.util.Mapper;

@RestController
@RequestMapping("brands")
public class BrandController {
	
	@Autowired
	private BrandService brandService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> create(@RequestBody BrandDTO brandDTO){
		Brand brand = Mapper.toBrand(brandDTO);
		brand = brandService.create(brand);
		return ResponseEntity.ok(brand);
		//if only want to post only name by api
//		return ResponseEntity.ok(Mapper.toBrandDTO(brand));
		
	}
}
