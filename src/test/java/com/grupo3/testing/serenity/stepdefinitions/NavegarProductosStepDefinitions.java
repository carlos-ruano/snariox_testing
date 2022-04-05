package com.grupo3.testing.serenity.stepdefinitions;


import com.grupo3.testing.serenity.tasks.navigation.NavigateTo;
import com.grupo3.testing.serenity.tasks.search.SnarioxProductosArticle;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
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
	
	//Escenario 2: darle click al boton e ir a la seccion productos
	@Given("{actor} entra en la pagina home de la web TC19")
	public void usuario_entra_en_la_pagina_home_de_la_web_tc19(Actor actor) {
		actor.wasAbleTo(
        		NavigateTo.theSnarioxHomePage()
        );
	}
	@When("{actor} hace click en botón leer más TC19")
	public void usuario_hace_click_en_boton_leer_mas_tc19(Actor actor) {
	    actor.wasAbleTo(Click.on("//*[@id=\"leer-mas\"]"));
	}
	@Then("{actor} va automaticamente a la seccion productos TC19")
	public void usuario_va_automaticamente_a_la_seccion_productos_tc19(Actor actor) {
		actor.attemptsTo(
                Ensure.that(SnarioxProductosArticle.H2_PRODUCTOS).hasText("¿Qué ofrecemos?")
        );
	}
	
	
	//Escenario 3: el numero de tarjetas de productos es de seis
	@Given("{actor} entra en la pagina home de la web TC91")
	public void usuario_entra_en_la_pagina_home_de_la_web_tc91(Actor actor) {
		actor.wasAbleTo(
        		NavigateTo.theSnarioxHomePage()
        );
	}
	@When("{actor} hace click en botón leer más TC91")
	public void usuario_hace_click_en_boton_leer_mas_tc91(Actor actor) {
		actor.wasAbleTo(Click.on("//*[@id=\"leer-mas\"]"));
	}
	@Then("{actor} va automaticamente a la seccion productos TC91")
	public void usuario_va_automaticamente_a_la_seccion_productos_tc91(Actor actor) {
		actor.attemptsTo(
                Ensure.that(SnarioxProductosArticle.H2_PRODUCTOS).hasText("¿Qué ofrecemos?")
        );
	}
	@Then("{actor} ve seis tarjetas con los productos TC91")
	public void usuario_ve_seis_tarjetas_con_los_productos_tc91(Actor actor) {
		actor.attemptsTo(
		        Ensure.that(SnarioxProductosArticle.NUM_TARJETAS_PRODUCTOS).values().hasSize(6)
		);
	}
	
	//escenario 4: texto no es lorem ipsum
	@Given("{actor} entra en la pagina home de la web TC92")
	public void usuario_entra_en_la_pagina_home_de_la_web_tc92(Actor actor) {
		actor.wasAbleTo(
        		NavigateTo.theSnarioxHomePage()
        );
	}
	@When("{actor} hace scroll TC92")
	public void usuario_hace_scroll_tc92(Actor actor) {
		actor.attemptsTo(
                Scroll.to(SnarioxProductosArticle.H2_PRODUCTOS)
        );
	}
	@Then("{actor} ve una seccion productos con seis tarjetas diferenciadas TC92")
	public void usuario_ve_una_seccion_productos_con_seis_tarjetas_diferenciadas_tc92(Actor actor) {
	    
	}
	@Then("{actor} ve que la seccion productos incluye texto que no es lorem ipsum TC92")
	public void usuario_ve_que_la_seccion_productos_incluye_texto_que_no_es_lorem_ipsum_tc92(Actor actor) {
		actor.attemptsTo(
		        Ensure.that(SnarioxProductosArticle.TARJETA_1).not().containsElements("lorem"),
		        Ensure.that(SnarioxProductosArticle.TARJETA_2).not().containsElements("lorem"),
		        Ensure.that(SnarioxProductosArticle.TARJETA_3).not().containsElements("lorem"),
		        Ensure.that(SnarioxProductosArticle.TARJETA_4).not().containsElements("lorem"),
		        Ensure.that(SnarioxProductosArticle.TARJETA_5).not().containsElements("lorem"),
		        Ensure.that(SnarioxProductosArticle.TARJETA_6).not().containsElements("lorem")
		);
	}
	
	
}
