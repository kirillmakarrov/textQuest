package ru.exam2.prog.command;

import ru.exam2.prog.GameList;
import ru.exam2.prog.GameObject;

public class StartGame implements Menu {
    private GameObject gameObject;

    public StartGame(GameObject gameObject) {
        this.gameObject = gameObject;
    }

    @Override
    public void execute() {
        GameList gameList = new GameList();
        GameList.game(gameObject);
    }
}
