package com.udea.e2e.stepdefinitions;


import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class RequerimentsVisualizeStepDefinition {

    @Managed(driver = "chrome")
    public WebDriver driver;
    private final Actor user = Actor.named("Estudiante");

    @Given("me encuentro en la pagina de home")
    public void meEncuentroPaginaBancolombia(){
        driver.manage().window().maximize();
        user.can(BrowseTheWeb.with(driver));
    }

}
