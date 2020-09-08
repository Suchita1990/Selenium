package com.toolsqa.base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyword {
	public static RemoteWebDriver driver;

	public static void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchUrl() {
		driver.get("https://www.toolsqa.com/");
	}

	public static void maimizeWindow() {
		driver.manage().window().maximize();
	}

	public static void closePop_Up() {
		driver.findElement(By.xpath("//img[@class='cp-close-img lazyloading']/parent::div")).click();
	}

	public static List<String> readJsonFile(String filePATH) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object unitsObj = parser.parse(new FileReader(filePATH));
		JSONObject unitsJson = (JSONObject) unitsObj;

		List<String> expectedList = new ArrayList();

		JSONArray units = (JSONArray) unitsJson.get("Front-End Testing Automation");

		// Code for converting jsonarray to string array
		String s[] = new String[units.size()];
		for ( int i=0; i < units.size(); i++) {
			s[i] = (String) units.get(i);
		}
		// Convert String array to list of String
		for (int k = 0; k < units.size(); k++) {
			expectedList.add(k, s[k]);//append
			 System.out.println("Expected List size " +expectedList.size());
		}

		System.out.println("Expected List" +expectedList);
		return expectedList;

	}

	public static ArrayList<String> selectListValue(List<WebElement> element) {
		List<WebElement> liList = element;
		
		ArrayList<String> actualList = new ArrayList<String>();

		Iterator<WebElement> itr = liList.iterator();
		while (itr.hasNext()) 
		{
			actualList.add(itr.next().getText());
			System.out.println("Actual List size :"+ actualList.size());
		}
		System.out.println("Actual List :" + actualList);
		return actualList;
	}

}
