package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesReader {
	
	public Properties properties;
	
	public PropertiesReader() throws Throwable
	{
		properties=new Properties();
		FileInputStream fis=new FileInputStream("E:\\Java Programs\\CucumberHybridFM\\src\\test\\resources\\Config\\config.properties");
		properties.load(fis);
	
	}

}
