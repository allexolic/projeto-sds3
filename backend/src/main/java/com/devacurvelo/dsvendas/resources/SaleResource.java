package com.devacurvelo.dsvendas.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devacurvelo.dsvendas.dto.SaleDTO;
import com.devacurvelo.dsvendas.dto.SaleSuccessDTO;
import com.devacurvelo.dsvendas.dto.SaleSumDTO;
import com.devacurvelo.dsvendas.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleResource {

	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
		Page<SaleDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller(){
		List<SaleSumDTO> result = service.amountGroupedBySeller();
		return ResponseEntity.ok(result);
	}
	
	@GetMapping(value = "success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller(){
		List<SaleSuccessDTO> result = service.successGroupedBySeller();
		return ResponseEntity.ok(result);
	}
}
