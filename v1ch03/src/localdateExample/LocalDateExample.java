package localdateExample;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class LocalDateExample {

    public static void main(String[] args) {

        /**
         * \t是补全当前字符串长度到8的整数倍，最少1个最多8个空格
         *
         * 补多少要看你\t前字符串长度
         *
         * 比如当前字符串长度10，那么\t后长度是16，也就是补6个空格
         *
         * 如果当前字符串长度12，此时\t后长度是16，补4个空格
         */
        String[] week=new String[]{"一","二","三","四","五","六","日"};
        LocalDate nowDate=LocalDate.now();
        LocalDate startDate=LocalDate.of(nowDate.getYear(),nowDate.getMonth(),1);
        for (int i = 0; i < week.length; i++) {
            System.out.printf("%s\t",week[i]);
        }
        System.out.println();
        //日历开始的空格
        int startDayWeekValue=startDate.getDayOfWeek().getValue();
        for (int j = 0; j <startDayWeekValue-1; j++) {
            System.out.print("\t");
        }
        while (startDate.getMonth()==nowDate.getMonth()){
            DayOfWeek dayOfWeek=startDate.getDayOfWeek();
            int weekValue=dayOfWeek.getValue();
            for (int i = 0; i < week.length; i++) {
                if (i==weekValue-1){
                    String dateStr=String.valueOf(startDate.getDayOfMonth());
                    if (startDate.compareTo(nowDate)==0){
                        dateStr=dateStr+"*";
                    }
                    System.out.printf("%s\t",dateStr);
                    if (i==week.length-1){
                        System.out.println();
                    }
                    break;
                }
            }
            startDate=startDate.plusDays(1);
        }



    }

}
