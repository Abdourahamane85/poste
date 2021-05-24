import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class basDePages {
	public void testBasDePage (WebDriver driver) {
		
		//driver.findElement(By.xpath("//IMG[@src='https://api.c4a0pho0ft-laposteaz1-s1-public.model-t.cc.commerce.ondemand.com/medias/sys_master/images/h31/h44/8796136964126/Elec_1400x50_HomeFreeDel_EN_01_1400W/Elec-1400x50-HomeFreeDel-EN-01-1400W.jpg']"));
		//driver.findElement(By.xpath("//IMG[@src='https://api.c4a0pho0ft-laposteaz1-s1-public.model-t.cc.commerce.ondemand.com/medias/sys_master/images/h31/h44/8796136964126/Elec_1400x50_HomeFreeDel_EN_01_1400W/Elec-1400x50-HomeFreeDel-EN-01-1400W.jpg']"));
		//driver.findElement(By.xpath("//A[@rel='noopener']")).click();
		//driver.findElement(By.xpath("//A[@role='link']")).click();
		driver.findElement(By.xpath("//A[@target='_blank']")).click();
		driver.findElement(By.xpath("//A[@target='_blank']")).click();
		
}	
}