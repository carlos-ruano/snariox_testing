package com.grupo3.testing.serenity.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.By;

public class FormularioRelleno {
	
	protected WebDriver driver;
	
	String url ="https://snariox.web.app/contacto.html";
	String driverBrowser = "webdriver.chrome.driver";
	String driverLoc = "C:\\Adrian Sumagui\\chromedriver.exe";
	
	
	@Given("la pagina de Contacto TC25")
	public void la_pagina_de_contactoTC25() {
		System.setProperty(driverBrowser, driverLoc);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	@When("el usuario rellena todos los campos requeridos y las dos casillas TC25")
	public void el_usuario_rellena_todos_los_campos_requeridos_y_las_dos_casillasTC25() {
		driver.findElement(By.id("nombre")).sendKeys("Pedro");
	    driver.findElement(By.id("email")).sendKeys("correo@mail.com");
	    driver.findElement(By.id("telefono")).sendKeys("654987321");
	    driver.findElement(By.id("mensaje")).sendKeys("Me gustan los trenes.");
	    driver.findElement(By.id("consent")).click();
	    driver.findElement(By.id("age")).click();
	    driver.findElement(By.xpath("//*[@id=\"contacto\"]/div[3]/div[7]/button")).click();
	}
	@Then("el formulario se envia correctamente TC25")
	public void el_formulario_se_envia_correctamenteTC25() {
		driver.findElement(By.id("FormOKMsg"));
		driver.quit();
		// No se verifica de ninguna manera si se ha enviado correctamente. 
		// Por tanto, se califica como un Error.
	}
	

}
