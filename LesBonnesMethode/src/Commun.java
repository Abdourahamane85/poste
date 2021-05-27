import org.openqa.selenium.WebElement;

public class Commun {
	
	public String UrlPoste = "https://jsapps.c4a0pho0ft-laposteaz1-s1-public.model-t.cc.commerce.ondemand.com/";

	public void VerificationAffichageElement (WebElement monElement) {
		
		boolean ResultatAffichage = monElement.isDisplayed() ;
		
		if (ResultatAffichage == true) {
			
		System.out.println("l'element" +monElement + "est bien Affiché"  );
		}
		else
		{
			System.out.println("l'element" +monElement + "n'est pas affiché"  );
		}
	}
	
public boolean VerificationBeforeUseElement (WebElement monElement) {
		
		return monElement.isDisplayed();
	}
}

//driver.navigate().back();
	
		
		
		
	/*driver.findElement(By.xpath("//cx-icon[@class='cx-icon fas fa-angle-down']")).click();
		//driver.navigate().back();
		driver.findElement(By.xpath("//H5[@aria-label='Digital Cameras']")).click();
		driver.findElement(By.xpath("//A[@role='link']")).click();// film camera
		driver.findElement(By.xpath("//A[@role='link']")).click();
		driver.findElement(By.xpath("//A[@role='link']")).click();
		driver.findElement(By.xpath("//H5[@aria-label='Camera Accessories & Supplies']")).click();
		
	
			
		


		driver.findElement(By.xpath("//INPUT[@aria-label='search']")).click();// rechercher
		
		
	
	*/