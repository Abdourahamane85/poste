import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class hautDePage {
	//WebDriver driver = new ChromeDriver ();
	Commun ObjetCommun = new Commun ();
	
	
	
	public void testHautDePage (WebDriver driver) throws InterruptedException {
		
		WebElement lienFindAStore = driver.findElement(By.xpath("//a[@href='/store-finder']"));
	

		ObjetCommun.VerificationAffichageElement(lienFindAStore);
		
		if (ObjetCommun.VerificationBeforeUseElement(lienFindAStore)) {
			
			lienFindAStore.click();
		}
		else 
		{
			System.out.println("on ne peut pas utilier le lien ");
		}
		
		Thread.sleep(2000);
		
		driver.navigate().back();
	
		
}
	
	public void testContactUs (WebDriver driver) throws InterruptedException {
		
		WebElement lienContactUs = driver.findElement(By.xpath("//a[@href='http://www.cx.sap.com/contact']"));

		ObjetCommun.VerificationAffichageElement(lienContactUs);
		
		if (ObjetCommun.VerificationBeforeUseElement(lienContactUs)) {
			
			lienContactUs.click();
	
		}
		else 
		{
			System.out.println("on ne peut pas utilier le lien ");
		}
		

		Thread.sleep(2000);
		
		//driver.navigate().back();
		driver.get(ObjetCommun.UrlPoste);
	
	}

	public void TestHelp (WebDriver driver ) throws InterruptedException {
		
		WebElement lienHelp = driver.findElement(By.xpath("//a[@href='/faq']"));

		ObjetCommun.VerificationAffichageElement(lienHelp);
		
		if (ObjetCommun.VerificationBeforeUseElement(lienHelp)) {
			
			lienHelp.click();
		}
		else 
		{
			System.out.println("on ne peut pas utilier le lien ");
		}
		

		Thread.sleep(2000);
		
		driver.navigate().back();
	}
	
	public void TestSignIn (WebDriver driver) throws InterruptedException {
		
		WebElement lienSignIn = driver.findElement(By.xpath("//a[@role='link'][text()='Sign In / Register']"));

		ObjetCommun.VerificationAffichageElement(lienSignIn);
		
		if (ObjetCommun.VerificationBeforeUseElement(lienSignIn)) {
			
			lienSignIn.click();
		}
		else 
		{
			System.out.println("on ne peut pas utilier le lien ");
		}
		

		Thread.sleep(2000);
		
		driver.navigate().back();
	}
	
	public void TestPanner (WebDriver driver) throws InterruptedException {
		
		WebElement lienPannier = driver.findElement(By.xpath("//A[@role='link'][text()='Sign In / Register']"));

		ObjetCommun.VerificationAffichageElement( lienPannier);
		
		if (ObjetCommun.VerificationBeforeUseElement( lienPannier)) {
			
			 lienPannier.click();
		}
		else 
		{
			System.out.println("on ne peut pas utilier le lien ");
		}
		

		Thread.sleep(2000);
		
		driver.navigate().back();
	} 
	
	public void TestBrands (WebDriver driver ) throws InterruptedException {
		
		WebElement lienBrands = driver.findElement(By.xpath("//cx-icon [@class='cx-icon fas fa-angle-down']"));

		ObjetCommun.VerificationAffichageElement( lienBrands);
		
		if (ObjetCommun.VerificationBeforeUseElement( lienBrands)) {
			
			lienBrands.click();
		}
		else 
		{
			System.out.println("on ne peut pas utilier le lien ");
		}
		

		Thread.sleep(2000);
		
		driver.navigate().back();
	}
	
	public void TestDigitalCameras (WebDriver driver) throws InterruptedException {
		
		WebElement lienDigitalCameras = driver.findElement(By.xpath("//cx-icon [@class='cx-icon fas fa-angle-down']"));

		ObjetCommun.VerificationAffichageElement( lienDigitalCameras);
		
		if (ObjetCommun.VerificationBeforeUseElement( lienDigitalCameras)) {
			
			lienDigitalCameras.click();
		}
		else 
		{
			System.out.println("on ne peut pas utilier le lien ");
		}
		

		Thread.sleep(2000);
		
		driver.navigate().back();
	}
	
	public void TestFilmCameras (WebDriver driver ) {
		
		WebElement lienFilmCameras = driver.findElement(By.xpath("//A[@role='link']"));

		ObjetCommun.VerificationAffichageElement( lienFilmCameras);
		
		if (ObjetCommun.VerificationBeforeUseElement( lienFilmCameras)) {
			
			lienFilmCameras.click();
		}
		else 
		{
			System.out.println("on ne peut pas utilier le lien ");
		}
	}
	

	
}


