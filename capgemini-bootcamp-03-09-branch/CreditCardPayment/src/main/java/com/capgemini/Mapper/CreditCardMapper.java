package com.capgemini.Mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.capgemini.entity.CreditCard;
import com.capgemini.model.CreditCardModel;

@Component
public class CreditCardMapper {
	
	public CreditCard MapModelToEntity(CreditCardModel creditcardmodel) {
		CreditCard creditcardentity =  new CreditCard();
		creditcardentity.setId(creditcardmodel.getId());
		creditcardentity.setCardName(creditcardmodel.getCardName());
		creditcardentity.setCardNumber(creditcardmodel.getCardNumber());
		creditcardentity.setCardType(creditcardmodel.getCardType());
		creditcardentity.setBankName(creditcardmodel.getBankName());
		creditcardentity.setExpiryDate(creditcardmodel.getExpiryDate());
		return creditcardentity;
	}

	public CreditCardModel MapEntityToModel(CreditCard creditcardentity) {
		CreditCardModel creditcardmodel = new CreditCardModel();
		BeanUtils.copyProperties(creditcardentity, creditcardmodel);
		return creditcardmodel;
	}
	
}
