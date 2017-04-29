package com.karumi.maxibonkata;

import java.util.List;


public class KarumiHQs {

    private Chat chat;

    private int maxibonsLeft = 10;
    private int minMaxibons = 2;
    private final int NUM_MAXIBON = 10;

    public void openFridge(Developer developer){
        maxibonsLeft = maxibonsLeft - developer.getNumberOfMaxibonToGrab();
        if (maxibonsLeft < 0){
            maxibonsLeft = 0;
        }
        if (maxibonsLeft <= 2){
            maxibonsLeft += NUM_MAXIBON;
            chat.sendMessage("Hay que comprar Maxibons");
        }
    }

    public void openFridge(List<Developer> developerList){
        for(Developer developer: developerList) {
            openFridge(developer);
        }
    }


    public int getMaxibonsLeft() {
        return maxibonsLeft;
    }

    public int getMinMaxibons() {
        return minMaxibons;
    }
}
