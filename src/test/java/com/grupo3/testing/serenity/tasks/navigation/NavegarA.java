package com.grupo3.testing.serenity.tasks.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavegarA {
	public static Performable paginaContacto() {
		return Task.where("{0} abre la pagina de Contacto",
		Open.browserOn().the(PaginaContacto.class));
	}
}
