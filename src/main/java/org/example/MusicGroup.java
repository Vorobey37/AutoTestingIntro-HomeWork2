package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicGroup {
    private final List<iGetMusic> musicians = new ArrayList<>();


    public List<iGetMusic> getMusicians() {
        return musicians;
    }

    public void addMusician(iGetMusic musician){
        musicians.add(musician);
        System.out.println("В группе появился новый участник: " + musician);
    }

    public void removeMusician(iGetMusic musician) throws RuntimeException{
        if (musicians.isEmpty()){
            throw new RuntimeException("Пустая группа!");
        }

        if (!musicians.contains(musician)){
            throw new RuntimeException("Данного музыканта нет в группе!");
        }

        musicians.remove(musician);
        System.out.println(musician + " покинул группу");
    }

    public void playSong() throws RuntimeException{
        if (musicians.isEmpty()){
            throw new RuntimeException("Группа пустая, некому исполнять песню!");
        }
        System.out.println("Группа исполняет песню!");
        musicians.forEach(iGetMusic::playMusic);
    }
}
