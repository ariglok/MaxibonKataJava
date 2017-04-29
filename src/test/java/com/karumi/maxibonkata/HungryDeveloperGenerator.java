package com.karumi.maxibonkata;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

import org.apache.commons.lang3.RandomStringUtils;

public class HungryDeveloperGenerator extends Generator<Developer> {

    private int MAX_MAXIBONS = 10000;

    public HungryDeveloperGenerator() {
        super(Developer.class);
    }

    @Override
    public Developer generate(SourceOfRandomness random, GenerationStatus status) {
        String name = RandomStringUtils.randomAlphabetic(random.nextInt(16));
        int numberMaxibons = random.nextInt(8, MAX_MAXIBONS);
        return new Developer(name, numberMaxibons);
    }
}