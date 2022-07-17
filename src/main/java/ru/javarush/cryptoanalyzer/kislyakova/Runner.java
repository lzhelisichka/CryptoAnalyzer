package ru.javarush.cryptoanalyzer.kislyakova;
import ru.javarush.cryptoanalyzer.kislyakova.app.Application;
import ru.javarush.cryptoanalyzer.kislyakova.controller.MainController;
import ru.javarush.cryptoanalyzer.kislyakova.entity.Result;

public class Runner {
    public static void main(String[] args) {
        MainController mainController = new MainController();
        //1arg = encode 2arg = text.txt 3arg = (where write res) encoded.txt 4arg = (key) 45
        Application app = new Application(mainController);
        if(args.length == 0){
            //уходим в меню и спрашиваем
            //args = getFromMenu();
            //и тут (1) что (2)откуда (3)куда? (4) ключ
        }
        Result res = app.run(args);
        System.out.println(res);
    }
}
