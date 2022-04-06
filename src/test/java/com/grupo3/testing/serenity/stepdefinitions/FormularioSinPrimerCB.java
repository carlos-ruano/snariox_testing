package com.grupo3.testing.serenity.stepdefinitions;

import static org.assertj.core.api.Assertions.assertThat;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.By;

public class FormularioSinPrimerCB {
	
	protected WebDriver driver;
	
	String url ="https://snariox.web.app/contacto.html";
	String driverBrowser = "webdriver.chrome.driver";
	String driverLoc = "C:\\Adrian Sumagui\\chromedriver.exe";
	
	@Given("la pagina de Contacto TC75")
	public void la_pagina_de_contacto_tc75() {
		System.setProperty(driverBrowser, driverLoc);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	@When("el usuario NO marca el primer CHECKBOX requerido TC75")
	public void el_usuario_no_marca_el_primer_checkbox_requerido_tc75() {
		driver.findElement(By.id("nombre")).sendKeys("Pedro");
	    driver.findElement(By.id("email")).sendKeys("correo@mail.com");
	    driver.findElement(By.id("telefono")).sendKeys("654987321");
	    driver.findElement(By.id("mensaje")).sendKeys("Me gustan los trenes.");
	    driver.findElement(By.id("age")).click();
	    driver.findElement(By.xpath("//*[@id=\"contacto\"]/div[3]/div[7]/button")).click();
	}
	@Then("el formulario NO se envia correctamente TC75")
	public void el_formulario_no_se_envia_correctamente_tc75() {
	    String strUrl = driver.getCurrentUrl();
		assertThat(strUrl).isEqualTo("https://snariox.web.app/contacto.html");
		driver.quit();
	}

}
