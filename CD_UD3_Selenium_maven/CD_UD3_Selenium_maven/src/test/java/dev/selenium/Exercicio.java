package dev.selenium;

/*import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;

import org.checkerframework.checker.units.qual.mPERs;*/
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

public class Exercicio {

    static ChromeDriver driver;

    @BeforeAll
    public static void start(){
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://www.follasnovas.com/es/");
    }
    @Test
    public void prueba_Completar() throws Exception{
        WebElement textInput = driver.findElement(By.id("autocompleta"));
        textInput.sendKeys("La isla de las tormentas");
        Thread.sleep(2000);

    }

    @Test
    public void libro_seleccionar() throws Exception{
        WebElement textInput = driver.findElement(By.id("autocompleta"));
        textInput.sendKeys("La isla de las tormentas");
        Thread.sleep(2000);
        WebElement boton = driver.findElement(By.xpath("//*[@id=\"busqueda\"]/button"));
        boton.click();
        Thread.sleep(2000);
    }

    @Test
    public void mandar_a_cesta() throws Exception{
        WebElement textInput = driver.findElement(By.id("autocompleta"));
        textInput.sendKeys("La isla de las tormentas");
        Thread.sleep(2000);
        WebElement boton = driver.findElement(By.xpath("//*[@id=\"busqueda\"]/button"));
        boton.click();
        WebElement boton2 = driver.findElement(By.xpath("//*[@id=\"href_dispo_622364\"]"));
        boton2.click();
        Thread.sleep(2000);
    }

    @Test
    public void ver_nombre_busqueda() throws Exception{
        WebElement textInput = driver.findElement(By.id("autocompleta"));
        textInput.sendKeys("La isla de las tormentas");
        Thread.sleep(2000);
        WebElement boton = driver.findElement(By.xpath("//*[@id=\"busqueda\"]/button"));
        boton.click();
        WebElement message = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/h1"));
        System.out.println(message.getText());
        Thread.sleep(5000);
    }

    @Test
    public void selecionar_segunda_opcion() throws Exception{
        WebElement textInput = driver.findElement(By.id("autocompleta"));
        textInput.sendKeys("La isla de las tormentas");
        Thread.sleep(2000);
        WebElement boton = driver.findElement(By.xpath("//*[@id=\"busqueda\"]/button"));
        boton.click();
        Thread.sleep(2000);
        WebElement select = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[1]/div/select"));
        Select comboSelect = new Select(select);
        comboSelect.selectByIndex(2);
        Thread.sleep(2000);
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

   

}