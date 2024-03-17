package org.example;

public class Drummer extends Musician implements iGetMusic{

    public Drummer(String type) {
        super(type);
    }

    @Override
    public void playMusic() {
        System.out.println(type + " играет на барабанах");
    }
}
