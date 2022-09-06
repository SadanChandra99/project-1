package com.capgemini.Mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.capgemini.entity.Address;
import com.capgemini.model.AddressModel;

@Component
public class AddressMapper {

	public Address MapModelToEntity(AddressModel addressmodel) {
		Address addressentity = new Address();
		addressentity.setPincode(addressmodel.getPincode());
		addressentity.setDoorNo(addressmodel.getDoorNo());
		addressentity.setStreet(addressmodel.getStreet());
		addressentity.setArea(addressmodel.getArea());
		addressentity.setCity(addressmodel.getCity());
		addressentity.setState(addressmodel.getState());
		
		return addressentity;
		
	}
	
	public AddressModel MapEntityToModel(Address addressentity) {
		AddressModel addressmodel = new AddressModel();
		BeanUtils.copyProperties(addressentity, addressmodel);
		return addressmodel;
	}
	
	
}
