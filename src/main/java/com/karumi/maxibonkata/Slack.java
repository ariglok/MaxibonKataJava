package com.karumi.maxibonkata;

/**
 * Created by gloria on 29/4/17.
 */

public class Slack implements Chat {
    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }
}
