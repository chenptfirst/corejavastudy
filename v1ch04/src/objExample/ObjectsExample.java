package objExample;

import java.util.Objects;
import java.util.function.Supplier;

public class ObjectsExample {

    public static void main(String[] args) {

        String str1=null;
        str1=Objects.requireNonNullElse(str1,"默认为空");
        System.out.println(str1);

//        String str2=null;
//        Objects.requireNonNullElseGet(str2);
//        str2="HelloWorld";
//        System.out.println(str2);

//        String str3=null;
//        Objects.requireNonNull(str3);

        String str4=null;
        str4=Objects.requireNonNull(str4,"Str不能为空");
        System.out.println(str4);
    }
}
