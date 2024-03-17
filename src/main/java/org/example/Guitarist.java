package org.example;

public class Guitarist extends Musician implements iGetMusic{

    public Guitarist(String type) {
        super(type);
    }

    @Override
    public void playMusic() {
        System.out.println(type + " играет на гитаре");
    }
}
