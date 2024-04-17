package com.example.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SeleniumApplicationTests {

	@Test
	void contextLoads() {

		System.setProperty(webdriver.gecko.driver, "src/main/resources/geckodriver");

		WebDriver driver = new FirefoxDriver();

try {
	driver.get("http://www.wikipedia.org/");

	webElement searchInput = driver.findElement(By.id("searchInput"));
	searchInput.sendKeys("Monthy");
	searchInput.sendKeys("Python");
	searchInput.submit();
//		hacer el manejjo de esta excepcion que sucede porque el tiempo de espera es muy corto
	Thread.sleep(5000);

	string pageTitle = driver.getTitle();

	if(pageTitle.contains("Monthy Python ")) {
		System.out.println("The Page is correctly");
	} else {
		System.out.println("The page doesnt work correctly");
	}
} finally {
	driver.quit();
}

		driver.quit();
	}

}
