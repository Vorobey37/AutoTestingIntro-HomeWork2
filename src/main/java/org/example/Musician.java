package org.example;

public abstract class Musician {
    protected String type;

    public Musician(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type;
    }
}
