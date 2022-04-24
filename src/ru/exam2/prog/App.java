package ru.exam2.prog;

import ru.exam2.prog.command.Menu;

public class App {
    public static void main(String[] args) {
        Menu.getFirstCommand().execute();
    }
}
