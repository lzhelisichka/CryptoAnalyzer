package ru.javarush.cryptoanalyzer.kislyakova.controller;

import ru.javarush.cryptoanalyzer.kislyakova.commands.Action;
import ru.javarush.cryptoanalyzer.kislyakova.entity.Result;

public class MainController {
    public Result execute(String command, String[] parameters) {
        Action action = Actions.find(command);
        return action.execute(parameters);
        //throw new UnsupportedOperationException(); - такая строка в метод, который еще не реализован
    }
}
