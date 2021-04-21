package printExample;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("what is your name?");
        String name=scanner.next();
        System.out.println("How old are you?");
        int age=scanner.nextInt();
        System.out.println("Hello "+name+",Next year,you'll be"+(age+1));


    }
}
