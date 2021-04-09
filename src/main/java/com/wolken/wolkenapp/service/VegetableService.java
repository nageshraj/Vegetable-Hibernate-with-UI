package com.wolken.wolkenapp.service;

import java.util.List;

import com.wolken.wolkenapp.DTO.VegetableDTO;

public interface VegetableService {
	
	public void validateAndAddVegetable(VegetableDTO vegetableDTO);
	
	public void validateAndUpdateNameById(int vegetableIdToUpdate, String vegetableName);
	
	public void validateAndDeleteById(int vegetableIdToDelete);
	
	public List<VegetableDTO> validateAndGetAll();

}
