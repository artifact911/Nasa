package com.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Today {
    public static void main(String[] args) {
        Date date = new Date();
        //date.getTime();
        date.setTime(1L);


        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        // calendar.add(Calendar.DAY_OF_MONTH, 1);
        // calendar.add(Calendar.WEEK_OF_MONTH, 1);

        /*DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT); // I can forget it
        //dateFormat.format(date);
        System.out.println(dateFormat.format(date));*/

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("G");
        SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("MMM");
        //simpleDateFormat.format(date);

        String userDate = "18/02/28";
        Date newDate = null;

        try {
            newDate = simpleDateFormat.parse(userDate);
        } catch (ParseException e) {
            System.out.println(e.getClass().getName());
        }


        System.out.println(simpleDateFormat.format(date));
        System.out.println(simpleDateFormat2.format(date));
        System.out.println(simpleDateFormat3.format(date));
        System.out.println(simpleDateFormat4.format(date));

        System.out.println("**************");

        System.out.println(newDate);
    }
}
