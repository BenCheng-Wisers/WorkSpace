package com.wisers.adapter;

import java.util.Calendar;
import java.util.Date;

import javax.xml.bind.DatatypeConverter;


public final class DateConverter{
	public static Date parseDate(final String source) {  
		return DatatypeConverter.parseDate(source).getTime();
    }  
  
    public static String printDate(final Date date) {
    	final Calendar cal = Calendar.getInstance();
    	cal.setTime(date);
	    return DatatypeConverter.printDate(cal);
    } 
}
