package org.code.Model;

public class Player {
    private String Name;
    private char Symbol;

    public Player(String name, char symbol) {
        Name = name;
        Symbol = symbol;
    }

    public String getName() {
        return Name;
    }

    public char getSymbol() {
        return Symbol;
    }
}
