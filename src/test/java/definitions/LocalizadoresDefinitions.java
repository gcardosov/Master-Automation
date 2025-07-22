package definitions;

import configs.WebDriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.java.en.*;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LocalizadoresDefinitions {

    //objeto que inicializa el web driver
    private final WebDriver driver = WebDriverManager.getDriver();

    @Given("estoy en SwagLabs {string}")
    public void estoy_en_swag_labs(String url) {
        //Metodo para ir a la pagina
        driver.get(url);
    }

    @When("ingreso {string} en el campo de username")
    public void ingreso_en_el_campo_de_username(String userName) throws InterruptedException {
        //Le damos tiempo tiempo a la pagina mientras carga
        Thread.sleep(3000);
        //buscar el elemento y colocar el userName
        //otra forma pero le tenemos que agregar otra linea
        //WebElement inputNombre = driver.findElement(By.id("user-name"));
        //inputNombre.sedKeys(userName);
        //driver.findElement(By.id("user-name")).sendKeys(userName);
        //Por xpath
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(userName);

    }

    @And("ingreso {string} en el campo de password")
    public void ingreso_en_el_campo_de_password(String password) throws InterruptedException {
        Thread.sleep(3000);
        //driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys(password);
    }

    @And("presiono el boton login")
    public void presiono_el_boton_login() throws InterruptedException {
        Thread.sleep(3000);
        //driver.findElement(By.className("submit-button")).click();
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(5000);
    }

    @Then("valido que me haya logueado en el sitio")
    public void valido_que_me_haya_logueado_en_el_sitio() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue("No se ha realizado el login", driver.findElement(By.xpath("//span[contains(text(),'Products')]")).isDisplayed());
        //Assert.assertTrue("No se ha realizado el login", driver.findElement(By.xpath("//input[@data-test='Login']")).isDisplayed());
        Thread.sleep(3000);
    }






}
