package com.karumi.maxibonkata;

import java.util.List;

/**
 * Created by gloria on 29/4/17.
 */

public class KarumiHQs {
    private int maxibonsLeft = 10;
    private int minMaxibons = 2;

    public void openFridge(Developer developer){
        maxibonsLeft = maxibonsLeft - developer.getNumberOfMaxibonToGrab();
        if (maxibonsLeft < 0){
            maxibonsLeft = 0;
        }
    }

    public void openFridge(List<Developer> developerList){
        for(Developer developer: developerList) {
            openFridge(developer);
            if (maxibonsLeft <= 2){
                maxibonsLeft += maxibonsLeft;
            }
        }
    }


}
