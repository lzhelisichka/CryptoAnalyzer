package ru.javarush.cryptoanalyzer.kislyakova.view.console;

import ru.javarush.cryptoanalyzer.kislyakova.constants.CipherConstants;

public interface Messages {
    String[][][] QUESTIONS = new String[][][]{
            {
                    //{CipherConstants.ENCODE}, //?
                    {"Enter spurce..."},
                    {"Enter destination.."},
                    {"Enter key..."},
            },
            {
                    //{CipherConstants.ENCODE},
                    {"Enter spurce..."},
                    {"Enter destination.."},
                    {"Enter key..."},
            },
            {
                    {"Exit"},
            }
    };

    String ANSI_RESET = "\u001B[0m";
    String ANSI_BLUE = "\u001B[34m";
    String ANSI_CYAN = "\u001B[36m";
    String ANSI_PURPLE = "\u001B[35m";
    String ANSI_GREEN = "\u001B[32m";

    String LINE = "-".repeat(20);

    String MESSAGE_SELECT_MODE = LINE +
            ANSI_BLUE + "\nPlease select mode:\n" + """
            1. Encrypt,
            2. Decrypt,
            3. Bruteforce,
            4. Analyze,
            5. Exit
            """ + ANSI_RESET + LINE;

    String INCORRECT_SELECTION = "Incorrect selection";

    String OK_FORMAT = ANSI_GREEN + """
                Operation complete
                Result: %s
            """ + ANSI_RESET;

    String ERROR_FORMAT = ANSI_PURPLE + """
                ERROR
                Message: %s
            """ + ANSI_RESET;
}
