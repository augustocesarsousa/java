package com.acsousa.javacourse._08_dates;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class _02_Calendar {

  public static void main(String[] args) {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

    System.out.println("Original date: " + sdf.format(d));

    Calendar cal = Calendar.getInstance();
    cal.setTime(d);

    System.out.println("Year: " + cal.get(Calendar.YEAR));
    System.out.println("Month: " + (cal.get(Calendar.MONTH) + 1));
    System.out.println("Day of month: " + cal.get(Calendar.DAY_OF_MONTH));
    System.out.println("Day of week: " + cal.get(Calendar.DAY_OF_WEEK));
    System.out.println("Hour: " + cal.get(Calendar.HOUR_OF_DAY));
    System.out.println("Minutes: " + cal.get(Calendar.MINUTE));
    System.out.println("Seconds: " + cal.get(Calendar.SECOND));

    cal.add(Calendar.HOUR_OF_DAY, 4);
    d = cal.getTime();
    System.out.println("Added 4 hours: " + sdf.format(d));
  }
}
