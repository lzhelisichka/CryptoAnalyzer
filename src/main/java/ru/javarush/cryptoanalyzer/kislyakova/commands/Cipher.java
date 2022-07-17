package ru.javarush.cryptoanalyzer.kislyakova.commands;

import ru.javarush.cryptoanalyzer.kislyakova.entity.Result;
import ru.javarush.cryptoanalyzer.kislyakova.entity.ResultCode;
import ru.javarush.cryptoanalyzer.kislyakova.exception.AppException;
import ru.javarush.cryptoanalyzer.kislyakova.util.PathFinder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Cipher implements Action{
    @Override
    public Result execute(String[] parameters) {
        System.out.println("we are here");
        return new Result(ResultCode.OK, "Cipher");

//        String txtFile = parameters[0];
//        String encryptedFile = parameters[0];
//        Path path = Path.of(PathFinder.getRoot() + txtFile);
//        try {
//            List<String> strings = Files.readAllLines(path);
//            for (String string : strings) {
//                System.out.println(string);
//            }
//        } catch (IOException e) {
//            //если не смогли прочесть строки
//            throw new AppException("IO error/not found", e);
//        }
//        return new Result(ResultCode.OK, "read all bytes" + path);
    }
}
