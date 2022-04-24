package ru.exam2.prog.command;

import ru.exam2.prog.GameObject;

import java.io.*;

public class SaveGame implements Menu {
    private GameObject gameObject;
    public SaveGame(GameObject gameObject){
        this.gameObject=gameObject;
    }
    @Override
    public void execute() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream(new File("save")))) {
            outputStream.writeObject(gameObject);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
