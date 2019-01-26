package com.cg.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesUsingGetProperties {

	public static void main(String[] args) {
		File file= new File("resources/PersonProps.properties");
		FileInputStream inputStream=null;
		try {
			inputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties properties= new Properties();
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String name=properties.getProperty("name");
		String age=properties.getProperty("age");
		String dateOfBirth= properties.getProperty("dateOfBirth");
		String city= properties.getProperty("city");
		String qualification= properties.getProperty("qualification");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Date Of Birth : "+dateOfBirth);
		System.out.println("City : "+city);
		System.out.println("Qualification : "+qualification);

	}
}
