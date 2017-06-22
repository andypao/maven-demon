package test;

import java.io.IOException;
import org.testng.annotations.Test;
import driver.manageWebDriver;
import org.testng.Assert;

public class mainTest extends manageWebDriver {
	
	@Test	
	public void sampleRunToFail() throws IOException{
		navigateTo("https://es.wikipedia.org/wiki/Wikipedia:Portada");
		sendText("//*[@name='search']","test");
		click("//*[@id='searchButton']");
		String text = getText("//a[contains(.,'examen')]");
		Assert.assertEquals(text, "bad input","test string does not display properly");
	}
	
	@Test	
	public void sampleRunToPass() throws IOException{
		navigateTo("https://es.wikipedia.org/wiki/Wikipedia:Portada");
		sendText("//*[@name='search']","test");
		click("//*[@id='searchButton']");
		String text = getText("//a[contains(.,'examen')]");
		Assert.assertEquals(text, "examen","test string is displays properly");
	}
	

}
