package ru.javarush.cryptoanalyzer.kislyakova.commands;

import ru.javarush.cryptoanalyzer.kislyakova.entity.Result;
import ru.javarush.cryptoanalyzer.kislyakova.exception.AppException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public interface Action {
    Result execute(String[] parameters);
}
