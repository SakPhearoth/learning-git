package com.spring_project.phoneShop_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring_project.phoneShop_project.enitity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {

}
