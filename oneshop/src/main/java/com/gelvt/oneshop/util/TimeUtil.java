/**
 * 
 */
package com.gelvt.oneshop.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间工具类.
 * 提供一些处理时间和日期的工具函数
 * @author: Elvin Zeng
 * @date: 17-7-3
 */
public class TimeUtil {
    
    /**
     * 得到n天前的时间
     * @param n 几天
     * @return n天前的当前时刻
     */
    public static Date getNDaysAgo(int n){
        long now = (new Date()).getTime();
        Date d = new Date(now - 3600 * 24 * 1000 * n);
        return d;
    }
    
    /**
     * 获取指定日期的开始时间
     * @param date 日期
     * @return 那天的开始时间
     */
    public static Date getStartTimeOfDay(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date start = calendar.getTime();
        return start;
    }
    
    /**
     * 得到指定日期的结束时间
     * @param date 日期
     * @return 那天的结束时间
     */
    public static Date getEndTimeOfDay(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date end = new Date(calendar.getTime().getTime() - 1);
        return end;
    }

    /**
     * 获取系统当前日期
     * @return 日期字符串
     */
    public static String getDateString(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        return df.format(new Date());
    }
}
