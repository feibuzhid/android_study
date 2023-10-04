package com.example.helloworld.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author fei
 * @since 2023/10/4
 */
public class DateUtil {

    public static String getNowTime() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date curDate = new Date(System.currentTimeMillis());
        return format.format(curDate);
    }

//    public static void main(String[] args) {
//        System.out.println("getNowTime() = " + getNowTime());
//    }

}
