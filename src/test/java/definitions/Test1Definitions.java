package definitions;

import configs.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.java.en.*;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Test1Definitions {

    WebDriver driver = WebDriverManager.getDriver();

    @Given("estoy en Google")
    public void estoy_en_google(){
        driver.get("https://www.google.com/");

    }

    @When("^ingreso \"([^\"]*)\" en el campo de busqueda$")
    public void ingreso_en_el_campo_de_busqueda(String texto){
        driver.findElement(By.name("q")).sendKeys(texto);

    }

    @When("presiono el boton buscar")
    public void presiono_el_boton_buscar(){
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

    }

    @Then("valido que en los resultados aparece {string}")
        public void valido_que_en_los_resultados_aprece(String texto) throws InterruptedException
    {
        Thread.sleep(4000);
        List<WebElement> elementos = driver.findElements(By.xpath("//span[contains(text(),'"+texto+"')]"));
        System.out.println("La lista tiene <<"+elementos.size()+">> elementos");
        Assert.assertFalse("Hey no hay resultados para <<"+texto+">>", elementos.isEmpty());


    }
}
