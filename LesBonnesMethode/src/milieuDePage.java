import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class milieuDePage {
	
	commun ObjetCommun = new commun() ;
	
	public void TestImagemilieuDePage (WebDriver driver ){
		
		WebElement imageMilieuDePage = driver.findElement(By.xpath("//IMG[@src='https://api.c4a0pho0ft-laposteaz1-s1-public.model-t.cc.commerce.ondemand.com/medias/sys_master/images/h77/h92/8796134899742/Lpel_1440x440_Homme_banner/Lpel-1440x440-Homme-banner.jpeg']")) ;
		
		ObjetCommun.VerificationAffichageElement(imageMilieuDePage);
		
		if (ObjetCommun.VerificationBeforeUseElement(imageMilieuDePage)){
			
			System.out.println("L'image est bien presente");
		}
		else {
			System.out.println("L'image n'est pas presente");
		}
	}
	
	public void TestCarnet10TimbresCRF (WebDriver driver ) {
		
		WebElement Carnet10TimbresCRF = driver.findElement(By.xpath("// cx-media[@class='is-initialized']"));
		ObjetCommun.VerificationAffichageElement(Carnet10TimbresCRF);
		
		if (ObjetCommun.VerificationBeforeUseElement(Carnet10TimbresCRF)) {
			
			Carnet10TimbresCRF.click();
		}
		else {
			System.out.println("On ne peut pas utiliser le lien");
		}
		
	}
}
