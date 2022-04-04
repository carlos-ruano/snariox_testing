package com.grupo3.testing.serenity.stepdefinitions;

import com.grupo3.testing.serenity.tasks.navigation.NavigateTo;
import com.grupo3.testing.serenity.tasks.navigation.SnarioxInformacion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

public class HomeDefinitions {
	
	//HU7 | TS40 | TC44 - Ver la informacion general de la empresa de forma exitosa
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
	
	//HU7 | TS40 | TC50 - La informacion sobre la empresa se encuentra dentro de un <div> y un <h1>
	@Given("{actor} que entra en la pagina web TC50")
	public void usuario_que_entra_en_la_pagina_web_tc50(Actor actor) {
        actor.wasAbleTo(
        		NavigateTo.theSnarioxHomePage()
        );
	}

	@When("Se carga la pagina a {actor} TC50")
	public void se_carga_la_pagina_a_usuario_tc50(Actor actor) {

	}

	@Then("El <div> con id={string} no esta vacio TC50")
	public void el_div_con_id_no_esta_vacio_tc50(String string) {
	}

	@Then("Muestra informacion sobre la empresa a {actor} TC50")
	public void muestra_informacion_sobre_la_empresa_a_usuario_tc50(Actor actor) {

	}

	@Then("El <h1> asociado contiene el texto: {string} TC50")
	public void el_h1_asociado_contiene_el_texto_tc50(String string) {

	}

	@Then("No tiene ningun lorem ipsum TC50")
	public void no_tiene_ningun_lorem_ipsum_tc50() {

	}
	
	// HU7 | TS40 | TC51 - Usuario hace scroll hasta el footer y vuelve al home exitosamente

}
