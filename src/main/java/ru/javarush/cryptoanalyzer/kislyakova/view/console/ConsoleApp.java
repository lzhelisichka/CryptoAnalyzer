package ru.javarush.cryptoanalyzer.kislyakova.view.console;

import ru.javarush.cryptoanalyzer.kislyakova.controller.MainController;
import ru.javarush.cryptoanalyzer.kislyakova.entity.Result;

public class ConsoleApp {
    private final MainController mainController;
    private final Menu menu;

    public ConsoleApp(MainController mainController, Menu menu) {
        this.mainController = mainController;
        this.menu = menu;
    }
}
