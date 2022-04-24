package ru.exam2.prog.command;

import ru.exam2.prog.GameList;
import ru.exam2.prog.GameObject;

import java.util.Scanner;

public interface Menu {
    void execute();

    static Menu getFirstCommand() {
        System.out.println("Меню: \n1. Начать игру \n2. Загрузить игру \n3. Выйти");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.nextLine();
        if (i == 1) {
            return new StartGame(new GameList().getGameList()[0]);
        } else if (i == 2) {
            return new LoadGame();
        } else if (i == 3) {
            return new Exit();
        }
        System.out.println("Введена некорректная команда");
        return null;
    }

    static Menu getSecondCommand(GameObject gameObject) {
        System.out.println("Меню: \n1. Сохранить игру \n2. Загрузить игру \n3. Выйти");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.nextLine();
        if (i == 1) {
            return  new SaveGame(gameObject);
        } else if (i == 2) {
            return new LoadGame();
        } else if (i == 3) {
            return new Exit();
        }
        System.out.println("Введена некорректная команда");
        return null;
    }
}
