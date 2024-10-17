package com.spring_project.phoneShop_project.service.util;

import com.spring_project.phoneShop_project.dto.BrandDTO;
import com.spring_project.phoneShop_project.enitity.Brand;

public class Mapper {
	public static Brand toBrand(BrandDTO dto) {
		Brand brand = new Brand();
		brand.setId(dto.getId());
		brand.setName(dto.getName());
		return brand;
		
	}
	
	
	//if only want to post only name by api
//	public static Brand toBrand(BrandDTO dto) {
//		Brand brand = new Brand();
//		brand.setName(dto.getName());
//		return brand;
//	}
//	
//	public static BrandDTO toBrandDTO(Brand brand) {
//		BrandDTO brandDTO = new BrandDTO();
//		brandDTO.setName(brand.getName());
//		return brandDTO;
//	}
}
