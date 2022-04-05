package com.grupo3.testing.serenity;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty","json:target/serenity-reports/cucumber_report.json"},
        features = "src/test/resources/features",
        tags = "not @prueba"
        //Si solo quisieramos usar un escenario concreto, podemos usar
        //features = "src/test/resources/features/InformacionHome/obtenerInformacionHome.feature"
)
public class CucumberTestSuite {}
