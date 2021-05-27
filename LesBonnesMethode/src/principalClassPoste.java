import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class principalClassPoste {
	
	static WebDriver driver ;
	
	public static void main(String[] args) throws InterruptedException {
		
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Abdou Rahmane\\Documents\\chromedriver.exe");
				 driver  = new ChromeDriver();

			        driver.manage().window().maximize();
			       Commun instanceCommun = new Commun();
			       driver.get(instanceCommun.UrlPoste);
			        
			       
			        // Haut de page
			       hautDePage instanceHautDePage = new hautDePage();
			       
			       instanceHautDePage.testHautDePage(driver);
			        
			      
			        instanceHautDePage.testContactUs(driver);
			        
			        instanceHautDePage.TestHelp(driver);
			       
			       // instanceHautDePage.TestSignIn(driver);
			        
			       // instanceHautDePage.TestPanner(driver);
			       
			        //instanceHautDePage.TestBrands(driver);	
			        
			        //instanceHautDePage.TestDigitalCameras(driver);
			        
			        //instanceHautDePage.TestFilmCameras(driver);
			        
			        // Bas de page
			        
			       /* basDePages instanceBasDePages = new basDePages();
			        instanceBasDePages.testBasDePage(driver);
			        */
			        
			        // Milieu de Page
			        
			       //ilieuDePage imageMilieuDePage = new milieuDePage ();
			       //mageMilieuDePage.TestImagemilieuDePage(driver);
			        
			        //milieuDePage Carnet10TimbresCRF = new milieuDePage ();
			        //Carnet10TimbresCRF.TestCarnet10TimbresCRF(driver);
			        
			     driver.close();
	}
	
}
