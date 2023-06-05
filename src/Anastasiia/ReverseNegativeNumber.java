package Anastasiia;

public class ReverseNegativeNumber {
/*
    public static void main(String[] args) {

    Reverse(-12546);
    Reverse(12546);
    Reverse(0);

       int b=a;
        int count=1;

        for (int i = 0; i < a; i++) { //i=1, a=123
            b=b/10;                 // a=0
            if (b>0){               //0>0
                count++;           //count==3
            }else {
                break;
            }

        }
        System.out.println("count = " + count);
        System.out.println("a = " + a);

        int reverse=0;

        for (int i = 0; i < count; i++) { // i=2; a=1234;

            int remainder=a % 10; //3

            reverse=010+remainder;  //4

            a=a/10;
        }

       int a=1234;

        int remainder = 1234 % 10; //4

        int reverse = remainder;

        b=b/10; //123

        remainder=b % 10; //3/
    }

 */

        public static void Reverse(int a){

            boolean sign = false;

            if (a < 0){
                sign = true;
                a = -a;
            }
            String aString=String.valueOf(a);

            String result= "";

            for (int i = aString.length()-1; i >= 0; i--) {
                result += aString.charAt(i);
            }
            int b = Integer.parseInt(result);

            if (sign){
                b = -b;
            }
            System.out.println("reverse a: "+ b);
        }

        public static void main(String[] args) {

            Reverse(-123);
        }
    }

