package com.grupo3.testing.serenity.stepdefinitions;

import static org.assertj.core.api.Assertions.assertThat;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.By;

public class FormularioNoRelleno {
	
	protected WebDriver driver;
	
	String url ="https://snariox.web.app/contacto.html";
	String driverBrowser = "webdriver.chrome.driver";
	String driverLoc = "C:\\Adrian Sumagui\\chromedriver.exe";
	
	@Given("la pagina de Contacto TC28")
	public void la_pagina_de_contacto_tc28() {
		System.setProperty(driverBrowser, driverLoc);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	@When("el usuario NO rellena ninguno campos requeridos y las dos casillas TC28")
	public void el_usuario_no_rellena_ninguno_campos_requeridos_y_las_dos_casillas_tc28() {
		driver.findElement(By.xpath("//*[@id=\"contacto\"]/div[3]/div[7]/button")).click();
	}
	@Then("el formulario NO se envia correctamente TC28")
	public void el_formulario_no_se_envia_correctamente_tc28() {
		String strUrl = driver.getCurrentUrl();
		assertThat(strUrl).isEqualTo("https://snariox.web.app/contacto.html");
		driver.quit();
	}
	
	
}