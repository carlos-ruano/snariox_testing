package com.grupo3.testing.serenity.stepdefinitions;

import com.grupo3.testing.serenity.tasks.navigation.NavigateTo;
import com.grupo3.testing.serenity.tasks.search.SnarioxProductosArticle;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;

public class NavegarServiciosStepDefinitions {

	//Escenario: usuario que entra en la pagina home de la web TC93
	@Given("{actor} que entra en la pagina home de la web TC93")
	public void usuario_que_entra_en_la_pagina_home_de_la_web_tc93(Actor actor) {
		actor.wasAbleTo(
        		NavigateTo.theSnarioxHomePage()
        );
	}
	@When("{actor} hace scroll TC93")
	public void usuario_hace_scroll_tc93(Actor actor) {
		actor.attemptsTo(
                Scroll.to(SnarioxProductosArticle.H2_SERVICIOS)
        );
	}
	@Then("{actor} encuentra un h2 con un titulo que incluye la palabra servicios TC93")
	public void usuario_encuentra_un_h2_con_un_titulo_que_incluye_la_palabra_servicios_tc93(Actor actor) {
		actor.attemptsTo(
                Ensure.that(SnarioxProductosArticle.H2_SERVICIOS).hasText("Nuestros servicios")
        );
	}

	// escenario: usuario que entra en la pagina home de la web TC94'
	@Given("{actor} que entra en la pagina home de la web TC94")
	public void usuario_que_entra_en_la_pagina_home_de_la_web_tc94(Actor actor) {
		actor.wasAbleTo(
        		NavigateTo.theSnarioxHomePage()
        );
	}
	@When("{actor} hace scroll TC94")
	public void usuario_hace_scroll_tc94(Actor actor) {
		actor.attemptsTo(
                Scroll.to(SnarioxProductosArticle.H2_SERVICIOS)
        );
	}
	@Then("{actor} ve una seccion servicios con {int} elementos diferenciados TC94")
	public void usuario_ve_una_seccion_servicios_con_elementos_diferenciados_tc94(Actor actor,Integer int1) {
		actor.attemptsTo(
		        Ensure.that(SnarioxProductosArticle.NUM_TARJETAS_PRODUCTOS).values().hasSize(int1)
		);
	}

	//escenario: 'usuario la pagina home de la web TC95'
	@Given("{actor} la pagina home de la web TC95")
	public void usuario_la_pagina_home_de_la_web_tc95(Actor actor) {
		actor.wasAbleTo(
        		NavigateTo.theSnarioxHomePage()
        );
	}
	@When("{actor} hace scroll TC95")
	public void usuario_hace_scroll_tc95(Actor actor) {
		actor.attemptsTo(
                Scroll.to(SnarioxProductosArticle.H2_SERVICIOS)
        );
	}
	@Then("{actor} ve una seccion servicios con {int} elementos diferenciados TC95")
	public void usuario_ve_una_seccion_servicios_con_elementos_diferenciados_tc95(Actor actor, Integer int1) {
		
	}
	@Then("{actor} ve texto que no es lorem ipsum TC95")
	public void usuario_ve_texto_que_no_es_lorem_ipsum_tc95(Actor actor) {
		actor.attemptsTo(
		        Ensure.that(SnarioxProductosArticle.SERVICIO_1).not().containsElements("lorem"),
		        Ensure.that(SnarioxProductosArticle.SERVICIO_2).not().containsElements("lorem"),
		        Ensure.that(SnarioxProductosArticle.SERVICIO_3).not().containsElements("lorem")
		);
	}

	//escenario:'usuario entra en la pagina home de la web TC96'
	@Given("{actor} entra en la pagina home de la web TC96")
	public void usuario_entra_en_la_pagina_home_de_la_web_tc96(Actor actor) {
		actor.wasAbleTo(
        		NavigateTo.theSnarioxHomePage()
        );
	}
	@When("{actor} hace scroll TC96")
	public void usuario_hace_scroll_tc96(Actor actor) {
		actor.attemptsTo(
                Scroll.to(SnarioxProductosArticle.H2_SERVICIOS)
        );
	}
	@Then("{actor} ve una seccion servicios con {int} elementos diferenciados TC96")
	public void usuario_ve_una_seccion_servicios_con_elementos_diferenciados_tc96(Actor actor, Integer int1) {
		
	}
	@Then("{actor} que los elementos contienen un h3 con los titulo Aleaciones especiales, Aceros inoxidables y Oportunidades en todo el mundo respectivamente TC96")
	public void usuario_que_los_elementos_contienen_un_h3_con_los_titulo_aleaciones_especiales_aceros_inoxidables_y_oportunidades_en_todo_el_mundo_respectivamente_tc96(Actor actor) {
		actor.attemptsTo(
				Ensure.that(SnarioxProductosArticle.HEADER_SERVICIO_1).hasText("Aleaciones especiales"),
				Ensure.that(SnarioxProductosArticle.HEADER_SERVICIO_2).hasText("Aceros inoxidables"),
				Ensure.that(SnarioxProductosArticle.HEADER_SERVICIO_3).hasText("Oportunidades en todo el mundo")
		);
	}
}
