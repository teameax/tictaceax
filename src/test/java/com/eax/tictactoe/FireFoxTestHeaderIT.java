package com.eax.tictactoe;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import java.util.List;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FireFoxTestHeaderIT {
	private WebDriver driver;
  	private String baseUrl;
  	private boolean acceptNextAlert = true;
  	private StringBuffer verificationErrors = new StringBuffer();

  	/*Checks DOM elements*/

  	@Before
  	public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = System.getenv("STAGING_SERVER");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  	}

  	@Test
	public void titleShouldBeTicTacToe() throws Exception {
	    driver.get(baseUrl);
	    assertEquals("Tic-Tac-Toe", driver.getTitle());
	}

	@Test
	public void headerShouldBeTicTacToe() throws Exception {
		driver.get(baseUrl);
		WebElement h1 = driver.findElement(By.id("header"));
		assertEquals("Tic Tac Toe", h1.getText());
	}

	/*Game function test*/

	@Test
	public void numberOfCells() throws Exception {
		driver.get(baseUrl);
		List<WebElement> c = driver.findElements(By.className("unmarked"));
		assertEquals(9, c.size());
	}

	@Test
	public void clickFirstCell() throws Exception {
		driver.get(baseUrl);
		WebElement btn = driver.findElement(By.id("restart"));
		btn.click();
		WebElement cell1 = driver.findElement(By.id("1"));
		cell1.click();
		WebElement p1 = driver.findElement(By.className("marker"));
		assertEquals("X", p1.getText());
	}

	@Test
	public void clickSecondCell() throws Exception {
		driver.get(baseUrl);
		WebElement btn = driver.findElement(By.id("restart"));
		btn.click();
		WebElement cell1 = driver.findElement(By.id("1"));
		cell1.click();
		WebElement p1 = driver.findElement(By.className("marker"));
		WebElement cell2 = driver.findElement(By.id("2"));
		cell2.click();
		List<WebElement> p = driver.findElements(By.className("marker"));
		assertEquals(2, p.size());
	}

	@Test
	public void checkStateBoxWhilePlaying() throws Exception {
		driver.get(baseUrl);
		WebElement btn = driver.findElement(By.id("restart"));
		btn.click();
		WebElement cell1 = driver.findElement(By.id("4"));
		cell1.click();
		WebElement sbox = driver.findElement(By.id("state-box"));
		assertEquals("Playing...", sbox.getText());
	}

	@Test
	public void playerOneWins() throws Exception {
		driver.get(baseUrl);
		WebElement btn = driver.findElement(By.id("restart"));
		btn.click();
		WebElement cell1 = driver.findElement(By.id("8"));
		cell1.click();
		WebElement cell2 = driver.findElement(By.id("5"));
		cell2.click();
		WebElement cell3 = driver.findElement(By.id("7"));
		cell3.click();
		WebElement cell4 = driver.findElement(By.id("3"));
		cell4.click();
		WebElement cell5 = driver.findElement(By.id("6"));
		cell5.click();
		WebElement sbox = driver.findElement(By.id("state-box"));
		assertEquals("Player 1 wins", sbox.getText());
	}

	@Test
	public void playerTwoWins() throws Exception {
		driver.get(baseUrl);
		WebElement btn = driver.findElement(By.id("restart"));
		btn.click();
		WebElement cell0 = driver.findElement(By.id("8"));
		cell0.click();
		WebElement cell1 = driver.findElement(By.id("0"));
		cell1.click();
		WebElement cell2 = driver.findElement(By.id("6"));
		cell2.click();
		WebElement cell3 = driver.findElement(By.id("1"));
		cell3.click();
		WebElement cell4 = driver.findElement(By.id("3"));
		cell4.click();
		WebElement cell5 = driver.findElement(By.id("2"));
		cell5.click();
		WebElement sbox = driver.findElement(By.id("state-box"));
		assertEquals("Player 2 wins", sbox.getText());
	}



	@After
	public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	}
}