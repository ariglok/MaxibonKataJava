package com.karumi.maxibonkata;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.runner.RunWith;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

@RunWith(JUnitQuickcheck.class) public class DeveloperProperties {


    @Property
    public void theNumberOfMaxibonsToConsumeNotNegative(int numberOfMaxibons) {
        Developer developer = new Developer("Pedro", numberOfMaxibons);
        assertTrue(developer.getNumberOfMaxibonToGrab() >= 0);
    }

    //con trial le decimos las veces que lo ejecutamos
    @Property(trials = 100)
    public void theNumberOfMaxibonsToConsumeName(String nameDeveloper, int numberOfMaxibons) {
        System.out.println("nameDeveloper  "+nameDeveloper);
        System.out.println("numberOfMaxibons  "+numberOfMaxibons);
        Developer developer = new Developer(nameDeveloper, numberOfMaxibons);
        if (numberOfMaxibons < 0){
            assertTrue(developer.getNumberOfMaxibonToGrab() == 0);

        }else{
            assertEquals(numberOfMaxibons, developer.getNumberOfMaxibonToGrab());
        }
        assertEquals(nameDeveloper, developer.getName());
    }

    /*@Property
    public void test2(@From(PositiveNumberGenerator.class) Integer positive){
        System.out.println("PositiveNumberGenerator Test "+positive.intValue());
        Developer developer = new Developer("Pedro", positive.intValue());
        assertTrue(developer.getNumberOfMaxibonToGrab() > 0);
    }*/


}
