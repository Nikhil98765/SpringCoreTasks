package org.example.model;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter implements FactoryBean<Date> {

    @Value("${format}")
    private String format;

    @Value("${date}")
    private String date;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public Date getObject() throws Exception {
        return new SimpleDateFormat(format).parse(date);
    }

    @Override
    public Class<?> getObjectType() {
        return java.util.Date.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
