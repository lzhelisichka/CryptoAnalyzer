package ru.javarush.cryptoanalyzer.kislyakova.commands;
import ru.javarush.cryptoanalyzer.kislyakova.entity.Result;
import ru.javarush.cryptoanalyzer.kislyakova.entity.ResultCode;
import ru.javarush.cryptoanalyzer.kislyakova.exception.AppException;
import ru.javarush.cryptoanalyzer.kislyakova.util.CreateResultFile;
import static ru.javarush.cryptoanalyzer.kislyakova.constants.CipherConstants.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Bruteforce implements Action {
    @Override
    public Result execute(String[] parameters) {
        Path filePath = Path.of(parameters[0]);
        String text;
        try {
            text = Files.readString(filePath);
        } catch (IOException e) {
            e.printStackTrace();
            throw new AppException("Произошла ошибка при работе с файлом", e);
        }
        StringBuilder resultText = bruteforce(text);
        CreateResultFile.createFileWithResult(filePath, "_bruteforce", resultText);
        return new Result(ResultCode.OK, "Bruteforce");
    }

    //ищем код
    private int bruteforce(String text) {
        return probableOffset(chiSquares(text));
    }

    //Создание массива, который будет содержать вычисленные Хи-квадраты для каждого смещения от 0 до 32
    //используем каждое смещение, а затем считаем буквы в этом сообщении
    //метод ChiSquareTest (из maven) для вычисления Хи-квадрата между ожидаемым и наблюдаемым распределением букв
    private double[] chiSquares(String text) {
        double[] expectedLettersFrequencies = expectedLettersFrequencies(text.length());
        double[] chiSquares = new double[ALPHABET_RUS_LENGTH];
        for (int offset = 0; offset < chiSquares.length; offset++) {
            Decipher decipher = new Decipher();
            String decipheredMessage = String.valueOf(decipher.decipher(text, offset));
            long[] lettersFrequencies = observedLettersFrequencies(decipheredMessage);
            double chiSquare = new ChiSquareTest().chiSquare(expectedLettersFrequencies, lettersFrequencies);
            chiSquares[offset] = chiSquare;
        }

        return chiSquares;
    }

    //Метод определяет количество букв от "а" до "я" (включая ё) в переданном сообщении
    private long[] observedLettersFrequencies(String text) {
        IntStream intStream = IntStream.of('a', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з',
                'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р',
                'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
                'ъ', 'ы', 'ь', 'э', 'ю', 'я');
        return intStream
                .mapToLong(letter -> countLetter((char) letter, text))
                .toArray();
    }

    //вспомогательный метод для observedLettersFrequencies - определяем частоту буквы в тексте
    private long countLetter(char letter, String text) {
        return text.chars()
                .filter(character -> character == letter)
                .count();
    }

    //Метод для вычисления ожидаемых частот букв в сообщении
    //на основе умножения вероятности (RUS_LETTERS_PROBABILITIES) на длину сообщения
    private double[] expectedLettersFrequencies(int messageLength) {
        return Arrays.stream(RUS_LETTERS_PROBABILITIES)
                .map(probability -> probability * messageLength)
                .toArray();
    }

    //Метод для получения смещения:
    //после вычисления всех Хи-квадратов можем вернуть смещение, соответствующее наименьшему Хи-квадрату
    private int probableOffset(double[] chiSquares) {
        int probableOffset = 0;
        for (int offset = 0; offset < chiSquares.length; offset++) {
            if (chiSquares[offset] < chiSquares[probableOffset]) {
                probableOffset = offset;
            }
        }
        return probableOffset;
    }
}
