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
import com.java.layer4.CurrencyNotFoundException;
import com.java.layer4.CurrencyService;
import com.java.layer4.CurrencyServiceImpl;
import com.java.layer4.SourceCurrencyNotFoundException;
import com.java.layer4.TargetCurrencyNotFoundException;

//layer 5
@Path("/currencydb") 
public class CurrencyDBController {	
	CurrencyService currencyService = new CurrencyServiceImpl();
	
	public CurrencyDBController() { System.out.println("Currency Service called...");}

	// http://ip:port/RestAPI/rest/currencydb/convert/INR/USD/5000
	@GET
	@Path("/convert/{src}/{trg}/{amt}")
	public double convertIt(@PathParam("src") String source, @PathParam("trg") String target, @PathParam("amt")  float amountToConvert) {
		double amt=0;
		try {
			amt = currencyService.calculateCurrencyService(source, target, amountToConvert);
		} 
		catch (CurrencyNotFoundException e) {e.printStackTrace();} 
		catch (SourceCurrencyNotFoundException e) {e.printStackTrace();}
		catch (TargetCurrencyNotFoundException e) {e.printStackTrace();}
		return amt;
	}
	/*
	@DELETE @Path("/delete/{cid}")
	public String deleteIt(@PathParam("cid") int x) {
		boolean found=false;Currency curr=null;
		for (Currency currency : currList) {
			if(currency.getCurrencyId() == x) {
				curr= currency;currList.remove(curr);found=true;break;
			}
		}
		if(found==true) return "Currency deleted";
		else return "Currency Not Found :"+x;
	}
	
	// http://ip:port/RestAPI/rest/currency/add
	@POST @Path("/add")
	public String addIt(Currency currObj) {
		boolean found=false;Currency curr=null;
		for (Currency currency : currList) {
			if(currency.getCurrencyId() == currObj.getCurrencyId()) {
				found=true; break;}
		}
		if(found==true) return "Currency already exists";
		else { currList.add(currObj);
			return "currency added";
		}
	}
	
	// http://ip:port/RestAPI/rest/currency/update
	@PUT @Path("/update")
	public String modifyIt(Currency currObj) {
		boolean found=false;Currency curr=null;
		for (Currency currency : currList) {
			if(currency.getCurrencyId() == currObj.getCurrencyId()) {
				found=true; 
				currList.remove(currency);
				break;
			}
		}
		if(found==true)  { 
			currList.add(currObj);
			return "Currency modified";
		}
		else { 
			
			return "Currency not found";
		}
	}
	
					       //PROJECT/web.xml/class/method
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
		
		Currency curr=null;
		for (Currency currency : currList) {
			if(currency.getCurrencyId() == x) {
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
	*/

	
}