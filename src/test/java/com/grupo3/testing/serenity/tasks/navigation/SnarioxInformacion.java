package com.grupo3.testing.serenity.tasks.navigation;

import net.serenitybdd.screenplay.targets.Target;

public class SnarioxInformacion {
	// Definimos en avriables estáticas los targets a utilizar por Serenity BDD
    public static final Target TITLE_SNARIOX =  
    		Target.the("Cabecero de la web").
    		locatedBy("/html/head/title");
    public static final Target INFO_SNARIOX =  
    		Target.the("La información dentro del su <div>").
    		locatedBy("//*[@id=\"snariox-text\"]/p");
    public static final Target INFO_ELEMENT =  
    		Target.the("El <div> de la información de Snariox").
    		locatedBy("#snariox-text");
    public static final Target INFO_TITLE =  
    		Target.the("El <h1> asociado contiene del texto").
    		locatedBy("//*[@id=\"snariox-text\"]/h1");
    public static final Target FOOTER =  
    		Target.the("El footer de la web").
    		locatedBy("/html/body/footer");
    public static final Target FOOTER_RRSS =  
    		Target.the("Caja de las RRSS del footer").
    		locatedBy("//*[@id=\"redes-sociales\"]");
    public static final Target FOOTER_INSTAGRAM =  
    		Target.the("Link 'Instagram' del footer").
    		locatedBy("//*[@id=\"redes-sociales\"]/a[1]");
    public static final Target FOOTER_FACEBOOK =  
    		Target.the("Link 'Facebook' del footer").
    		locatedBy("//*[@id=\"redes-sociales\"]/a[2]");
    public static final Target FOOTER_LINKEDIN =  
    		Target.the("Link 'Linkedin' del footer").
    		locatedBy("//*[@id=\"redes-sociales\"]/a[3]");
    public static final Target FOOTER_TWITTER =  
    		Target.the("Link 'Twitter' del footer").
    		locatedBy("//*[@id=\"redes-sociales\"]/a[4]");
    public static final Target FOOTER_TYC =  
    		Target.the("Year de los términos y condiciones").
    		locatedBy("/html/body/footer/div/div/div[1]/p[1]");    
    public static final Target FOOTER_COPYRIGHT =  
    		Target.the("Year del Copyright").
    		locatedBy("/html/body/footer/div/div/div[1]/p[2]");
    public static final Target LINK_HOME =  
    		Target.the("Link 'Home' del footer").
    		locatedBy("/html/body/footer/div/div/div[2]/ul/li[1]/a");
    public static final Target FOOTER_CONTACTO =  
    		Target.the("Enlace a la página del formulario").
    		locatedBy("/html/body/footer/div/div/div[2]/ul/li[2]/a");   
    public static final Target FOOTER_LUCATIC =  
    		Target.the("Enlace a la web de LucaTIC").
    		locatedBy("/html/body/footer/div/div/div[2]/ul/li[3]/a");      
}
