package task4.taskforclass;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static List<String> randomPhrase(int N){
        List<String> phrases = new ArrayList<>(N);
        for(int i=0; i<N; i++)
            phrases.add(givenUsingRandom());
        return phrases;
    }

    public static void printPhrases(List<String> phrases){
        for(String ph : phrases) {
            System.out.println(ph);
            System.out.println(5);
        }
    }

    public static String givenUsingRandom() {
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);

        return new String(array, StandardCharsets.UTF_8);
    }

    public static void main(String[] args) {
        printPhrases(randomPhrase(5));
    }
}
