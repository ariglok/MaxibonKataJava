package com.karumi.maxibonkata;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by gloria on 29/4/17.
 */

public class TestUnitarios {
    @Test
    public void grabsFourLetsSix(){
        KarumiHQs office = new KarumiHQs(mock(Chat.class));
        Developer developer = new Developer("pedro",4);

        office.openFridge(developer);
        assertEquals(6,office.getMaxibonsLeft());
    }

    @Test
    public void grabsNineLetsEleven(){
        KarumiHQs office = new KarumiHQs(mock(Chat.class));
        Developer developer = new Developer("pedro",9);

        office.openFridge(developer);
        assertEquals(11,office.getMaxibonsLeft());
    }

    @Test
    public void grabsFifteenLetsTen(){
        KarumiHQs office = new KarumiHQs(mock(Chat.class));
        Developer developer = new Developer("pedro",15);

        office.openFridge(developer);
        assertEquals(10,office.getMaxibonsLeft());
    }
}
