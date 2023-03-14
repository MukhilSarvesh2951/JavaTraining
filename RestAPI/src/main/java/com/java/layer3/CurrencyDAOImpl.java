package com.java.layer3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.java.layer2.Currency;


public class CurrencyDAOImpl implements CurrencyDAO {

	Connection conn;

	public CurrencyDAOImpl() {
			try {
				System.out.println("Trying to load the driver...");
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				System.out.println("1. driver...loaded");
				System.out.println("Trying to connect to the DB...");
				this.conn = DriverManager.getConnection("jdbc:mysql://localhost/mysql", "root", "root123");
				System.out.println("2. Connected to the DB :" + conn);
			} catch (SQLException e) {e.printStackTrace();}
	}

	@Override
	public Currency selectCurrency(int currencyId) {
		// TODO Auto-generated method stub
		Currency currency = null; //make a blank currency object

		try {
			Statement statement = conn.createStatement();
			System.out.println("3. Statement created....");
			ResultSet result = statement.executeQuery("SELECT * FROM currency where currencyId="+currencyId); //eid, ename, job, sal    cid,cname,city,pin
			System.out.println("4. execute the query");

			System.out.println("5. acquire the result and process it");

			if (result.next()) {
				currency = new Currency();
				currency.setCurrencyId(result.getInt(1)); //fill it up column wise
				currency.setSourceCurrency(result.getString(2));
				currency.setTargetCurrency(result.getString(3));
				currency.setLoadFactor(result.getFloat(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return currency;
	}

	@Override
	public List<Currency> selectAllCurrencies() {
		List<Currency> currencyList = new ArrayList<Currency>();//blank list
		
		try {
			Statement statement = conn.createStatement();
			System.out.println("3. Statement created....");
			ResultSet result = statement.executeQuery("SELECT * FROM currency"); //eid, ename, job, sal    cid,cname,city,pin
			System.out.println("4. execute the query");

			System.out.println("5. acquire the result and process it");

			while (result.next()) {
				Currency currency = new Currency(); //make a blank currency object
				currency.setCurrencyId(result.getInt(1)); //fill it up column wise
				currency.setSourceCurrency(result.getString(2));
				currency.setTargetCurrency(result.getString(3));
				currency.setLoadFactor(result.getFloat(4));
				currencyList.add(currency); //push this object in the list
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return currencyList;
	}

	@Override
	public void insertCurrency(Currency currency) {
		try {
			PreparedStatement pst = conn.prepareStatement("insert into currency values(?,?,?,?)");
			System.out.println("3. PreparedStatement created....");

			
			pst.setInt(1, currency.getCurrencyId());
			pst.setString(2, currency.getSourceCurrency());
			pst.setString(3, currency.getTargetCurrency());
			
			pst.setFloat(4, currency.getLoadFactor());

			int rows = pst.executeUpdate(); //run the insert query
			
			System.out.println("4. executed the insert query : "+rows+ " row(s) updated");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void updateCurrency(Currency currency) {
		try {
			PreparedStatement pst = conn.prepareStatement("UPDATE CURRENCY set source_currency=?, target_currency=?, load_factor=? where currencyId=?");
			System.out.println("3. PreparedStatement created....");

			pst.setString(1, currency.getSourceCurrency());
			pst.setString(2, currency.getTargetCurrency());
			pst.setFloat(3, currency.getLoadFactor());
			
			pst.setInt(4, currency.getCurrencyId());


			int rows = pst.executeUpdate(); //run the insert query
			
			System.out.println("4. executed the update query : "+rows+ " row(s) updated");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void deleteCurrency(int currencyId) {
		try {
			PreparedStatement pst = conn.prepareStatement("DELETE FROM CURRENCY  where currencyId=?");
			System.out.println("3. PreparedStatement created....");

			pst.setInt(1, currencyId);
			
			int rows = pst.executeUpdate(); //run the insert query
			
			System.out.println("4. executed the delete query : "+rows+ " row(s) updated");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
