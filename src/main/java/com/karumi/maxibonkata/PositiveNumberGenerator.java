package com.karumi.maxibonkata;


import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

import java.util.List;

public class PositiveNumberGenerator extends Generator<Integer> {
    public PositiveNumberGenerator(Class<Integer> type) {
        super(type);
    }

    public PositiveNumberGenerator(List<Class<Integer>> types) {
        super(types);
    }

    @Override
    public Integer generate(SourceOfRandomness random, GenerationStatus status) {
        return null;
    }
}
