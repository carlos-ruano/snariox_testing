package com.grupo3.testing.serenity.stepdefinitions;

import com.grupo3.testing.serenity.tasks.navigation.NavigateTo;
import com.grupo3.testing.serenity.tasks.search.SnarioxProductosArticle;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;

public class NavegarProductosStepDefinitions {
	
	//Escenario encontrar la seccion servicios dentro de la página home
	@Given("{actor} entra en la pagina home de la web TC18")
	public void la_pagina_home_de_la_web_tc18(Actor actor) {
		actor.wasAbleTo(
        		NavigateTo.theSnarioxHomePage()
        );
	}
	@When("{actor} hace scroll TC18")
	public void haces_scroll_tc18(Actor actor) {
		 actor.attemptsTo(
	                Scroll.to(SnarioxProductosArticle.H2_PRODUCTOS)
	        );
	}
	@Then("{actor} encuentra un h2 con un titulo que incluye la palabra {string} TC18")
	public void encuentras_un_h2_con_un_titulo_que_incluye_la_palabra_productos_tc18(Actor actor,String term) {
		actor.attemptsTo(
                Ensure.that(SnarioxProductosArticle.H2_PRODUCTOS).hasText(term)
        );
	}
}
