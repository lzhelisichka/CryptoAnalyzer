package ru.javarush.cryptoanalyzer.kislyakova.app;
import ru.javarush.cryptoanalyzer.kislyakova.Result;
import ru.javarush.cryptoanalyzer.kislyakova.controller.MainController;

import java.util.Arrays;

public class Application {
    private final MainController mainController;

    public Application(MainController mainController) {
        this.mainController = mainController;
    }

    public Result run(String[] args) {
        String command = args[0];
        String[] parameters = Arrays.copyOfRange(args, 1, args.length);
        return mainController.execute(command, parameters);
    }

    public void show(Result res) {
    }
}
