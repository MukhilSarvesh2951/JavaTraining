package com.java.layer3;

import java.util.List;

import com.java.layer2.Currency;

public interface CurrencyDAO { //CurrencyRepository

	Currency selectCurrency(int currencyId);
	List<Currency> selectAllCurrencies();
	
	void insertCurrency(Currency currency);
	void updateCurrency(Currency currency);
	void deleteCurrency(int currencyId);

}
