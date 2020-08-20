package com.example.externalapi.driver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import com.example.externalapi.model.Countries;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class DriverImpl implements Driver {
	private List<Countries> list;

	private StringBuffer response;


	@Override
	public List<Countries> getdetails() {
		try
		{
			String url = "https://corona.lmao.ninja/v2/countries";
			String convert = jsonToString(url);
			
			 ObjectMapper mapper=new ObjectMapper();
			 
			 list= mapper.readValue(convert, TypeFactory.defaultInstance().constructCollectionType(List.class, Countries.class));
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}
	
	
	private String jsonToString(String url)
	{
		try
		{
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");
			con.connect();
			int responsecode = con.getResponseCode();
			 response = new StringBuffer();
			 if(responsecode!=200)
			 {
				 throw new RuntimeException("Project not run properly");
			 }
			 
			 else
			 {
				 BufferedReader  in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				 
				 String inputline = "";
				 
				 while ((inputline = in .readLine()) != null)
				 {
					 response.append(inputline); 
				 }
				 in.close();
			 }
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return response.toString();
		
	}

}
