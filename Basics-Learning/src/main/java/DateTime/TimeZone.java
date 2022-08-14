package main.java.DateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 获取当前时间区
 */
public class TimeZone {
    public static void main(String[] args) {
        ZonedDateTime time = ZonedDateTime.now();
        System.out.println(time);

        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println(id);

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
    }
}
/**
 * 运行结果示例：
 * 2021-10-26T10:51:39.889+08:00[Asia/Shanghai]
 * Europe/Paris
 * Asia/Shanghai
 */
