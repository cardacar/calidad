package com.udea.e2e.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/requirementsvisualize.feature",
    glue = "com.udea.e2e.stepdefinitions",
    snippets = SnippetType.CAMELCASE
)
public class RequerimentsVisualize {
}
