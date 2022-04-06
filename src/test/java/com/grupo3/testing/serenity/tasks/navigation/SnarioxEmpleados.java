package com.grupo3.testing.serenity.tasks.navigation;

import net.serenitybdd.screenplay.targets.Target;

public class SnarioxEmpleados {
	
	// Definimos en variables estáticas los targets a utilizar por Serenity BDD
    public static final Target EMPLOYEES_SNARIOX =  
    		Target.the("Div del tarjetero con los empleados de Snariox Inc.").
    		locatedBy("/html/body/div[2]");
    public static final Target EMPLOYEES_CARD =  
    		Target.the("Tarjeta individual de los empleados de Snariox Inc.").
    		locatedBy("/html/body/div[2]/div[2]");
}
