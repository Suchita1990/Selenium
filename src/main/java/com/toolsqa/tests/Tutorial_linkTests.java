package com.toolsqa.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.toolsqa.base.Keyword;
import com.toosqa.screens.Tutorial_linkOnHomepage;

public class Tutorial_linkTests {
	@Test
    public void tc_01() throws FileNotFoundException, IOException, ParseException {
      Keyword.openBrowser();
      Keyword.launchUrl();
      Keyword.maimizeWindow();
   //   Keyword.closePop_Up();
      
      Tutorial_linkOnHomepage tl=new Tutorial_linkOnHomepage();
      tl.clickOnTutoriallink();
    }

	@Test(dependsOnMethods= {"tc_01"})
	public void tc_02() throws InterruptedException, FileNotFoundException, IOException, ParseException{
		
		Thread.sleep(20000);
		List<String> expected=Keyword.readJsonFile("E:\\Eclipse Workspace\\HBDFramework\\src\\main\\resources\\TutorialTopics.json");
	//	System.out.println(expected);
		
	//	List<String> actual=Keyword.listValueSelect("XPATH", "//nav/ul/li/ul/li/a/span/span[text()='Front-End Testing Automation']");
	//	System.out.println(actual);
		
	 //  Assert.assertEquals(actual, expected);
	    
	}
	
}
