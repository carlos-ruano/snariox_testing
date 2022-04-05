package com.grupo3.testing.serenity.tasks.search;

import net.serenitybdd.screenplay.targets.Target;

public class SnarioxProductosArticle {
	public static final Target H2_PRODUCTOS =  
    		Target.the("article identifier").
    		locatedBy("//*[@id=\"que-ofrecemos\"]");
	public static final Target H2_SERVICIOS =  
    		Target.the("article identifier").
    		locatedBy("//*[@id=\"servicios\"]/h2");
	public static final Target NUM_TARJETAS_PRODUCTOS =  
    		Target.the("numero productos").
    		locatedBy("/html/body/div[1]/div[2]/div/div[1]");
	public static final Target TARJETA_1 =  
    		Target.the("tarjeta productos").
    		locatedBy("/html/body/div[1]/div[2]/div/div[1]/div/div[2]");
	public static final Target TARJETA_2 =  
    		Target.the("tarjeta productos").
    		locatedBy("/html/body/div[1]/div[2]/div/div[2]/div/div[2]");
	public static final Target TARJETA_3 =  
    		Target.the("tarjeta productos").
    		locatedBy("/html/body/div[1]/div[2]/div/div[3]/div/div[2]");
	public static final Target TARJETA_4 =  
    		Target.the("tarjeta productos").
    		locatedBy("/html/body/div[1]/div[2]/div/div[4]/div/div[2]");
	public static final Target TARJETA_5 =  
    		Target.the("tarjeta productos").
    		locatedBy("/html/body/div[1]/div[2]/div/div[5]/div/div[2]");
	public static final Target TARJETA_6 =  
    		Target.the("tarjeta productos").
    		locatedBy("/html/body/div[1]/div[2]/div/div[6]/div/div[2]");
	public static final Target SERVICIO_1 =  
    		Target.the("parrafo servicio").
    		locatedBy("//*[@id=\"servicio1\"]/div[1]/p");
	public static final Target SERVICIO_2 =  
    		Target.the("parrafo servicio").
    		locatedBy("//*[@id=\"servicio2\"]/div[1]/p");
	public static final Target SERVICIO_3 =  
    		Target.the("parrafo servicio").
    		locatedBy("//*[@id=\"servicio3\"]/div[1]/p");
	public static final Target HEADER_SERVICIO_1 =  
    		Target.the("header servicio").
    		locatedBy("//*[@id=\"servicio1\"]/div[1]/h3");
	public static final Target HEADER_SERVICIO_2 =  
    		Target.the("header servicio").
    		locatedBy("//*[@id=\"servicio2\"]/div[1]/h3");
	public static final Target HEADER_SERVICIO_3 =  
    		Target.the("header servicio").
    		locatedBy("//*[@id=\"servicio3\"]/div[1]/h3");
}
