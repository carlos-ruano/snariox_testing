package com.grupo3.testing.serenity.stepdefinitions;

import static org.assertj.core.api.Assertions.assertThat;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.grupo3.testing.serenity.tasks.navigation.NavigateTo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;

public class FormularioSinTelefono {
	
	protected WebDriver driver;
	
	String url ="https://snariox.web.app/contacto.html";
	String driverBrowser = "webdriver.chrome.driver";
	String driverLoc = "C:\\Adrian Sumagui\\chromedriver.exe";
	
	@Given("la pagina de Contacto TC45")
	public void la_pagina_de_contacto_tc45() {
		System.setProperty(driverBrowser, driverLoc);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	@When("el usuario NO rellena el campo TELEFONO TC45")
	public void el_usuario_no_rellena_el_campo_telefono_tc45() {
		driver.findElement(By.id("nombre")).sendKeys("Pedro");
	    driver.findElement(By.id("email")).sendKeys("correo@mail.com");
	    driver.findElement(By.id("mensaje")).sendKeys("Me gustan los trenes.");
	    driver.findElement(By.id("consent")).click();
	    driver.findElement(By.id("age")).click();
	    driver.findElement(By.xpath("//*[@id=\"contacto\"]/div[3]/div[7]/button")).click();
	}
	@Then("el formulario NO se envia correctamente TC45")
	public void el_formulario_no_se_envia_correctamente_tc45() {
		String strUrl = driver.getCurrentUrl();
		assertThat(strUrl).isEqualTo("https://snariox.web.app/contacto.html");
		driver.quit();
	}

}
