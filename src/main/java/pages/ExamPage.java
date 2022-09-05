package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class ExamPage {

	WebDriver driver;

	public void setSkyBluePage() {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//button[contains(text(), 'Set SkyBlue Background')]")
	WebElement SkyBlueButton;
	@FindBy(how = How.XPATH, using = "//button[text()='Set White Background']")
	WebElement WhiteButton;

	public void changeBackground() {
		SkyBlueButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WhiteButton.click();
	}

}
