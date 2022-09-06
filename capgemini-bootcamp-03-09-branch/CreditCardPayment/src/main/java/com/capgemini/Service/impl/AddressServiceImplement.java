package com.capgemini.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.Mapper.AddressMapper;
import com.capgemini.Service.AddressService;
import com.capgemini.entity.Address;
import com.capgemini.model.AddressModel;
import com.capgemini.repository.AddressRepository;

@Component
public class AddressServiceImplement implements AddressService{

	@Autowired
	private AddressMapper addressmapper;
	@Autowired
	private AddressRepository addressrepository;
	
	// ADD ADDRESS
	@Override
	public AddressModel addAddress(AddressModel addressmodel) {
		// TODO Auto-generated method stub
		Address addressentity = addressrepository.save(addressmapper.MapModelToEntity(addressmodel));
		return addressmapper.MapEntityToModel(addressentity);
	}

	// GET ADDRESS BY ID
	@Override
	public AddressModel getAddressById(int id) {
		// TODO Auto-generated method stub
		Address addressentity = addressrepository.findById(id);
				
		return addressmapper.MapEntityToModel(addressentity);
	}

	// GET ALL ADDREESES
	@Override
	public List<AddressModel> getAllAddress() {
		// TODO Auto-generated method stub
		List<AddressModel> addressmodellist = null;
		List<Address> addressentitylist = addressrepository.findAll();
		if(addressentitylist.size()>0) {
			addressmodellist = new ArrayList<>();
		}
		for(Address address: addressentitylist) {
			addressmodellist.add(addressmapper.MapEntityToModel(address));
		}
		return addressmodellist;
	}

	// UPDATE ADDRESS
	@Override
	public AddressModel updateAddress(int id, AddressModel addressmodel) {
		// TODO Auto-generated method stub
		Address addressentity = addressrepository.findById(id);
		addressentity.setDoorNo(addressmodel.getDoorNo());
		addressentity.setStreet(addressmodel.getStreet());
		addressentity.setArea(addressmodel.getArea());
		addressentity.setCity(addressmodel.getCity());
		addressentity.setState(addressmodel.getState());
		addressentity = addressrepository.save(addressentity);
		return addressmapper.MapEntityToModel(addressentity);
	}

	// DELETE ADDRESS
	@Override
	public String removeAddress(int id) {
		// TODO Auto-generated method stub
		addressrepository.deleteById(id);
		return "Address is Deleted Successfully";
	}

}
