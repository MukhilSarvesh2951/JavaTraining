package com.java.layer5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.java.layer2.Currency;
import com.java.layer4.CurrencyService;
import com.java.layer4.CurrencyServiceImpl;

//			project folder-----><-web.xml
// http://localhost:port/RestAPI/rest/  currency/greet
/*
 * virtual tree structure of huge resources
 * 
 * RestAPI
 *   |
 * 	ds <-- web.xml level
 * 	 |
 * 	  rest <-- web.xml level
 * 		  |
 * 		-------------------
 * 		|		|		|
 * 		paris	pune	bengaluru <-- class level
 * 		|		|		|
 * 		greet	greet	greet <-- method level
 * 
 * 
 *  http://ip:port/RestAPI/ds/rest/bengaluru/greet
 *  http://ip:port/RestAPI/ds/rest/pune/greet
 *  http://ip:port/RestAPI/ds/rest/paris/greet

 * 
 */
//layer 5


@Path("/currency")
public class CurrencyController {
	// global list
	static List<Currency> currList = new ArrayList<Currency>();
	static {
		System.out.println("Inokved only ONCE in the life time...");
		Currency curr1 = new Currency();
		curr1.setLoadFactor(1);
		curr1.setSourceCurrency("USD");
		curr1.setTargetCurrency("INR");
		curr1.setLoadFactor(0.0125f);
		
		Currency curr2 = new Currency();
		curr2.setLoadFactor(2);
		curr2.setSourceCurrency("EUR");
		curr2.setTargetCurrency("INR");
		curr2.setLoadFactor(0.011f);
		
		Currency curr3 = new Currency();
		curr3.setLoadFactor(3);
		curr3.setSourceCurrency("DIN");
		curr3.setTargetCurrency("INR");
		curr3.setLoadFactor(0.0039f);
		currList.add(curr1);
		currList.add(curr2);
		currList.add(curr3);
	}

	public CurrencyController() {
		System.out.println("Currency Service called...");
	}

	// http://ip:port/RestAPI/rest/currency/delete/3
	@DELETE
	@Path("/delete/{cid}")
	public String deleteIt(@PathParam("cid") int x) {
		boolean found = false;
		Currency curr = null;
		for (Currency currency : currList) {
			if (currency.getCurrencyId() == x) {
				curr = currency;
				currList.remove(curr);
				found = true;
				break;
			}
		}
		if (found == true)
			return "Currency deleted";
		else
			return "Currency Not Found :" + x;
	}

	// http://ip:port/RestAPI/rest/currency/add
	@POST
	@Path("/add")
	public String addIt(Currency currObj) {
		boolean found = false;
		Currency curr = null;
		for (Currency currency : currList) {
			if (currency.getCurrencyId() == currObj.getCurrencyId()) {
				found = true;
				break;
			}
		}
		if (found == true)
			return "Currency already exists";
		else {
			currList.add(currObj);
			return "currency added";
		}
	}

	// http://ip:port/RestAPI/rest/currency/update
	@PUT
	@Path("/update")
	public String modifyIt(Currency currObj) {
		boolean found = false;
		Currency curr = null;
		for (Currency currency : currList) {
			if (currency.getCurrencyId() == currObj.getCurrencyId()) {
				found = true;
				currList.remove(currency);
				break;
			}
		}
		if (found == true) {
			currList.add(currObj);
			return "Currency modified";
		} else {

			return "Currency not found";
		}
	}

	// PROJECT/web.xml/class/method
	// http://localhost:port/RestAPI/rest/currency/greet
	@GET
	@Path("/greet") // action mappings
	public String welcome() {
		return "<h1> Welcome to Web Based Services </h1>";
	}

	// http://ip:port/RestAPI/rest/currency/convert/3
	@GET
	@Path("/convert/{cid}")
	@Produces(MediaType.APPLICATION_JSON)
	public Currency convertIt(@PathParam("cid") int x) {

		Currency curr = null;
		for (Currency currency : currList) {
			if (currency.getCurrencyId() == x) {
				curr = currency;
			}
		}
		return curr;
	}

	@GET
	@Path("/converts")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Currency> convertAll() {

		return currList;
	}

}
