import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestaCadastro {

    @Test
    public void testFace(){

        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver2\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/r.php?r=101");


        //Preenche campos de cadastro
        driver.findElement(By.name("firstname")).sendKeys( "Fabiana ");
        driver.findElement(By.name("lastname")).sendKeys( "Xavier");
        driver.findElement(By.name("reg_email__")).sendKeys( "fabiana@exemplo.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys( "fabiana@exemplo.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys( "1234abcd");

        WebElement comboDia = driver.findElement(By.id("day"));
        Select select = new Select(comboDia);
        select.selectByVisibleText("25");

        WebElement comboMes = driver.findElement(By.id("month"));
        select = new Select(comboMes);
        select.selectByVisibleText("Dez");

        WebElement comboAno= driver.findElement(By.id("year"));
        select = new Select(comboAno);
        select.selectByVisibleText("1981");
        driver.findElement(By.id("u_0_7")).click();

        driver.findElement(By.xpath("//input[@value='1']")).click();
    }

}
