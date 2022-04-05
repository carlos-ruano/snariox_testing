package com.grupo3.testing.serenity.stepdefinitions;

import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.annotations.findby.By;

public class FormularioMensajeMax {
	
	protected WebDriver driver;
	
	String url ="https://snariox.web.app/contacto.html";
	String driverBrowser = "webdriver.chrome.driver";
	String driverLoc = "C:\\Adrian Sumagui\\chromedriver.exe";
	
	@Given("la pagina de Contacto TC68")
	public void la_pagina_de_contacto_tc68() {
		System.setProperty(driverBrowser, driverLoc);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	@When("el usuario rellena el campo MENSAJE que supera el numero maximo de caracteres permitidos TC68")
	public void el_usuario_rellena_el_campo_mensaje_que_supera_el_numero_maximo_de_caracteres_permitidos_tc68() {
		driver.findElement(By.id("nombre")).sendKeys("Pedro");
	    driver.findElement(By.id("email")).sendKeys("correo@mail.com");
	    driver.findElement(By.id("telefono")).sendKeys("654987321");
	    driver.findElement(By.id("mensaje")).sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur cursus diam eu neque molestie, pharetra lacinia libero euismod. Vestibulum lacus nisl, congue id ornare ut, aliquam sed mi. Praesent congue odio at feugiat bibendum. Praesent sed tellus quis nunc tempus rhoncus a id nunc. Fusce pharetra felis pellentesque tellus pharetra scelerisque. Fusce mattis sem eu libero dictum accumsan. Etiam non aliquam lacus. Cras tincidunt molestie suscipit. Proin id felis nec elit convallis rhoncus condimentum sed mi. Maecenas cursus mauris nec tortor pellentesque, condimentum lacinia leo sagittis. Pellentesque ornare dolor lorem, vel fringilla ligula interdum vitae. Ut eu scelerisque enim. Aliquam eu odio ante. Morbi tempor nisi velit, quis efficitur massa pellentesque dignissim.\r\n"
	    		+ "\r\n"
	    		+ "Maecenas et nunc ac odio aliquam ornare et id mauris. Sed malesuada orci eu laoreet vestibulum. Nulla vitae dolor at risus sagittis viverra. Ut facilisis consequat dui, eget laoreet nisl venenatis non. Maecenas ipsum leo, consequat a nisi at, euismod iaculis tellus. Quisque volutpat nec ipsum nec pulvinar. Integer blandit volutpat velit, blandit bibendum ante auctor ac. Morbi eget nulla molestie risus porta gravida eget in ante. Nulla eget eleifend dolor, fermentum pellentesque ex. Etiam molestie massa ut sodales faucibus. Proin nibh tortor, facilisis imperdiet lacinia at, convallis eu felis. Aenean nisi mi, placerat vitae ligula sed, venenatis consequat orci. Duis sed vestibulum lorem, eget finibus odio. Aliquam convallis dui urna, aliquet faucibus odio congue ac. Vestibulum leo erat, eleifend non ligula id, tincidunt elementum diam. Etiam mattis eleifend semper.\r\n"
	    		+ "\r\n"
	    		+ "Maecenas sed pretium ligula. Ut a purus ipsum. Sed volutpat risus quis diam tristique consectetur in at sapien. Aliquam efficitur risus at ex pretium, a dictum purus consectetur. In at quam eget dolor auctor pellentesque. Nullam congue euismod lectus, a aliquam urna ornare in. Mauris cursus tincidunt enim, id porttitor enim commodo sit amet. Suspendisse vestibulum erat eget sodales vehicula. Donec malesuada neque urna, sed semper lorem congue non. Nullam eget mi id lorem porta pellentesque. Sed mollis nisl eu euismod convallis. Vestibulum vulputate, tortor ut luctus ultricies, nulla arcu congue erat, sit amet viverra leo diam eu ante. Aliquam tristique arcu et ex luctus sagittis. Morbi ullamcorper mi viverra, pellentesque justo quis, pharetra tortor. Nam euismod, lectus ac porta maximus, sapien eros facilisis justo, eu euismod augue risus eget mi. Morbi metus felis, ullamcorper auctor orci quis, iaculis auctor magna.\r\n"
	    		+ "\r\n"
	    		+ "Sed pretium commodo mauris, et bibendum turpis mollis et. Fusce vehicula nibh eget tortor finibus ultricies. Morbi fringilla finibus felis, eu dictum magna aliquam vel. Nam ligula sem, tempor eu commodo ut, eleifend ut erat. Nullam commodo laoreet risus, sed gravida leo maximus eget. Nulla vitae nulla blandit, tempor nibh eu, porttitor lectus. Nulla facilisi. Nullam eu finibus diam, non pretium urna. Quisque porta nibh id faucibus finibus. Ut odio nunc, tempus quis viverra a, auctor ac sapien. Aenean in pulvinar nulla. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed a convallis nisi, quis pharetra risus. Quisque tincidunt vehicula neque, sed convallis erat vehicula eget. Aliquam luctus nisi leo.\r\n"
	    		+ "\r\n"
	    		+ "Integer iaculis dignissim nunc. Praesent quis nibh dapibus, molestie metus eu, tincidunt nibh. Morbi sapien libero, tristique vel pulvinar eget, consectetur convallis enim. Curabitur ac convallis neque, ac placerat tellus. Nunc porttitor, mi sit amet porta pulvinar, lectus lacus hendrerit massa, ut mattis lacus magna nec quam. Mauris sit amet metus ipsum. Sed efficitur dignissim dolor, eget lacinia est.");
	    driver.findElement(By.id("consent")).click();
	    driver.findElement(By.id("age")).click();
	    driver.findElement(By.xpath("//*[@id=\"contacto\"]/div[3]/div[7]/button")).click();
	}
	@Then("el formulario NO se envia correctamente TC68")
	public void el_formulario_no_se_envia_correctamente_tc68() {
		String strUrl = driver.getCurrentUrl();
		assertThat(strUrl).isEqualTo("https://snariox.web.app/contacto.html");
		driver.quit();
	}


}
