package Anastasiia;

public class UniqueString {

    public static String unique(String str) { //"AAABBBCCCDEF"

        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (str.indexOf(each) == str.lastIndexOf(each)) {  //"AAA BBB CCC D E F"
                unique += each;
            }
        }
        return unique;

    }

    public static void main(String[] args) {

        System.out.println(unique("AAABBABCCCDEF")); //DEF
    }
}
