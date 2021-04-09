package com.wolken.wolkenapp.service;

import java.util.List;

import com.wolken.wolkenapp.DAO.VegetableDAO;
import com.wolken.wolkenapp.DAO.VegetableDAOImpl;
import com.wolken.wolkenapp.DTO.VegetableDTO;

public class VegetableServiceImpl implements VegetableService {
	
	VegetableDAO vegetableDAO =  new VegetableDAOImpl(); 

	@Override
	public void validateAndAddVegetable(VegetableDTO vegetableDTO) {
		// TODO Auto-generated method stub
		vegetableDAO.addVegetable(vegetableDTO);
	}

	@Override
	public void validateAndUpdateNameById(int vegetableIdToUpdate,String vegetableNameToBeUpdated) {
		// TODO Auto-generated method stub
		vegetableDAO.updateVegetableNameById(vegetableIdToUpdate, vegetableNameToBeUpdated);
		
		
	}

	@Override
	public void validateAndDeleteById(int vegetableIdToDelete) {
		// TODO Auto-generated method stub
		vegetableDAO.DeleteVegetableById(vegetableIdToDelete);
		
	}

	@Override
	public List<VegetableDTO> validateAndGetAll() {

		return vegetableDAO.getAllVegetable();
		
	}

}
