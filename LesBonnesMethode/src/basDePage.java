import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class basDePage {
	
	Commun ObjetCommun = new Commun ();
	
	public void testBasDePage (WebDriver driver) throws InterruptedException {
		
		WebElement lienAboutSAPCommerceCloud = driver.findElement(By.xpath("//A[@role='link']"));
		
        ObjetCommun.VerificationAffichageElement(lienAboutSAPCommerceCloud);
		
		if (ObjetCommun.VerificationBeforeUseElement(lienAboutSAPCommerceCloud)) {
			
			lienAboutSAPCommerceCloud.click();
		}
		else 
		{
			System.out.println("on ne peut pas utilier le lien ");
		}
		
		//Thread.sleep(2000);
		
		//driver.navigate().back();
	
		
}
}	
