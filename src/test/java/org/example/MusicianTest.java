package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class MusicianTest {

    @ParameterizedTest
    @ValueSource (strings = {"вокалист", "гитарист", "барабанщик", "аккордеонист"})
    void testGetType(String type){

        if (type.equals("вокалист")){
            Musician singer = new Singer(type);
            Assertions.assertEquals(type, singer.getType());
        }
        if (type.equals("гитарист")) {
            Musician guitarist = new Guitarist(type);
            Assertions.assertEquals(type, guitarist.getType());
        }

        if (type.equals("барабанщик")) {
            Musician drummer = new Drummer(type);
            Assertions.assertEquals(type, drummer.getType());
        }

        if (type.equals("аккордеонист")) {
            Musician accordionPlayer = new AccordeonPlayer(type);
            Assertions.assertEquals(type, accordionPlayer.getType());
        }

    }

    @ParameterizedTest
    @ValueSource (strings = {"вокалист", "гитарист", "барабанщик", "аккордеонист"})
    void testToString(String type){

        switch (type){
            case ("вокалист"):
                Musician singer = new Singer(type);
                Assertions.assertEquals(type, singer.toString());
                break;
            case ("гитарист"):
                Musician guitarist = new Guitarist(type);
                Assertions.assertEquals(type, guitarist.toString());
                break;
            case ("барабанщик"):
                Musician drummer = new Drummer(type);
                Assertions.assertEquals(type, drummer.toString());
                break;
            case ("аккордеонист"):
                Musician accordionPlayer = new AccordeonPlayer(type);
                Assertions.assertEquals(type, accordionPlayer.toString());
                break;
            default:
                break;
        }

    }

    @ParameterizedTest
    @ValueSource (strings = {"вокалист", "гитарист", "барабанщик", "аккордеонист"})
    void testPlayMusic(String type){

        PrintStream standardOut = System.out;
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        switch (type){
            case ("вокалист"):
                iGetMusic singer = new Singer(type);
                singer.playMusic();
                Assertions.assertEquals("вокалист поет песню", outputStreamCaptor.toString().trim());
                break;
            case ("гитарист"):
                iGetMusic guitarist = new Guitarist(type);
                guitarist.playMusic();
                Assertions.assertEquals("гитарист играет на гитаре", outputStreamCaptor.toString().trim());
                break;
            case ("барабанщик"):
                iGetMusic drummer = new Drummer(type);
                drummer.playMusic();
                Assertions.assertEquals("барабанщик играет на барабанах", outputStreamCaptor.toString().trim());
                break;
            case ("аккордеонист"):
                iGetMusic accordionPlayer = new AccordeonPlayer(type);
                accordionPlayer.playMusic();
                Assertions.assertEquals("аккордеонист играет на аккордеоне", outputStreamCaptor.toString().trim());
                break;
            default:
                break;
        }

        System.setOut(standardOut);
    }
}
