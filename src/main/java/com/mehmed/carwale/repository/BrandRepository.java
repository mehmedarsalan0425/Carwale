package com.mehmed.carwale.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mehmed.carwale.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer>{

}
