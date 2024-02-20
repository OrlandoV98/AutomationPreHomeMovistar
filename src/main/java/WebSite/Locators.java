package WebSite;

import org.openqa.selenium.By;
import org.openqa.selenium.HasDownloads;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {

    public  WebDriver driver;

    public void NewClient(WebDriver _driver) throws InterruptedException {

        this.driver= _driver;

        WebElement btnNewclient = driver.findElement(By.xpath("/html/body/main/div[1]/div/div[2]/button"));
        btnNewclient.click();

    }

    public void FormNewclient(WebDriver _driver) throws InterruptedException {

        this.driver = _driver;

        WebElement impDNI = driver.findElement(By.xpath("/html/body/main/div[2]/section/form/div[1]/div[1]/input"));
        impDNI.sendKeys("70181110");

        WebElement impPhone = driver.findElement(By.xpath("/html/body/main/div[2]/section/form/div[1]/div[2]/input"));
        impPhone.sendKeys("918047810");

        WebElement rbtnAtention = driver.findElement(By.xpath("/html/body/main/div[2]/section/form/div[2]/div[1]/label[2]/span"));
        rbtnAtention.click();

        Thread.sleep(3000);


        WebElement btnSend = driver.findElement(By.xpath("/html/body/main/div[2]/section/form/div[4]/div/button"));
        btnSend.click();

        Thread.sleep(5000);

    }

    public void ValidateSendForm(WebDriver _driver) {

        this.driver = _driver;

        WebElement txtConfirm = driver.findElement(By.xpath("/html/body/main/div[3]/h1"));
        String txtExtraido = txtConfirm.getText();

        if (txtExtraido.equals("¡Gracias!")) {
            System.out.println("El formulario de atención se envio correctamente.");
        } else {
            System.out.println("Error al enviar el formulario.");
        }

    }
}

