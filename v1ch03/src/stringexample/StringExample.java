package stringexample;

import java.util.ArrayList;
import java.util.List;

public class StringExample {
    public static void main(String[] args) {
        String joinStr=String.join(",","aa","bb","cc");
        System.out.println(joinStr);
        List<String> joinStrList=new ArrayList<>();
        joinStrList.add("aaa");
        joinStrList.add("bbb");
        joinStrList.add("ccc");
        String joinListStr=String.join(";",joinStrList);
        System.out.println(joinListStr);
       String[] joinStrArray=new String[]{"aaa","ccc","ddd"};
        String joinArrayStr=String.join("-",joinStrArray);
        System.out.println(joinArrayStr);
    }

}
