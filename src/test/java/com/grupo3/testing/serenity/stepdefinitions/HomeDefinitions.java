package com.grupo3.testing.serenity.stepdefinitions;

import com.grupo3.testing.serenity.tasks.navigation.NavigateTo;
import com.grupo3.testing.serenity.tasks.navigation.SnarioxInformacion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

public class HomeDefinitions {
	
	@Given("{actor} que entra en la pagina web TC44")
	public void usuario_que_entra_en_la_pagina_web_tc44(Actor actor) {
        actor.wasAbleTo(
        		NavigateTo.theSnarioxHomePage()
        );
	}

	@When("Se carga la pagina a {actor} TC44")
	public void se_carga_la_pagina_a_usuario_tc44(Actor actor) {
        actor.attemptsTo(
                Ensure.that(SnarioxInformacion.INFO_ELEMENT).isDisplayed()
        );
	}

	@Then("La pagina muestra a {actor} informacion acerca de la empresa TC44")
	public void la_pagina_muestra_a_usuario_informacion_acerca_de_la_empresa_tc44(Actor actor) {
		String term = "Snariox es una de las empresas más competitivas del mundo en la fabricación de aceros inoxidables y aleaciones de níquel. Se trata de la compañía del sector más global del mundo con presencia en los cinco continentes, fábricas en cuatro de ellos y suministro a clientes de 81 países. Desde su constitución, hace ahora 4 días, ha venido realizando un continuo programa de inversiones con desarrollo de innovaciones tecnológicas propias que, en algunos casos, han constituido un verdadero hito en la tecnología de los aceros inoxidables.";
	        actor.attemptsTo(
	                Ensure.that(SnarioxInformacion.INFO_SNARIOX).hasText(term)
	        );
	}

}
