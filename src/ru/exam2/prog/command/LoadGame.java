package ru.exam2.prog.command;

import ru.exam2.prog.GameObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LoadGame implements Menu {
    private GameObject gameObject;
    @Override
    public void execute() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("save"))) {
            this.gameObject= (GameObject) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        new StartGame(gameObject).execute();
    }
}
