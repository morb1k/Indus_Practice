package VladimirKozhanov;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        String word = "Nasdas aAff";
        String[] words = new String[0];
        words = word.split(" ");


        System.out.println(Arrays.toString(words));
    }
}
