package com.grupo3.testing.serenity.stepdefinitions;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PruebaSeleniumDefinitions {
protected WebDriver driver;
	
	String url = "https://www.luca-tic.com/";
	int maxTime = 15;
	String driverBrowser = "webdriver.chrome.driver";
	String driverLoc = "../chromedriver.exe";
	
	//ESCENARIO 1 POST
	@Given("Pagina web de lucatic")
	public void pagina_web_de_lucatic() {
		System.setProperty(driverBrowser, driverLoc);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
	}
	@When("Hace click en enviar cv")
	public void hace_click_en_enviar_cv() {
		//aceptar las cookies
		WebElement cookie = driver.findElement(By.linkText("Aceptar"));
		cookie.click();
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(cookie));
		
		//scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		WebElement enlace = driver.findElement(By.linkText("Mándanos tu Curriculum"));
		actions.moveToElement(enlace).perform();
		
		enlace.click();
	}
	
	@Then("Nos lleva a la pagina de enviar curri")
	public void nos_lleva_a_la_pagina_de_enviar_curri() {
		String strUrl = driver.getCurrentUrl();
		assertThat(strUrl).isEqualTo("https://www.luca-tic.com/?page_id=1154");
		driver.quit();
	}
	
}
