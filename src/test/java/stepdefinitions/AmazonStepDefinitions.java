package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage=new AmazonPage();

    @Given("Kullanıcı amazon anasayfaya gider")
    public void kullanıcı_amazon_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }
    @When("Arama çubuğuna nutella yazıp aratır")
    public void arama_çubuğuna_nutella_yazıp_aratır() {
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

    }
    @Then("Arama sonuçlarının Nutella içerdiğini test eder")
    public void arama_sonuçlarının_nutella_içerdiğini_test_eder() {
        String actualAramaSonucu=amazonPage.aramaSonucElementi.getText();
        String expectedKelime="Nutella";
        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));
    }
    @Then("Sayfayı kapatır")
    public void sayfayı_kapatır() {
        Driver.closeDriver();

    }
}
