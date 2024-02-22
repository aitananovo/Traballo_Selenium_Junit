package dev.selenium;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;

import org.checkerframework.checker.units.qual.mPERs;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ChromeTest {

   /*@Test
    public void basicOptions() throws InterruptedException{
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        //System.out.println(driver.getTitle());
        //Thread.sleep(2000);

        WebElement submit = driver.findElement(By.className("btn"));
        submit.click();

        WebElement message = driver.findElement(By.id("message"));
        System.out.println(message.getText());
        assertEquals("Received!", message.getText());

        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void elementForms() throws InterruptedException{
        driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        //comprobar si el input esta marcado
        WebElement checkInput = driver.findElement(By.id("my-check-1"));
        //hacer click en el elemento
        checkInput.click();
        Thread.sleep(2000);
        assertEquals(true, checkInput.isSelected());
        assertTrue(false);
    }

    @Test
    public void DisableInput() throws InterruptedException{
        driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        WebElement disableInpunt = driver.findElement(By.name("my-disabled"));
        String textTest = "Test";
        disableInpunt.sendKeys(textTest);
        Thread.sleep(2000);
        assertNotEquals(textTest, disableInpunt.getText());

    }
    @Test
    public void elementUploadForms() throws Exception{
        driver = new ChromeDriver();
        String nameImage ="suricata-1.webp";
        driver.get("https://the-internet.herokuapp.com/upload");
        File uploadFile = new File("src/test/files/"+nameImage);
        
        WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
        fileInput.sendKeys(uploadFile.getAbsolutePath());
        
        driver.findElement(By.id("file-submit")).click();
        
        WebElement fileName = driver.findElement(By.id("uploaded-files"));
       
        assertEquals(nameImage, fileName.getText());
        Thread.sleep(2000);
        driver.quit();
    } */ 

       static ChromeDriver driver;
    @BeforeAll //para que ejecute antes que el @Test
    public static void start(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized"); //poner la pantalla en grande
        driver = new ChromeDriver(options);
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
    }
    @Test
    public void elementDataForms() throws Exception{
        WebElement calendar = driver.findElement(By.name("my-date"));
        calendar.sendKeys("01/12/2024"); //mes-dia-año
        calendar.sendKeys(Keys.TAB); // mandar tecla tabular

    }

    @AfterAll
    public static void end(){
        try{
            Thread.sleep(4000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.quit();
    }
       @Test
        public void basicOptions() throws InterruptedException{
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        //System.out.println(driver.getTitle());
        //Thread.sleep(2000);

        WebElement submit = driver.findElement(By.className("btn"));
        submit.click();

        WebElement message = driver.findElement(By.id("message"));
        System.out.println(message.getText());
        assertEquals("Received!", message.getText());

    }
}