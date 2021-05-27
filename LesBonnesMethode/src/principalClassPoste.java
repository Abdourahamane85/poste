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
			       //hautDePage instanceHautDePage = new hautDePage();
			       
			      // instanceHautDePage.testHautDePage(driver);
			        
			      
			        //instanceHautDePage.testContactUs(driver);
			        
			        //instanceHautDePage.TestHelp(driver);
			       
			       // instanceHautDePage.TestSignIn(driver);
			        
			       // instanceHautDePage.TestPanner(driver);
			       
			        //instanceHautDePage.TestBrands(driver);	
			        
			        //instanceHautDePage.TestDigitalCameras(driver);
			        
			        //instanceHautDePage.TestFilmCameras(driver);
			        
			        // Bas de page
			        
			  
			       basDePage instanceBasDePage = new basDePage();
			       instanceBasDePage.testBasDePage(driver);
			        
			        // Milieu de Page
			       
			      // milieuDePage instanceMilieuDePage = new milieuDePage();
			       
			       //instanceMilieuDePage.TestImageMilieuDePage(driver);
			       
			       //instanceMilieuDePage.TestCarnet10TimbresCRF(driver);
			       
			      
			        
			     //driver.close();
	}
	
}
