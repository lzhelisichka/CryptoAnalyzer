package ru.javarush.cryptoanalyzer.kislyakova.constants;

public class CipherConstants {
    public static final String RUS_CAPITAL_LETTER = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    public static final String RUS_SMALL_LETTER = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    public static final int ALPHABET_RUS_LENGTH = RUS_CAPITAL_LETTER.length();

    public static final char[] PUNCTUATION_CHAR_ARRAY = {'(', '.', ',', '”', 'ʼ', ':', '-', '!', '?', ' ', ')'};
    public static final int PUNCTUATION_LENGTH = PUNCTUATION_CHAR_ARRAY.length;

    //ну тут все приватное кроме алфавита
    //private static final String cyphers = "1234567890";
    //private static final String punctuation = "., "()..";
    //public static final String ALPHABET = rus + eng + cyphers + punctuation;
}
