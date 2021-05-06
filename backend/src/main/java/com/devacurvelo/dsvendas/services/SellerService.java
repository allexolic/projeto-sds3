package com.devacurvelo.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devacurvelo.dsvendas.dto.SellerDTO;
import com.devacurvelo.dsvendas.entities.Seller;
import com.devacurvelo.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository sellerRepository;

	public List<SellerDTO> findAll(){
		List<Seller> result = sellerRepository.findAll();
		return result.stream().map(obj -> new SellerDTO(obj)).collect(Collectors.toList());
	}
}
