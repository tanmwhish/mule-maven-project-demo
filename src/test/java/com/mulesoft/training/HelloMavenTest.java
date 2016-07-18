package com.mulesoft.training;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTest extends FunctionalTestCase {

    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
        runFlowAndExpect("mule-maven-demo-projectFlow", "Hello Maven");
    }
    
    @Override
    protected String getConfigFile() {
        return "mule-maven-demo-project.xml";
    }

}
