package ru.javarush.cryptoanalyzer.kislyakova.constants;

public class CipherConstants {
    public static final String rusCapitalLetter = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    public static final String rusSmallLetter = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    public static final int ALPHABET_RUS_LENGTH = rusCapitalLetter.length();

    public static final char[] PUNCTUATION_CHAR_ARRAY = {'(', '.', ',', '”', 'ʼ', ':', '-', '!', '?', ' ', ')'};
    public static final int PUNCTUATION_LENGTH = PUNCTUATION_CHAR_ARRAY.length;
}
