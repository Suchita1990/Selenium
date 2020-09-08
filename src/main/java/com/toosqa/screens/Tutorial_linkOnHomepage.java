package com.toosqa.screens;

import org.openqa.selenium.By;


import com.toolsqa.base.Keyword;
// We put here locator whatever we want for link
public class Tutorial_linkOnHomepage {
	By tutorial=By.xpath("//nav/ul/li/a/span/span[text()='Tutorial']");
	
	public void clickOnTutoriallink() {
		Keyword.driver.findElement(tutorial).click();
	}

}
