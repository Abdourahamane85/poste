import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class milieuDePage {
	
	Commun ObjetCommun = new Commun() ;
	
	public void TestImageMilieuDePage (WebDriver driver ) throws InterruptedException{
		
		WebElement imageMilieuDePage = driver.findElement(By.xpath("//IMG[@src='https://api.c4a0pho0ft-laposteaz1-s1-public.model-t.cc.commerce.ondemand.com/medias/sys_master/images/h1f/h49/8796721578014/Lpel_1440x440_Homme_banner/Lpel-1440x440-Homme-banner.jpeg']")) ;
		
		ObjetCommun.VerificationAffichageElement(imageMilieuDePage);
		
		if (ObjetCommun.VerificationBeforeUseElement(imageMilieuDePage)){
			
			System.out.println("L'image est bien presente");
		}
		else {
			System.out.println("L'image n'est pas presente");
		}
		
         Thread.sleep(2000);
		
		driver.navigate().back();
	
		
	}
	
	public void TestCarnet10TimbresCRF (WebDriver driver ) {
		
		WebElement Carnet10TimbresCRF = driver.findElement(By.xpath("//H4[text()=' Carnet 10 timbres - La Croix Rouge Française - C215 - Lettre Verte ']"));
		ObjetCommun.VerificationAffichageElement(Carnet10TimbresCRF);
		
		if (ObjetCommun.VerificationBeforeUseElement(Carnet10TimbresCRF)) {
			
			Carnet10TimbresCRF.click();
		}
		else {
			System.out.println("On ne peut pas utiliser le lien");
		}
		
	}
	

}

