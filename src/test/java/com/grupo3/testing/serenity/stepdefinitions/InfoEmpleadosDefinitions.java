package com.grupo3.testing.serenity.stepdefinitions;

import java.text.MessageFormat;

import com.grupo3.testing.serenity.tasks.navigation.NavigateTo;
import com.grupo3.testing.serenity.tasks.navigation.SnarioxEmpleados;
import com.grupo3.testing.serenity.tasks.navigation.SnarioxInformacion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;

public class InfoEmpleadosDefinitions {
	
	// HU9 | TS61 | TC64 - Usuario puede ver a todo el equipo humano de forma correcta
	@Given("El {actor} entra a la pagina home de la web TC64")
	public void el_usuario_entra_a_la_pagina_home_de_la_web_tc64(Actor actor) {
		actor.wasAbleTo(
				NavigateTo.theSnarioxHomePage()
				);
	}

	@When("La pagina le carga a {actor} exitosamente TC64")
	public void la_pagina_le_carga_a_usuario_exitosamente_tc64(Actor actor) {
		actor.attemptsTo(
				Ensure.that(SnarioxInformacion.INFO_ELEMENT)
				.isDisplayed()
				);
	}

	@When("{actor} hace scroll TC64")
	public void usuario_hace_scroll_tc64(Actor actor) {
		actor.attemptsTo(
				Scroll.to(SnarioxEmpleados.EMPLOYEES_SNARIOX)
				);
	}

	@Then("{actor} ve una seccion con un div = {string} donde esta el equipo en tarjetas TC64")
	public void usuario_ve_una_seccion_con_un_div_donde_esta_el_equipo_en_tarjetas_tc64(Actor actor,String string) {
		actor.attemptsTo(
				Ensure.that(SnarioxEmpleados.EMPLOYEES_CARD)
				.attributeValues(string).isNotNull()
				);
	}

	@Then("El {actor} ve que cada tarjeta de la seccion empleados incluye texto que no es lorem ipsum TC64")
	public void el_usuario_ve_que_cada_tarjeta_de_la_seccion_empleados_incluye_texto_que_no_es_lorem_ipsum_tc64(Actor actor) {
		boolean validacion = true;
		for(int j = 1; j<=2;j++) { // Comprobamos que el texto no contiene ningun lorem ipsum
			for(int i = 1; i<=2;i++) {
				validacion = Target.the("Fotografía individual de los empleados de Snariox Inc.").
				locatedBy("/html/body/div[2]/div[2]/div["+j+"]/div["+i+"]/div/div/div[2]/div").resolveFor(actor)
				.getText().contains("lorem ipsum");
				
				actor.attemptsTo(
						Ensure.that(validacion).isFalse()
						);
			}
		}		
	}

	@Then("El {actor} ve como se incluye una foto de cada empleado visible TC64")
	public void el_usuario_ve_como_se_incluye_una_foto_de_cada_empleado_visible_tc64(Actor actor) {
	    String pattern = ".*https?:\\/\\/.*\\.(?:png|jpg).*";
	    boolean validacion = false;
	    
		for(int j = 1; j<=2;j++) { // Comprobamos que existe una imagen en las 4 tarjetas
			for(int i = 1; i<=2;i++) {
				validacion = Target.the("Fotografía individual de los empleados de Snariox Inc.").
						locatedBy("/html/body/div[2]/div[2]/div["+j+"]/div["+i+"]/div/div/div[1]").resolveFor(actor)
						.getDomAttribute("style").matches(pattern);
				
				actor.attemptsTo(
						Ensure.that(validacion).isTrue()
						);
			}
		}

	}

	// HU9 | TS61 | TC64 - Usuario puede ver a todo el equipo humano de forma correcta
	@Given("El {actor} entra a la pagina home de la web TC65")
	public void el_usuario_entra_a_la_pagina_home_de_la_web_tc65(Actor actor) {
		actor.wasAbleTo(
				NavigateTo.theSnarioxHomePage()
				);
	}

	@When("La pagina le carga a {actor} exitosamente TC65")
	public void la_pagina_le_carga_a_usuario_exitosamente_tc65(Actor actor) {
		actor.attemptsTo(
				Ensure.that(SnarioxInformacion.INFO_ELEMENT)
				.isDisplayed()
				);
	}

	@When("{actor} hace scroll hacia abajo TC65")
	public void usuario_hace_scroll_hacia_abajo_tc65(Actor actor) {
		actor.attemptsTo(
				Scroll.to(SnarioxEmpleados.EMPLOYEES_SNARIOX)
				);
	}

	@Then("{actor} ve una sección con un div donde esta el equipo en tarjetas TC65")
	public void usuario_ve_una_sección_con_un_div_donde_esta_el_equipo_en_tarjetas_tc65(Actor actor) {
		actor.attemptsTo(
				Ensure.that(SnarioxEmpleados.EMPLOYEES_CARD)
				.attributeValues("container").isNotNull()
				);
	}

