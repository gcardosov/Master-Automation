package definitions;

import configs.WebDriverManager;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AsercionesDefinitions {

    private final WebDriver driver = WebDriverManager.getDriver();

    @Then("Validar que el titulo sea {string}")
    public void validar_que_el_titulo_sea(String string) throws InterruptedException {

    Thread.sleep(2000);
    String tituloReal = driver.findElement(By.xpath("//div[contains(@class, 'login_logo')]")).getText();
    String tituloEsperado = "Swag Labs";

    //PRUEBA CON ASSERT EQUALS
    Assert.assertEquals("*****Los titulos no son iguales", tituloEsperado, tituloReal);


    }



}
