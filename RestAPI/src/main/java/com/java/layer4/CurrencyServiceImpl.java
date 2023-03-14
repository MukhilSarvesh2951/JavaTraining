package com.java.layer4;

import java.util.List;

import com.java.layer2.Currency;
import com.java.layer3.CurrencyDAO;
import com.java.layer3.CurrencyDAOImpl;

public class CurrencyServiceImpl implements CurrencyService {

	CurrencyDAO currDao = new CurrencyDAOImpl();
	
	@Override								//   USD	INR		5000
	public float calculateCurrencyService(String s, String t, float amt) throws CurrencyNotFoundException,SourceCurrencyNotFoundException, TargetCurrencyNotFoundException
	{

		List<Currency> listCurrencies = currDao.selectAllCurrencies();
		
		boolean currencyFound=false;
		
		float calculatedAmount=0;
		
		for (Currency currency : listCurrencies) {
			System.out.println("=>Currency : "+currency);
			if(currency.getSourceCurrency().equals(s) && currency.getTargetCurrency().equals(t) ) {
					float currentLoadFactor = currency.getLoadFactor();
					calculatedAmount = amt * currentLoadFactor;		
					currencyFound=true;
					break;
			} else {
				currencyFound=false;
			}
		}
	
		if(currencyFound==false) {
			throw new CurrencyNotFoundException("Currency not found");
		}
		return calculatedAmount;
	}

	

}
