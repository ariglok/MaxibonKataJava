package com.karumi.maxibonkata;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import java.util.List;
import org.junit.Before;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.mock;


@RunWith(JUnitQuickcheck.class) public class KarumiHQsProperties {

    private KarumiHQs karumiHQs;
    private Chat chat;

    @Before public void setUp(){
        chat = mock(Chat.class);
        karumiHQs = new KarumiHQs(chat);
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

    @Property
    public void test4(List<@From(HungryDeveloperGenerator.class) Developer> developers) {

        karumiHQs.openFridge(developers);

        assertTrue(karumiHQs.getMaxibonsLeft() > 2);
    }

    @Property
    public void test5(List<@From(NoHungryDeveloperGenerator.class) Developer> developers) {

        karumiHQs.openFridge(developers);

        assertTrue(karumiHQs.getMaxibonsLeft() > 2);
    }
}
