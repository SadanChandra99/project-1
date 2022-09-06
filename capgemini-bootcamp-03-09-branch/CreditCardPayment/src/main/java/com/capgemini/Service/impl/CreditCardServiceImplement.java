package com.capgemini.Service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.Mapper.CreditCardMapper;
import com.capgemini.Service.CreditCardService;
import com.capgemini.entity.CreditCard;
import com.capgemini.model.CreditCardModel;
import com.capgemini.repository.CreditCardRepository;

@Component
public class CreditCardServiceImplement implements CreditCardService {

	@Autowired
	private CreditCardMapper creditcardmapper;
	@Autowired
	private CreditCardRepository creditcardrepository;
						
						// ADD CREDIT CARD
	@Override
	public CreditCardModel addCreditCard(CreditCardModel creditcardmodel) {
		// TODO Auto-generated method stub
		CreditCard creditacrdentity = creditcardrepository.save(creditcardmapper.MapModelToEntity(creditcardmodel));
				
		return creditcardmapper.MapEntityToModel(creditacrdentity);
	}
						// GET CREDIT CARD BY ID
	@Override
	public CreditCardModel getCreditCardById(long id) {
		// TODO Auto-generated method stub
		CreditCard creditcardentitygetbyid = creditcardrepository.findById(id);
		CreditCardModel creditcardmodelgetbyid = creditcardmapper.MapEntityToModel(creditcardentitygetbyid);
				
		return creditcardmodelgetbyid;
	}
						// UPDATE CREDIT CARD
	@Override
	public CreditCardModel updateCreditCard(long id, CreditCardModel creditcardmodel) {
		// TODO Auto-generated method stub
		CreditCard creditcardentity = creditcardrepository.findById(id);
		creditcardentity.setCardType(creditcardmodel.getCardType());
		creditcardentity.setBankName(creditcardmodel.getBankName());
		creditcardentity.setCardName(creditcardmodel.getCardName());
		creditcardentity.setCardNumber(creditcardmodel.getCardNumber());
		creditcardentity.setExpiryDate(creditcardmodel.getExpiryDate());
		creditcardentity = creditcardrepository.save(creditcardentity);
		return creditcardmapper.MapEntityToModel(creditcardentity);
	}
						
						// GET ALL CREDIT CARDS
	@Override
	public List<CreditCardModel> getAllCreditCards() {
		// TODO Auto-generated method stub
		List<CreditCardModel> creditcardmodellist = null;
		List<CreditCard> creditcardentitylist = creditcardrepository.findAll();
		if(creditcardentitylist.size()>0) {
			creditcardmodellist = new ArrayList<>();
		}
		for(CreditCard creditcard: creditcardentitylist) {
			creditcardmodellist.add(creditcardmapper.MapEntityToModel(creditcard));
		}
		return creditcardmodellist;
	}

						// DELETE CREDIT CARD BY ID
	@Override
	public String removeCreditCard(long id) {
		// TODO Auto-generated method stub
		creditcardrepository.deleteById(id);
		return "CreditCard Deleted Successfully";
	}

}
