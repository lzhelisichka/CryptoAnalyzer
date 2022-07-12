package ru.javarush.cryptoanalyzer.kislyakova.app;
import ru.javarush.cryptoanalyzer.kislyakova.Result;
import ru.javarush.cryptoanalyzer.kislyakova.controller.MainController;

import java.util.Arrays;

public record Application(MainController mainController) {

    public Result run(String[] args) {
        String command = args[0];
        String[] parameters = Arrays.copyOfRange(args, 1, args.length);
        return mainController.execute(command, parameters);
    }

    public void show(Result res) {
    }
}
