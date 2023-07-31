package com.plentysweb.utilities;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Readconfig {

	Properties properties;
	String path = "C:\\Users\\840 G3\\Desktop\\New Website Automate\\Plentys\\Configuration\\config.properties";
	
	public Readconfig() {
		try {
		properties=new Properties();
		
			FileInputStream file=new FileInputStream(path);
			properties.load(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getBaseUrl() {
		String value=properties.getProperty("baseUrl");
		
		if(properties!=null) {
			return value;
			
		}
		else {
			throw new RuntimeException("url is empty");
		}
	}
		public String getBrowser() {
			String value=properties.getProperty("browser");
			
			if(properties!=null) {
				return value;
				
			}
			else {
				throw new RuntimeException("browser is empty");
			}
		
	}
	
	}
