package ru.javarush.cryptoanalyzer.kislyakova;
import ru.javarush.cryptoanalyzer.kislyakova.app.Application;
import ru.javarush.cryptoanalyzer.kislyakova.controller.MainController;

public class Runner {
    public static void main(String[] args) {
        MainController mainController = new MainController();
        Application app = new Application(mainController);
        Result res = app.run(args);
        app.show(res);
    }
}
