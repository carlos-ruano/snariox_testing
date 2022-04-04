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

public class FormularioNoRelleno {
	
	protected WebDriver driver;
	
	String url ="https://snariox.web.app/contacto.html";
	String driverBrowser = "webdriver.chrome.driver";
	String driverLoc = "C:\\Adrian Sumagui\\chromedriver.exe";
	
	@Given("{actor} entra a la pagina de Contacto2")
	public void la_pagina_de_contacto(Actor actor) {
		actor.wasAbleTo(NavigateTo.theSnarioxContactPage());
		System.setProperty(driverBrowser, driverLoc);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	@When("{actor} NO rellena todos los campos requeridos y las dos casillas")
	public void el_usuario_no_rellena_ninguno_campos_requeridos_y_las_dos_casillas(Actor actor) {
		driver.findElement(By.xpath("//*[@id=\"contacto\"]/div[3]/div[7]/button")).click();
	}
	@Then("el formulario NO se envia correctamente")
	public void el_formulario_no_se_envia_correctamente() {
		String strUrl = driver.getCurrentUrl();
		assertThat(strUrl).isEqualTo("https://snariox.web.app/contacto.html");
		// El propio navegador me indica que se deben completar los campos requeridos
		// y, por tanto, el URL es el mismo.
	}
	
	
}