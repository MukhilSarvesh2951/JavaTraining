package com.java.layer3;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.java.layer2.Currency;


public class DAOImplTest {

	

	@Test
	public void testAllCurrencies()
	{
		System.out.println("started DAO testing...");
		
		CurrencyDAO currDao = new CurrencyDAOImpl();
		
	Assertions.assertTrue(currDao!=null);
		
		List<Currency> currList=currDao.selectAllCurrencies();
	Assertions.assertTrue(currList.size() > 0 );
		
		for (Currency currency : currList) {
			System.out.println("Currency : "+currency);
		}
	
	}
	
	@Test
	public void testLoadSingleCurrency()
	{
		System.out.println("started DAO testing...");
		
		CurrencyDAO currDao = new CurrencyDAOImpl();
		
	Assertions.assertTrue(currDao!=null);
		
		Currency curr=currDao.selectCurrency(1);
	Assertions.assertTrue(curr!=null );
		
		System.out.println("Currency : "+curr);
	
	}
	
	@Test
	public void testAddSingleCurrency()
	{
		System.out.println("started DAO testing...");
		
		CurrencyDAO currDao = new CurrencyDAOImpl();	
	Assertions.assertTrue(currDao!=null);
		
		Currency curr=new Currency();
	Assertions.assertTrue(curr!=null);
	
		curr.setCurrencyId(4);
		curr.setSourceCurrency("INR");
		curr.setTargetCurrency("NEP");
		curr.setLoadFactor(500);
		
		System.out.println("Currency : "+curr);
		currDao.insertCurrency(curr);
		System.out.println("Currency added....");
	}
	
	@Test
	public void testUpdateSingleCurrency()
	{
		System.out.println("started DAO testing...");
		
		CurrencyDAO currDao = new CurrencyDAOImpl();	
	Assertions.assertTrue(currDao!=null);
		
		Currency curr=new Currency();
	Assertions.assertTrue(curr!=null);
	
		curr.setCurrencyId(4);
		curr.setSourceCurrency("India");
		curr.setTargetCurrency("Nepal");
		curr.setLoadFactor(555);
		
		System.out.println("Currency : "+curr);
		currDao.updateCurrency(curr);
		System.out.println("Currency updated....");
	}
	
	@Test
	public void testDeleteSingleCurrency()
	{
		System.out.println("started DAO testing...");
		
		CurrencyDAO currDao = new CurrencyDAOImpl();	
	Assertions.assertTrue(currDao!=null);
		
		currDao.deleteCurrency(4);
		System.out.println	("Currency deleted....");
	}

}
