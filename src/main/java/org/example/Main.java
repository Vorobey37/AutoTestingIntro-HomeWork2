package org.example;

public class Main {
    public static void main(String[] args) {

        MusicGroup musicGroup = new MusicGroup();
        musicGroup.addMusician(new Singer("вокалист"));
        musicGroup.addMusician(new Guitarist("гитарист"));
        musicGroup.addMusician(new Drummer("барабанщик"));
        musicGroup.addMusician(new AccordeonPlayer("аккордеонист"));

        try {

            musicGroup.playSong();

        } catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
        }

    }
}