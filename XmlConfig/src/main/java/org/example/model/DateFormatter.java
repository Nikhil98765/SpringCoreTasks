package org.example.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateFormatter {

    String pattern;

    public static Date dateFormatter(String date, String pattern) throws ParseException {
        return  new SimpleDateFormat(pattern).parse(date);
    }

}
