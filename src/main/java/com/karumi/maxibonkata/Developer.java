package com.karumi.maxibonkata;

public class Developer {
    private String name;
    private int numberOfMaxibonToGrab;

    public static final Developer PEDRO = new Developer("Pedro", 3);
    public static final Developer JORGE = new Developer("Jorge", 2);
    public static final Developer FRAN = new Developer("Fran", 1);
    public static final Developer DAVIDE = new Developer("Davide", 0);
    public static final Developer SERGIO = new Developer("Sergio", 1);

    public Developer(String name, int numberOfMaxibonToGrab) {
        if (numberOfMaxibonToGrab < 0){
            numberOfMaxibonToGrab = 0;
        }
        this.name = name;
        this.numberOfMaxibonToGrab = numberOfMaxibonToGrab;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfMaxibonToGrab() {
        return numberOfMaxibonToGrab;
    }

    public void setNumberOfMaxibonToGrab(int numberOfMaxibonToGrab) {
        this.numberOfMaxibonToGrab = numberOfMaxibonToGrab;
    }


}
