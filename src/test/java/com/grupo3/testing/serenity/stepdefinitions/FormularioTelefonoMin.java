package com.grupo3.testing.serenity.stepdefinitions;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.By;

public class FormularioTelefonoMin {
	
	protected WebDriver driver;
	
	String url ="https://snariox.web.app/contacto.html";
	String driverBrowser = "webdriver.chrome.driver";
	String driverLoc = "C:\\Adrian Sumagui\\chromedriver.exe";
	
	@Given("la pagina de Contacto TC55")
	public void la_pagina_de_contacto_tc55() {
		System.setProperty(driverBrowser, driverLoc);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	@When("el usuario rellena el campo TELEFONO que NO supera el numero minimo de caracteres permitidos TC55")
	public void el_usuario_rellena_el_campo_telefono_que_no_supera_el_numero_minimo_de_caracteres_permitidos_tc55() {
		driver.findElement(By.id("nombre")).sendKeys("Pedro");
	    driver.findElement(By.id("email")).sendKeys("correo@mail.com");
	    driver.findElement(By.id("telefono")).sendKeys("65");
	    driver.findElement(By.id("mensaje")).sendKeys("Me gustan los trenes.");
	    driver.findElement(By.id("consent")).click();
	    driver.findElement(By.id("age")).click();
	    driver.findElement(By.xpath("//*[@id=\"contacto\"]/div[3]/div[7]/button")).click();
	}
	@Then("el formulario NO se envia correctamente TC55")
	public void el_formulario_no_se_envia_correctamente_tc55() {
		String strUrl = driver.getCurrentUrl();
		assertThat(strUrl).isEqualTo("https://snariox.web.app/contacto.html");
		driver.quit();
			
	}


}
