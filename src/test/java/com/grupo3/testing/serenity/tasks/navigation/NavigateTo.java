package com.grupo3.testing.serenity.tasks.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    
    public static Performable theSnarioxHomePage() {
        return Task.where("{0} abre la Home de Snariox Inc.",
                Open.browserOn().the(SnarioxHomePage.class));
    }
    
    public static Performable theSnarioxContactPage() {
        return Task.where("{0} abre el formulario de contacto de Snariox Inc.",
                Open.browserOn().the(PaginaContacto.class));
    }
}
