import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class principalClassPoste {
	
	static WebDriver driver ;
	
	public static void main(String[] args) {
		
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Abdou Rahmane\\Documents\\chromedriver.exe");
				 driver  = new ChromeDriver();

			        driver.manage().window().maximize();
			        
			        driver.get("https://jsapps.c4a0pho0ft-laposteaz1-s1-public.model-t.cc.commerce.ondemand.com/");
			        // Haut de page
			       hautDePage instanceHautDePage = new hautDePage();
			       instanceHautDePage.testHautDePage(driver);
			        
			        /*hautDePage ContactUs = new hautDePage();
			        ContactUs.testContactUs(driver);
			       
			  
			      // hautDePage Help = new hautDePage();
			      // Help.TestHelp(driver);
			       
			       hautDePage SignIn = new hautDePage();
			       SignIn.TestSignIn(driver);
			       
			       hautDePage Pannier = new hautDePage();
			       Pannier.TestPanner(driver);
			       
			       hautDePage Brands = new hautDePage();
			      Brands.TestBrands(driver);		   
			        // Bas de page
			        
			       /* basDePages instanceBasDePages = new basDePages();
			        instanceBasDePages.testBasDePage(driver);
			        */
			        
			        // Milieu de Page
			        
			       //ilieuDePage imageMilieuDePage = new milieuDePage ();
			       //mageMilieuDePage.TestImagemilieuDePage(driver);
			        
			        //milieuDePage Carnet10TimbresCRF = new milieuDePage ();
			        //Carnet10TimbresCRF.TestCarnet10TimbresCRF(driver);
			        
			    // driver.close();
	}
	
}
