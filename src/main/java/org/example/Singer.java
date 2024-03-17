package org.example;

public class Singer extends Musician implements iGetMusic{

    public Singer(String type) {
        super(type);
    }

    @Override
    public void playMusic() {
        System.out.println(type + " поет песню");
    }
}
