package com.devacurvelo.dsvendas.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devacurvelo.dsvendas.dto.SellerDTO;
import com.devacurvelo.dsvendas.services.SellerService;

@RestController
@RequestMapping(value = "/sellers")
public class SellerResource {

	@Autowired
	private SellerService sellerService;
	
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> getAll(){
		List<SellerDTO> list = sellerService.findAll();		
		return ResponseEntity.ok(list);
	}
	
}
