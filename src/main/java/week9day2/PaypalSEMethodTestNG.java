package week9day2;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import week6day1.ProjectMethod1;

public class PaypalSEMethodTestNG extends ProjectMethod1{
	@Test
	public void paypalSEMethod() throws InterruptedException {

		WebElement signUp = locateElement("signup-button");
		click(signUp);

		WebElement radioButton = locateElement("id", "radio-personal");

		boolean selected = verifySelected(radioButton);
		if(!selected)
			click(radioButton);
		else System.out.println("Shoppers radio button selected");		

		WebElement nextButton = locateElement("link", "Next");
		click(nextButton);

		WebElement country = locateElement("id","country");
		selectDropDownUsingText(country, "India");

		WebElement email = locateElement("id", "email");
		type(email, "mailtoravi@mailinator.com");

		WebElement password = locateElement("id", "password");
		type(password, "Raviprasath@12");

		WebElement rePassword = locateElement("id", "confirmPassword");
		type(rePassword, "Raviprasath@12");

		WebElement conti = locateElement("id", "_eventId_personal");
		click(conti);

		Thread.sleep(2000);

	}

}