package com.cucumberMaven;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@Cucumber.Options(features= {"features"},glue= {"com.cucumberMaven"})
public class TestRunner {

}
