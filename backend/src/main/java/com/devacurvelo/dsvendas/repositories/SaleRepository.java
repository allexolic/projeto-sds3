package com.devacurvelo.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devacurvelo.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
