package printExample;

import java.util.Date;

public class PringExample {

    public static void main(String[] args) {
        double x=100000.0/3;
        System.out.println(x);

        System.out.printf("%8.2f",x);
        System.out.println();
        System.out.printf("%s  a","1234567");
        System.out.println();
        System.out.printf("%tc",new Date());
        System.out.println();
        System.out.printf("%tF",new Date());
        System.out.println();
        System.out.printf("%ts",new Date());
        System.out.println();
        System.out.printf("%tQ",new Date());

        String dateStr=String.format("%tc",new Date());
        System.out.println(dateStr);

        //%1$ 索引序列
        String nowDate=String.format("%1$s %2$tB %2$te %2$tY %3$s %3$s","now date:",new Date(),"aaa");
        System.out.println(nowDate);

        //<表示上次格式化时使用的字符串将被再次使用，
        String dutDate=String.format("%s %tB %<te %<tY","Due date:",new Date());
        System.out.println(dutDate);

    }
}
