package com.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, +1);
        System.out.println(calendar.getTime());

        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println(simpleDateFormat.format(calendar.getTime()));

    }
}
