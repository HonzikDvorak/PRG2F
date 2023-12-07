package strinky;

import java.util.Arrays;

public class strinky {
    public static void main(String[] args) {
        String song = "Dream on;Aerosmith; (1973)";
        String[] texts = {"first", "second", "another"};
        System.out.println(texts[1]); //vypis druheho
        String [] splits = song.split(";");
        System.out.println(Arrays.toString(splits));
        String songName = splits[0];
        String composer = splits[1];
        String yearOfRelease = splits[2];


        System.out.println("5" + "2");
        String number = "456";
        System.out.println(number + 42);
        int parsing = Integer.parseInt(number);
        System.out.println(parsing + 42);
        int text = 12345;
        String actualText = String.valueOf(text);
        System.out.println("S");
        actualText.
    }
}
