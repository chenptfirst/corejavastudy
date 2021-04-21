package printExample;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class ScannerFileExample {
    public static void main(String[] args) throws IOException {
        PrintWriter out=new PrintWriter("myfile.txt",StandardCharsets.UTF_8);
        out.println("123456");
        out.println("765");
        out.flush();





        
        Scanner scanner=new Scanner(Path.of("myfile.txt"), StandardCharsets.UTF_8);
        System.out.println(scanner.next());
        System.out.println(scanner.next());


    }

}
