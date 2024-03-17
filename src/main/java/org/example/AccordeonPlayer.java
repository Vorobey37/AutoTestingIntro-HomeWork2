package org.example;

public class AccordeonPlayer extends Musician implements iGetMusic{

    public AccordeonPlayer(String type) {
        super(type);
    }

    @Override
    public void playMusic() {
        System.out.println(type + " играет на аккордеоне");
    }
}
