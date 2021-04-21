package stringexample;

public class StringCharExample {
    public static void main(String[] args) {
        String testStr="abcdefg😂😂";
        System.out.println("Strlength:"+testStr.length());//UTF-16表示的代码单元长度，char数据类型是用UTF-16表示的

        System.out.println("实际·Length:"+testStr.codePointCount(0,testStr.length()));//实际的长度，也就是代码点的长度
    }
}
