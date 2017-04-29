package com.karumi.maxibonkata;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.runner.RunWith;

import static junit.framework.Assert.assertTrue;

@RunWith(JUnitQuickcheck.class) public class DeveloperProperties {


    @Property
    public void theNumberOfMaxibonsToConsumeNotNegative(int numberOfMaxibons) {
        Developer developer = new Developer("Pedro", numberOfMaxibons);
        assertTrue(developer.getNumberOfMaxibonToGrab() >= 0);
    }

    @Property
    public void theNumberOfMaxibonsToConsumeName(String nameDeveloper, int numberOfMaxibons) {
        Developer developer = new Developer(nameDeveloper, numberOfMaxibons);
        assertTrue(developer.getNumberOfMaxibonToGrab() >= 0);
    }
}
