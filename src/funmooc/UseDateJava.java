package src.funmooc;

import java.util.Date;

public class UseDateJava {
    public static void main(String[] args) {
        Date date1 = new Date("December 31 2022");
        System.out.println(date1);
        Date date2 = new Date("January 01 2023");
        System.out.println(date2);
        boolean res1 = date1.before(date2);
        System.out.println(res1);
        boolean res2 = date2.before(date1);
        System.out.println(res2);
    }
}
