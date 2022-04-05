package com.grupo3.testing.serenity.stepdefinitions;

import com.grupo3.testing.serenity.tasks.navigation.NavigateTo;
import com.grupo3.testing.serenity.tasks.navigation.SnarioxInformacion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

public class HomeDefinitions {

	// HU7 | TS40 | TC44 - Ver la informacion general de la empresa de forma exitosa
	@Given("{actor} que entra en la pagina web TC44")
	public void usuario_que_entra_en_la_pagina_web_tc44(Actor actor) {
		actor.wasAbleTo(
				NavigateTo.theSnarioxHomePage()
				);
	}

	@When("Se carga la pagina a {actor} TC44")
	public void se_carga_la_pagina_a_usuario_tc44(Actor actor) {
		actor.attemptsTo(
				Ensure.that(SnarioxInformacion.INFO_ELEMENT)
				.isDisplayed()
				);
	}

	@Then("La pagina muestra a {actor} informacion acerca de la empresa TC44")
	public void la_pagina_muestra_a_usuario_informacion_acerca_de_la_empresa_tc44(Actor actor) {
		String term = "Snariox es una de las empresas más competitivas del mundo en la fabricación de aceros inoxidables y aleaciones de níquel. Se trata de la compañía del sector más global del mundo con presencia en los cinco continentes, fábricas en cuatro de ellos y suministro a clientes de 81 países. Desde su constitución, hace ahora 4 días, ha venido realizando un continuo programa de inversiones con desarrollo de innovaciones tecnológicas propias que, en algunos casos, han constituido un verdadero hito en la tecnología de los aceros inoxidables.";
		actor.attemptsTo(
				Ensure.that(SnarioxInformacion.INFO_SNARIOX)
				.hasText(term)
				);
	}

	// HU7 | TS40 | TC50 - La informacion sobre la empresa se encuentra dentro de un
	// <div> y un <h1>
	@Given("{actor} que entra en la pagina web TC50")
	public void usuario_que_entra_en_la_pagina_web_tc50(Actor actor) {
		actor.wasAbleTo(
				NavigateTo.theSnarioxHomePage()
				);
	}

	@When("Se carga la pagina a {actor} TC50")
	public void se_carga_la_pagina_a_usuario_tc50(Actor actor) {
		actor.attemptsTo(
				Ensure.thatTheCurrentPage()
				.currentUrl().isEqualTo("https://snariox.web.app/index.html")
				);
	}

	@Then("{actor} ve que el <div> con id={string} no esta vacio TC50")
	public void usuario_ve_que_el_div_con_id_no_esta_vacio_tc50(Actor actor, String string) {
		actor.attemptsTo(
				Ensure.that(SnarioxInformacion.INFO_ELEMENT)
				.attributeValues(string).isNotNull()
				);
	}

	@Then("Muestra informacion sobre la empresa a {actor} TC50")
	public void muestra_informacion_sobre_la_empresa_a_usuario_tc50(Actor actor) {
		String term = "Snariox es una de las empresas más competitivas del mundo en la fabricación de aceros inoxidables y aleaciones de níquel. Se trata de la compañía del sector más global del mundo con presencia en los cinco continentes, fábricas en cuatro de ellos y suministro a clientes de 81 países. Desde su constitución, hace ahora 4 días, ha venido realizando un continuo programa de inversiones con desarrollo de innovaciones tecnológicas propias que, en algunos casos, han constituido un verdadero hito en la tecnología de los aceros inoxidables.";
		actor.attemptsTo(
				Ensure.that(SnarioxInformacion.INFO_SNARIOX)
				.hasText(term)
				);
	}

	@Then("{actor} ve que el <h1> asociado contiene el texto: {string} TC50")
	public void usuario_ve_que_el_h1_asociado_contiene_el_texto_tc50(Actor actor, String string) {
		actor.attemptsTo(
				Ensure.that(SnarioxInformacion.INFO_TITLE)
				.hasTextContent(string)
				);
	}

	@Then("{actor} comprueba que no tiene ningun lorem ipsum TC50")
	public void usuario_comprueba_que_no_tiene_ningun_lorem_ipsum_tc50(Actor actor) {
		actor.attemptsTo(
				Ensure.that(SnarioxInformacion.INFO_SNARIOX)
				.text().isNotEqualTo("lorem ipsum")
				);
	}

	// HU7 | TS40 | TC51 - Usuario hace scroll hasta el footer y vuelve al home
	// exitosamente
	@Given("{actor} que ya esta dentro de la web TC51")
	public void usuario_que_ya_esta_dentro_de_la_web_tc51(Actor actor) {
		actor.wasAbleTo(
				NavigateTo.theSnarioxHomePage()
				);
	}

