package main.java.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * 获取当前时间的运用
 */
public class Time {
    public static void main(String[] args) {
        //获取当前的时间日期
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        //获取当前日期
        LocalDate date = time.toLocalDate();
        System.out.println(date);

        Month month = time.getMonth();
        int day = time.getDayOfMonth();
        int second = time.getSecond();
        System.out.println("月："+month+",日："+day+",秒"+second);

        LocalDateTime date2 = time.withDayOfMonth(10).withYear(2021);
        System.out.println("date2: " + date2);

        // 12 december 2014
        LocalDate date3 = LocalDate.of(2021, Month.DECEMBER, 12);
        System.out.println("date3: " + date3);

        // 22 小时 15 分钟
        LocalTime date4 = LocalTime.of(22, 15);
        System.out.println("date4: " + date4);

        // 解析字符串
        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println("date5: " + date5);
    }
}

/**
 * 运行结果示例：
 * 2021-10-26T10:43:24.679
 * 2021-10-26
 * 月：OCTOBER,日：26,秒24
 * date2: 2021-10-10T10:43:24.679
 * date3: 2021-12-12
 * date4: 22:15
 * date5: 20:15:30
 */
