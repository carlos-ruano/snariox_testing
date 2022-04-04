package com.grupo3.testing.serenity.tasks.search;

import net.serenitybdd.screenplay.targets.Target;

public class SnarioxProductosArticle {
	public static final Target H2_PRODUCTOS =  
    		Target.the("article identifier").
    		locatedBy("//*[@id=\"que-ofrecemos\"]");
	public static final Target H2_SERVICIOS =  
    		Target.the("article identifier").
    		locatedBy("//*[@id=\"que-ofrecemos\"]");
}
