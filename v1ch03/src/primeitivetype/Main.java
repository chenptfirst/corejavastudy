package primeitivetype;

public class Main {

    public static void main(String[] args) {
        /**
         * 8进制前有前缀0：八进制010 代表十进制8
         */
        int i8int=010;
        long l8long=010l;
        System.out.println(i8int);
        System.out.println(l8long);

        /**
         * 2进制前有前缀0b或0B：2进制0b10 代表十进制2
         */
        int i2int=0b10;
        long l2long=0B10l;
        System.out.println(i2int);
        System.out.println(l2long);

        /**
         * 16进制前有前缀0x或0X：16进制0b20 代表十进制32
         */
        int i16int=0x20;
        long l16long=0X20l;
        System.out.println(i16int);
        System.out.println(l16long);


        System.out.println(Character.isJavaIdentifierPart('$'));


        var testStr="ccc";
        System.out.println(testStr);

        var testInt=10;
        System.out.println(testInt);
    }

}
