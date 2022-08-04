package objectPage;

import org.openqa.selenium.WebDriver;

import reusableComponents.Helper;
import sourceUI.BounceLogoUI;

public class BounceLogo {

	WebDriver driver;

	public BounceLogo(WebDriver driver) {
		this.driver = driver;

	}

	Helper help = new Helper();
	BounceLogoUI bl = new BounceLogoUI();
	
	public void bouncelogo() {
		help.click(bl.bouncelogo);
		help.click(bl.drying);
	}

}
