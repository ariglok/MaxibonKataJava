package com.karumi.maxibonkata;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import java.util.List;
import org.junit.Before;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertTrue;




@RunWith(JUnitQuickcheck.class) public class KarumiHQsProperties {

    private KarumiHQs karumiHQs;

    @Before public void setUp(){
        karumiHQs = new KarumiHQs();
    }

    @Property
    public void test(String nombre, int numberMaxibos) {
        Developer developer = new Developer(nombre, numberMaxibos);

        karumiHQs.openFridge(developer);

        assertTrue(karumiHQs.getMaxibonsLeft() > 2);
    }

    @Property
    public void test2(@From(KarumiesGenerator.class) Developer developer) {

        karumiHQs.openFridge(developer);

        assertTrue(karumiHQs.getMaxibonsLeft() > 2);
    }

    @Property
    public void test3(List<@From(KarumiesGenerator.class) Developer> developers) {

        karumiHQs.openFridge(developers);

        assertTrue(karumiHQs.getMaxibonsLeft() > 2);
    }
}
