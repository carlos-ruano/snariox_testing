package com.grupo3.testing.serenity.tasks.navigation;

import net.serenitybdd.screenplay.targets.Target;

public class SnarioxInformacion {
    public static final Target INFO_SNARIOX =  
    		Target.the("La información dentro del su <div>").
    		locatedBy("//*[@id=\"snariox-text\"]/p");
    public static final Target INFO_ELEMENT =  
    		Target.the("El <div> de la información de Snariox").
    		locatedBy("#snariox-text");
}
