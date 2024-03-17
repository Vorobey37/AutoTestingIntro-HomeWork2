package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;


public class MusicGroupTest {

    private MusicGroup group;
    private iGetMusic singer;
    private iGetMusic guitarist;
    private iGetMusic drummer;
    private iGetMusic accordionPlayer;


    @BeforeEach
    void setUp(){
        group = new MusicGroup();
        singer = new Singer("вокалист");
        guitarist = new Guitarist("гитарист");
        drummer = new Drummer("барабанщик");
        accordionPlayer = new AccordeonPlayer("аккордеонист");

    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    void testAddMusician(int index){

        iGetMusic[] list = {singer, guitarist, drummer, accordionPlayer};

        group.addMusician(list[index]);
        Assertions.assertTrue(group.getMusicians().contains(list[index]));
        Assertions.assertEquals(1, group.getMusicians().size());
        Assertions.assertEquals(list[index], group.getMusicians().get(0));

    }

    @Test
    void testGetMusicians(){

        Assertions.assertTrue(group.getMusicians().isEmpty());

        group.addMusician(singer);
        group.addMusician(guitarist);
        group.addMusician(drummer);
        group.addMusician(accordionPlayer);

        Assertions.assertEquals(4, group.getMusicians().size());
    }

    @Test
    void testRemoveMusician(){

        Assertions.assertThrows(RuntimeException.class, () -> group.removeMusician(singer));

        group.addMusician(singer);
        group.addMusician(guitarist);

        Assertions.assertThrows(RuntimeException.class, () -> group.removeMusician(drummer));

        group.removeMusician(singer);

        Assertions.assertEquals(guitarist, group.getMusicians().get(0));
        Assertions.assertEquals(1, group.getMusicians().size());
    }

    @ParameterizedTest
    @ValueSource (ints = {0, 1, 2, 3})
    void parameterizedTestRemoveMusician(int index){

        iGetMusic[] list = {singer, guitarist, drummer, accordionPlayer};

        group.addMusician(singer);
        group.addMusician(guitarist);
        group.addMusician(drummer);
        group.addMusician(accordionPlayer);

        group.removeMusician(list[index]);
        Assertions.assertFalse(group.getMusicians().contains(list[index]));

    }

    @Test
    void testPlaySong(){

        Assertions.assertThrows(RuntimeException.class, () -> group.playSong());
    }

}