	@When("{actor} baja hasta el footer TC51")
	public void usuario_baja_hasta_el_footer_tc51(Actor actor) {
		actor.attemptsTo(
				Scroll.to(SnarioxInformacion.FOOTER)
				);
	}

	@When("{actor} hace clic en el hipervinculo {string} TC51")
	public void usuario_hace_clic_en_el_hipervinculo_tc51(Actor actor, String string) {
		actor.attemptsTo(
				Click.on(SnarioxInformacion.LINK_HOME)
				);
	}

	@Then("La pagina redirecciona a {actor} hasta la parte superior de la web TC51")
	public void la_pagina_redirecciona_a_usuario_hasta_la_parte_superior_de_la_web_tc51(Actor actor) {
		actor.attemptsTo(
				Switch.toTheOtherWindow(),
				Ensure.thatTheCurrentPage()
				.currentUrl().isEqualTo("https://snariox.web.app/index.html")
				);
	}

	// HU7 | TS40 | TC52 - Usuario ve correctamente la marca de la empresa en el
	// cabecero del navegador
	@Given("{actor} que entra a la web TC52")
	public void usuario_que_entra_a_la_web_tc52(Actor actor) {
		actor.wasAbleTo(
				NavigateTo.theSnarioxHomePage()
				);
	}

	@When("La pagina termina de cargar para {actor} TC52")
	public void la_pagina_termina_de_cargar_para_usuario_tc52(Actor actor) {
		actor.attemptsTo(
				Ensure.that(SnarioxInformacion.TITLE_SNARIOX).isEnabled()
				);
	}

	@Then("Se muestra una etiqueta <title> dentro de <head> con el texto: {string} al {actor} TC52")
	public void se_muestra_una_etiqueta_title_dentro_de_head_con_el_texto_al_usuario_tc52(String string, Actor actor) {
		Text.of(
				SnarioxInformacion.TITLE_SNARIOX)
				.answeredBy(actor).contentEquals(string);
	}

	// HU7 | TS40 | TC53 - Usuario puede acceder a las RR.SS. de la empresa
	@Given("{actor} entra a la pagina home de la web TC53")
	public void usuario_entra_a_la_pagina_home_de_la_web_tc53(Actor actor) {
		actor.wasAbleTo(
				NavigateTo.theSnarioxHomePage()
				);
	}

	@When("A {actor} la pagina le carga exitosamente TC53")
	public void a_usuario_la_pagina_le_carga_exitosamente_tc53(Actor actor) {
		actor.attemptsTo( // Comprobamos el Title para saber si cargó la web
				Ensure.that(
						SnarioxInformacion.TITLE_SNARIOX)
				.isEnabled()
				);
	}

	@When("{actor} hace scroll TC53")
	public void usuario_hace_scroll_tc53(Actor actor) {
		actor.attemptsTo(
				Scroll.to(
						SnarioxInformacion.FOOTER)
				);
	}

	@Then("{actor} ve el footer de la web con los iconos de las RR.HH. TC53")
	public void usuario_ve_el_footer_de_la_web_con_los_iconos_de_las_rr_hh_tc53(Actor actor) {
		actor.attemptsTo(
				Ensure.that(SnarioxInformacion.FOOTER_RRSS)
				.isEnabled()
				);
	}

	@Then("Cada icono tiene un hipervínculo activo para que {actor} haga clic TC53")
	public void cada_icono_tiene_un_hipervínculo_activo_para_que_usuario_haga_clic_tc53(Actor actor) {
		SnarioxInformacion.FOOTER_INSTAGRAM.resolveFor(actor).getAttribute("href")
				.equalsIgnoreCase("https://www.instagram.com/");
		SnarioxInformacion.FOOTER_FACEBOOK.resolveFor(actor).getAttribute("href")
				.equalsIgnoreCase("https://www.facebook.com/");
		SnarioxInformacion.FOOTER_LINKEDIN.resolveFor(actor).getAttribute("href")
				.equalsIgnoreCase("https://www.linkedin.com/");
		SnarioxInformacion.FOOTER_TWITTER.resolveFor(actor).getAttribute("href")
				.equalsIgnoreCase("https://www.twitter.com/");
	}

	// HU7 | TS40 | TC54 - Usuario puede ver los terminos y condiciones de la web
	@Given("{actor} entra a la pagina home de la web TC54")
	public void usuario_entra_a_la_pagina_home_de_la_web_tc54(Actor actor) {
		actor.wasAbleTo(
				NavigateTo
				.theSnarioxHomePage()
				);
	}

