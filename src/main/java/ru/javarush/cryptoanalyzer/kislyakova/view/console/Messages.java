package ru.javarush.cryptoanalyzer.kislyakova.view.console;
import ru.javarush.cryptoanalyzer.kislyakova.controller.Actions;

public interface Messages {
    String[][][] QUESTIONS = new String[][][]{
            {
                {Actions.CIPHER.name()},
                {"Укажите путь к файлу, который надо зашифровать:"},
                {"Введите ключ (одинаков для шифрования и дешифрования):"},
            },
            {
                {Actions.DECIPHER.name()},
                {"Укажите путь к файлу, который надо расшифровать"},
                {"Введите ключ (одинаков для шифрования и дешифрования):"},
            },
            {
                {Actions.BRUTEFORCE.name()},
                {"Укажите путь к файлу, который надо взломать:"},
            },
            {
                {Actions.EXIT.name()},
            }
    };

    String ANSI_RESET = "\u001B[0m";
    String ANSI_BLUE = "\u001B[34m";
    String ANSI_CYAN = "\u001B[36m";
    String ANSI_PURPLE = "\u001B[35m";
    String ANSI_GREEN = "\u001B[32m";

    String LINE = "-".repeat(20);

    String MESSAGE_SELECT_MODE = LINE +
            ANSI_BLUE + "\nВыберите команду:\n" + """
            1. Зашифровать,
            2. Расшифровать,
            3. Взломать,
            4. Завершить работу
            """ + ANSI_RESET + LINE;

    String INCORRECT_SELECTION = "Простите, я не понял Ваш ответ. Я не настолько умный (ಥ﹏ಥ)";

    String OK_FORMAT = ANSI_GREEN + """
                Operation complete
                Result: %s
            """ + ANSI_RESET;

    String ERROR_FORMAT = ANSI_PURPLE + """
                ERROR
                Message: %s
            """ + ANSI_RESET;
}