	@Then("{actor} ve como cada tarjeta de la seccion empleados incluye iconos con hipervinculos a las RR.SS TC65")
	public void usuario_ve_como_cada_tarjeta_de_la_seccion_empleados_incluye_iconos_con_hipervinculos_a_las_rr_ss_tc65(Actor actor) {
	boolean validacion = false;
	String[] links = {"https://www.facebook.com/","https://www.twitter.com/","https://www.joomla.org/","https://www.linkedin.com/"};
		for(int j = 1; j<=2;j++) { // Comprobamos que existe una imagen en las 4 tarjetas
			for(int i = 1; i<=2;i++) {
				for(int k = 1; k<=4;k++) {
					
					validacion = Target.the("Link de Facebook").
					locatedBy("/html/body/div[2]/div[2]/div["+j+"]/div["+i+"]/div/div/div[2]/div/div/ul/li["+k+"]/a").resolveFor(actor).getAttribute("href")
					.equalsIgnoreCase(links[k-1]);
					
					// Valida cada icono de RR.SS de cada tarjeta
					actor.attemptsTo(
							Ensure.that(validacion).isTrue()
							);
				}
			}
		}
		
		
	}
	
	// HU9 | TS61 | TC82 - Usuario debe poder obtener el puesto de cada empleado de forma exitosa
	@Given("Un {actor} que entra a la web TC82")
	public void un_usuario_que_entra_a_la_web_tc82(Actor actor) {
		actor.wasAbleTo(
				NavigateTo.theSnarioxHomePage()
				);
	}

	@When("El {actor} carga la pagina TC82")
	public void el_usuario_carga_la_pagina_tc82(Actor actor) {
		actor.attemptsTo(
				Ensure.that(SnarioxInformacion.INFO_ELEMENT)
				.isDisplayed()
				);
	}

	@When("{actor} hace scroll y baja hasta la parte de empleados TC82")
	public void usuario_hace_scroll_y_baja_hasta_la_parte_de_empleados_tc82(Actor actor) {
		actor.attemptsTo(
				Scroll.to(SnarioxEmpleados.EMPLOYEES_SNARIOX)
				);
	}

	@Then("{actor} puede ver los puestos de todos los empleados en un div class={string} TC82")
	public void usuario_puede_ver_los_puestos_de_todos_los_empleados_en_un_div_class_tc82(Actor actor,String string) {
		boolean validacion = true;
		for(int j = 1; j<=2;j++) { // Comprobamos que el texto no contiene ningun lorem ipsum
			for(int i = 1; i<=2;i++) {
				validacion = Target.the("Fotografía individual de los empleados de Snariox Inc.").
				locatedBy("/html/body/div[2]/div[2]/div["+j+"]/div["+i+"]/div/div/div[2]/div/p").resolveFor(actor)
				.getText().isBlank();
				
				actor.attemptsTo(
						Ensure.that(validacion).isFalse()
						);
			}
		}	
	}
	
	// HU9 | TS61 | TC85 - Obtener el numero de empleados de la web
	@Given("Un {actor} entra a la pagina home de la web TC85")
	public void un_usuario_entra_a_la_pagina_home_de_la_web_tc85(Actor actor) {
		actor.wasAbleTo(
				NavigateTo.theSnarioxHomePage()
				);
	}

	@When("La pagina le carga a {actor} exitosamente TC85")
	public void la_pagina_le_carga_a_usuario_exitosamente_tc85(Actor actor) {
		actor.attemptsTo(
				Ensure.that(SnarioxInformacion.INFO_ELEMENT)
				.isDisplayed()
				);
	}

	@When("{actor} hace scroll hacia abajo TC85")
	public void usuario_hace_scroll_hacia_abajo_tc85(Actor actor) {
		actor.attemptsTo(
				Scroll.to(SnarioxEmpleados.EMPLOYEES_SNARIOX)
				);
	}

	@Then("El {actor} puede contabilizar un total de {int} tarjetas TC85")
	public void el_usuario_puede_contabilizar_un_total_de_tarjetas_tc85(Actor actor,Integer int1) {
		int contador = 0;
		
		for(int j = 1; j<=2;j++) { // Comprobamos que existen las tarjetas para contabilizarlas indirectamente
			for(int i = 1; i<=2;i++) {
				if(Target.the("Fotografía individual de los empleados de Snariox Inc.").
						locatedBy("/html/body/div[2]/div[2]/div["+j+"]/div["+i+"]").resolveFor(actor)
						.isCurrentlyVisible()) {
					contador++;
				}
			}
		}
		
		actor.attemptsTo(
				// El actor se asegura que hay 4 (cuatro) tarjetas
				Ensure.that(contador).isEqualTo(int1)
				);
	}

}