	@When("La pagina carga exitosamente al {actor} TC54")
	public void la_pagina_carga_exitosamente_al_usuario_tc54(Actor actor) {
		actor.attemptsTo( // Comprobamos el Title para saber si cargó la web
				Ensure.that(
						SnarioxInformacion.TITLE_SNARIOX)
				.isEnabled()
				);
	}

	@When("{actor} hace scroll TC54")
	public void usuario_hace_scroll_tc54(Actor actor) {
		actor.attemptsTo(
				Scroll.to(SnarioxInformacion.FOOTER)
				);
	}

	@Then("{actor} ve el footer de la web con los terminos y condiciones de la web TC54")
	public void usuario_ve_el_footer_de_la_web_con_los_terminos_y_condiciones_de_la_web_tc54(Actor actor) {
		String term = "SNARIOX.COM is a property of SNARIOX S.A.,Ltd. This site is protected by Google Privacy Policy and Terms of Service apply.";
		actor.attemptsTo(
				Ensure.that(SnarioxInformacion.FOOTER_TYC)
				.hasText(term)
				);
	}

	@Then("{actor} ve que no tiene ningún lorem ipsum TC54")
	public void usuario_ve_que_no_tiene_ningún_lorem_ipsum_tc54(Actor actor) {
		actor.attemptsTo(
				Ensure.that(SnarioxInformacion.FOOTER_TYC)
				.text().isNotEqualTo("lorem ipsum")
				);
	}

	// HU7 | TS40 | TC87 - Usuario accede al apartado de 'Enlaces' para navegar por la web
	@Given("{actor} que se dirige a la parte inferior de la web TC87")
	public void usuario_que_se_dirige_a_la_parte_inferior_de_la_web_tc87(Actor actor) {
		actor.wasAbleTo(
				NavigateTo.theSnarioxHomePage(),
				Scroll.to(SnarioxInformacion.FOOTER)
				);
	}

	@When("{actor} hace clic en alguno de los {int} enlaces TC87")
	public void usuario_hace_clic_en_alguno_de_los_enlaces_tc87(Actor actor, Integer int1) {
		actor.attemptsTo(
				Click.on(SnarioxInformacion.FOOTER_LUCATIC),
				Switch.toTheOtherWindow()
				);
	}

	@Then("{actor} es redirigido a cada apartado respectivamente TC87")
	public void usuario_es_redirigido_a_cada_apartado_respectivamente_tc87(Actor actor) {
		actor.attemptsTo(
				Ensure.thatTheCurrentPage().currentUrl().isEqualTo("https://www.luca-tic.com/")
				);
	}

	@Then("{actor} ve que solo existen {int} hipervinculos TC87")
	public void usuario_ve_que_solo_existen_hipervinculos_tc87(Actor actor, Integer int1) {
		actor.attemptsTo(
				Switch.toTheOtherWindow()
				);
		// Comprobamos los href de los 3 enlaces
		SnarioxInformacion.LINK_HOME.resolveFor(actor).getAttribute("href")
		.equalsIgnoreCase("index.html");
		SnarioxInformacion.FOOTER_CONTACTO.resolveFor(actor).getAttribute("href")
		.equalsIgnoreCase("contacto.html");
		SnarioxInformacion.FOOTER_LUCATIC.resolveFor(actor).getAttribute("href")
		.equalsIgnoreCase("https://www.twitter.com/");
	}

	// HU7 | TS40 | TC89 - Usuario quiere ver el anno del copyright de la web
	@Given("{actor} que se encuentra ya en la web TC89")
	public void usuario_que_se_encuentra_ya_en_la_web_tc89(Actor actor) {
		actor.wasAbleTo(
				NavigateTo.theSnarioxHomePage()
				);
	}

	@When("{actor} hace scroll hacia abajo todo lo que le deja la web TC89")
	public void usuario_hace_scroll_hacia_abajo_todo_lo_que_le_deja_la_web_tc89(Actor actor) {
		actor.attemptsTo(
				Scroll.to(SnarioxInformacion.FOOTER)
				);
	}

	@Then("{actor} se asegura que existe una información referente al Copyright en el footer en el div class={string} TC89")
	public void usuario_se_asegura_que_existe_una_información_referente_al_copyright_en_el_footer_en_el_div_class_tc89(
			Actor actor, String string) {
		actor.attemptsTo(
				Ensure.that(SnarioxInformacion.FOOTER)
				.attributeValues(string).isNotNull()
				);
	}

	@Then("{actor} ve marcado el anno {int} TC89")
	public void usuario_ve_marcado_el_anno_tc89(Actor actor, Integer int1) {
		String term = "© "+int1.toString()+" Copyrights. All rights reserved. Snariox";
		actor.attemptsTo(
				Ensure.that(SnarioxInformacion.FOOTER_COPYRIGHT)
				.hasText(term)
				);
	}

}
