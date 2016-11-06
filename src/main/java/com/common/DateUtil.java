package com.common;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * <p>
 * FileName: DateUtil.java
 * </p>
 * <p>
 * Description: 日期实用类，提供了一些常用的日期转换、计算等的静态类方法。
 * </p>
 * <p>
 * Copyright: Copyright (c)FiberHome 2011
 * </p>
 * <p>
 * </p>
 * <p>
 * </p>
 * <p>
 * 
 * @version: 1.0
 * </p>
 * <p>
 * Create at: 2011-12-27 下午15:00
 * </p>
 * <p>
 * Modification History:
 * </p>
 * <p>
 * ----------------------------------------------------
 * </p>
 * <p>
 * Date Author Version Description
 * </p>
 */
public class DateUtil
{
    private static final int       LAST_SECOND_OF_MINUTE = 59;
    private static final int       LAST_MINUTE_OF_HOUR   = 59;
    private static final int       LAST_HOUR_OF_DAY      = 23;
    public static int              YEAR                  = 1;
    public static int              MONTH                 = 2;
    public static int              WEEK_OF_YEAR          = 3;
    public static int              WEEK_OF_MONTH         = 4;
    public static int              DAY_OF_MONTH          = 5;
    public static int              DAY_OF_YEAR           = 6;
    /** 年 格式化 */
    public static final String     YEAR_MONTH            = "yyyy-MM";
    /** 日期 格式化 */
    public static final String     DATE                  = "yyyy-MM-dd";
    /** 日期时间 格式化 */
    public static final String     TIMESTAMP             = "yyyy-MM-dd HH:mm:ss";
    public static final DateFormat df                    = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    /**
     * 返回指定日期类型日期增量日期
     * 
     * @param dateType 日期类型
     * @param count 增加数量，可以为负数
     * @return
     */
    public static Date getMagicDate(int dateType, int count)
    {
        Calendar calendar = new GregorianCalendar();
        Date todayTime = new Date();
        calendar.setTime(todayTime);
        calendar.add(dateType, count);
        return calendar.getTime();
    }

    public static long dateDiff(String startTime, String endTime, String format) throws ParseException
    {
        // 按照传入的格式生成一个simpledateformate对象
        SimpleDateFormat sd = new SimpleDateFormat(format);
        long nd = 1000 * 24 * 60 * 60;// 一天的毫秒数
        long nh = 1000 * 60 * 60;// 一小时的毫秒数
        long nm = 1000 * 60;// 一分钟的毫秒数
        long ns = 1000;// 一秒钟的毫秒数long diff;try {
        // 获得两个时间的毫秒时间差异
        long diff = sd.parse(endTime).getTime() - sd.parse(startTime).getTime();
        long min = diff / 1000 / 60 / 60 / 24;// 计算差多少分钟
        return min;
    }

    public static long dateDiff(Date startTime, Date endTime)
    {
        // 按照传入的格式生成一个simpledateformate对象
        long nd = 1000 * 24 * 60 * 60;// 一天的毫秒数
        long nh = 1000 * 60 * 60;// 一小时的毫秒数
        long nm = 1000 * 60;// 一分钟的毫秒数
        long ns = 1000;// 一秒钟的毫秒数long diff;try {
        // 获得两个时间的毫秒时间差异
        long diff = endTime.getTime() - startTime.getTime();
        long min = diff / 1000 / 60 / 60 / 24;// 计算差多少分钟
        return min;
    }

    public static long minDiff(Date startTime, Date endTime)
    {
        // 按照传入的格式生成一个simpledateformate对象
        long nd = 1000 * 24 * 60 * 60;// 一天的毫秒数
        long nh = 1000 * 60 * 60;// 一小时的毫秒数
        long nm = 1000 * 60;// 一分钟的毫秒数
        long ns = 1000;// 一秒钟的毫秒数long diff;try {
        // 获得两个时间的毫秒时间差异
        long diff = endTime.getTime() - startTime.getTime();
        long min = diff / 1000 / 60;// 计算差多少分钟
        return min;
    }

    public static long minSec(Date startTime, Date endTime)
    {
        // 按照传入的格式生成一个simpledateformate对象
        long nd = 1000 * 24 * 60 * 60;// 一天的毫秒数
        long nh = 1000 * 60 * 60;// 一小时的毫秒数
        long nm = 1000 * 60;// 一分钟的毫秒数
        long ns = 1000;// 一秒钟的毫秒数long diff;try {
        // 获得两个时间的毫秒时间差异
        long diff = endTime.getTime() - startTime.getTime();
        long min = diff / 1000;// 计算差多少分钟
        return min;
    }

    public static int compare_date(String DATE1, String DATE2, String format)
    {
        DateFormat df = new SimpleDateFormat(format);
        try
        {
            Date dt1 = df.parse(DATE1);
            Date dt2 = df.parse(DATE2);
            if (dt1.getTime() > dt2.getTime())
            {
                return 1;
            } else if (dt1.getTime() < dt2.getTime())
            {
                return -1;
            } else
            {
                return 0;
            }
        } catch (Exception exception)
        {
            exception.printStackTrace();
        }
        return 0;
    }

    public static int compare_date(Date DATE1, Date DATE2)
    {
        // DateFormat df = new SimpleDateFormat(format);
        try
        {
            // Date dt1 = df.parse(DATE1);
            // Date dt2 = df.parse(DATE2);
            if (DATE1.getTime() > DATE2.getTime())
            {
                return 1;
            } else if (DATE1.getTime() < DATE2.getTime())
            {
                return -1;
            } else
            {
                return 0;
            }
        } catch (Exception exception)
        {
            exception.printStackTrace();
        }
        return 0;
    }

    /**
     * 返回指定日期类型日期增量日期
     * 
     * @param dateType 日期类型
     * @param count 增加数量，可以为负数
     * @param baseDate 参照日期
     * @return
     */
    public static Date getMagicDate(int dateType, int count, Date baseDate)
    {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(baseDate);
        calendar.add(dateType, count);
        return calendar.getTime();
    }

    /**
     * 日期转换为指定格式的字符
     * 
     * @param date 日期
     * @param dateFormat 日期格式
     * @return
     */
    public static String dateToString(Date date, String dateFormat)
    {
        SimpleDateFormat df = null;
        String returnValue = "";
        if (date != null)
        {
            df = new SimpleDateFormat(dateFormat);
            returnValue = df.format(date);
        }
        return returnValue;
    }

    /**
     * 日期字符串转换为日期格式
     * 
     * @param dateStr 日期字符串
     * @param dateFormat 日期格式
     * @return
     * @throws ParseException
     */
    public static Date stringToDate(String dateStr, String dateFormat) throws ParseException
    {
        SimpleDateFormat sf = new SimpleDateFormat(dateFormat);
        try
        {
            return sf.parse(dateStr);
        } catch (ParseException e)
        {
            e.printStackTrace();
            throw new ParseException("日期解析错误！", 0);
        }
    }

    /**
     * 获得当前日期与本周日相差的天数
     * 
     * @return 星期日是第一天，星期一是第二天......
     */
    public static int getMondayPlus()
    {
        Calendar cd = Calendar.getInstance();
        // 获得今天是一周的第几天，星期日是第一天，星期一是第二天......
        int dayOfWeek = cd.get(Calendar.DAY_OF_WEEK) - 1; // 因为按中国礼拜一作为第一天所以这里减1
        if (dayOfWeek == 1)
        {
            return 0;
        } else
        {
            return 1 - dayOfWeek;
        }
    }

    /**
     * 根据报表时间标志，取得时间段
     * 
     * @param timeType 时间标志
     * @return String[]
     * @throws ParseException
     * @throws ParseException
     */
    @SuppressWarnings("deprecation")
    public static String[] time(String timeType)
    {
        try
        {
            String[] time = new String[3];
            Timestamp beginTime = null;
            Timestamp endTime = null;
            Date today = new Date();
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setTime(today);
            if ("0".equals(timeType))
            {
                // 当天
                beginTime = new Timestamp(calendar.getTime().getTime());
                // calendar.add(Calendar.DATE, 1);
                endTime = new Timestamp(calendar.getTime().getTime());
                time[0] = beginTime.toString().substring(0, 10);
                time[1] = endTime.toString().substring(0, 10);
            } else if ("1".equals(timeType))
            {
                // 前一天
                calendar.add(Calendar.DATE, -1);
                beginTime = new Timestamp(calendar.getTime().getTime());
                endTime = new Timestamp(calendar.getTime().getTime());
                time[1] = beginTime.toString().substring(0, 10) + " 23:59:59";
                time[0] = endTime.toString().substring(0, 10) + " 00:00:01";
                time[2] = endTime.toString().substring(0, 10);
            } else if ("2".equals(timeType))
            {
                // 前三天
                calendar.add(Calendar.DATE, -1);
                beginTime = new Timestamp(calendar.getTime().getTime());
                calendar.add(Calendar.DATE, -2);
                endTime = new Timestamp(calendar.getTime().getTime());
                time[1] = beginTime.toString().substring(0, 10) + " 23:59:59";
                time[0] = endTime.toString().substring(0, 10);
            } else if ("3".equals(timeType))
            {
                // 上一周
                // 获取上周一的时间
                int weeks = 0;
                weeks--;
                int mondayPlus = getMondayPlus();
                calendar.add(Calendar.DATE, mondayPlus + 7 * weeks);
                beginTime = new Timestamp(calendar.getTime().getTime());
                // 获取上周日的时间
                calendar.add(Calendar.DATE, 6);
                endTime = new Timestamp(calendar.getTime().getTime());
                time[0] = beginTime.toString().substring(0, 10);
                time[1] = endTime.toString().substring(0, 10) + " 23:59:59";
            } else if ("4".equals(timeType))
            {
                // 上一月
                beginTime = new Timestamp(calendar.getTime().getTime());
                calendar.add(Calendar.MONTH, -1);
                beginTime = new Timestamp(calendar.getTime().getTime());
                time[0] = beginTime.toString().substring(0, 8) + "01";
                String endStr = beginTime.toString().substring(0, 5) + String.valueOf(beginTime.getMonth() + 2) + "-01";
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                try
                {
                    calendar.setTime(sdf.parse(endStr));
                } catch (ParseException e)
                {
                    e.printStackTrace();
                }
                calendar.add(Calendar.DATE, -1);
                endTime = new Timestamp(calendar.getTime().getTime());
                time[1] = endTime.toString().substring(0, 10) + " 23:59:59";
            } else if ("5".equals(timeType))
            {
                // 上一季
                beginTime = new Timestamp(calendar.getTime().getTime());
                calendar.add(Calendar.MONTH, -3);
                endTime = new Timestamp(calendar.getTime().getTime());
                String beginTimeStr = beginTime.toString().substring(0, 8) + "01";
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                calendar.setTime(sdf.parse(beginTimeStr));
                calendar.add(Calendar.DATE, -1);
                beginTime = new Timestamp(calendar.getTime().getTime());
                time[1] = beginTime.toString().substring(0, 10) + " 23:59:59";
                time[0] = endTime.toString().substring(0, 8) + "01";
            } else
            {
                // 去年
                beginTime = new Timestamp(calendar.getTime().getTime());
                calendar.add(Calendar.YEAR, -1);
                endTime = new Timestamp(calendar.getTime().getTime());
                time[1] = beginTime.toString().substring(0, 5) + "01-01";
                time[0] = endTime.toString().substring(0, 5) + "01-01";
            }
            return time;
        } catch (ParseException e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) throws ParseException
    {
    }

    public static Date getMonthFirstDay(Date date)
    {
        Calendar ca = Calendar.getInstance();
        ca.setTime(date); // someDate 为你要获取的那个月的时间
        ca.set(Calendar.DAY_OF_MONTH, 1);
        // 第一天
        Date firstDate = ca.getTime();
        return firstDate;
    }

    /**
     * 得到本月的最后一天
     */
    public static Date getMonthLastDay(Date date)
    {
        Calendar ca = Calendar.getInstance();
        ca.setTime(date); // someDate 为你要获取的那个月的时间
        ca.set(Calendar.DAY_OF_MONTH, 1);
        ca.add(Calendar.MONTH, 1);
        ca.add(Calendar.DAY_OF_MONTH, -1);
        Date lastDate = ca.getTime();
        return lastDate;
    }

    // 获取指定日期的一天的开始时间和结束时间
    public static String[] timeStartEnd(Date date)
    {
        try
        {
            String[] time = new String[3];
            Timestamp beginTime = null;
            Timestamp endTime = null;
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            // calendar.add(Calendar.DATE, -1);
            beginTime = new Timestamp(calendar.getTime().getTime());
            endTime = new Timestamp(calendar.getTime().getTime());
            time[1] = beginTime.toString().substring(0, 10) + " 23:59:59";
            time[0] = endTime.toString().substring(0, 10) + " 00:00:01";
            time[2] = endTime.toString().substring(0, 10);
            return time;
        } catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获取当前日期格式 yyyy-MM-dd hh:mm:ss
     * 
     * @return the current date/time
     */
    public static String getDateTimeNow()
    {
        return dateToString(new Date(), TIMESTAMP);
    }

    /**
     * 获取当前日期中的某一日
     * 
     * @return day
     */
    public static int getDateTimeDay()
    {
        String day = dateToString(new Date(), DATE);
        return Integer.parseInt(day.replace("-", "").trim());
    }

    /**
     * 获取当前日期+几分钟 格式 yyyy-MM-dd hh:mm:ss
     * 
     * @return the current date/time
     */
    public static String getDateTimeAfter(int miniute)
    {
        return dateToString(new Date(new Date().getTime() + 60000 * miniute), TIMESTAMP);
    }

    /**
     * 获取当前日期+几分钟 格式 yyyy-MM-dd hh:mm:ss
     * 
     * @return the current date/time
     */
    public static String getDateTimebefore(int miniute)
    {
        return dateToString(new Date(new Date().getTime() - 60000 * miniute), TIMESTAMP);
    }

    /**
     * 获取某个日期+几分钟 格式 yyyy-MM-dd hh:mm:ss
     * 
     * @return the current date/time
     */
    public static String getDateTimeAfter(String date, int miniute)
    {
        Date dateFor = null;
        try
        {
            dateFor = df.parse(date);
        } catch (ParseException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return dateToString(new Date(dateFor.getTime() + 60000 * miniute), TIMESTAMP);
    }

    public static String getDateAfter(String validatetime, int renewalsdata)
    {
        // int renewalsdata = 6;
        // String validatetime = "2011-11-15 17:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = null;
        try
        {
            now = sdf.parse(validatetime);
        } catch (ParseException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.MINUTE, renewalsdata);
        return sdf.format(calendar.getTime());
    }

    /**
     * 返回几分钟后的某个时间
     * 
     * @param d
     * @param minutes
     * @return
     */
    public static Date getDateAfterMinute(Date d, int minutes)
    {
        Calendar now = Calendar.getInstance();
        now.setTime(d);
        now.set(Calendar.MINUTE, now.get(Calendar.MINUTE) + minutes);
        return now.getTime();
    }

    public static Date timestampToDate(Timestamp tt)
    {
        return new Date(tt.getTime());
    }

    /**
     * timediff:获取二个时间之间差多少分钟. <br/>
     * 
     * @author lixiaohuan
     * @param pbegintime
     * @param pendtime
     * @return
     */
    public static int timediff(String pbegintime, String pendtime)
    {
        int min = 0;
        try
        {
            long beginl = stringToDate(pbegintime, TIMESTAMP).getTime();
            long endl = stringToDate(pendtime, TIMESTAMP).getTime();
            min = (int) ((endl - beginl) % 86400000 % 3600000) / 60000;
        } catch (ParseException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return min;
    }

    /**
     * timediff:获取二个时间之间差多少分钟. <br/>
     * 
     * @author lixiaohuan
     * @param pbegintime
     * @param pendtime
     * @return
     */
    public static int timediffSecond(String pbegintime, String pendtime)
    {
        int min = 0;
        try
        {
            long beginl = stringToDate(pbegintime, TIMESTAMP).getTime();
            long endl = stringToDate(pendtime, TIMESTAMP).getTime();
            min = (int) ((endl - beginl) % 86400000 % 3600000) / 1000;
        } catch (ParseException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return min;
    }

    /**
     * timediff:获取二个时间之间差多少分钟. <br/>
     * 
     * @author lixiaohuan
     * @param pbegintime
     * @param pendtime
     * @return
     */
    public static int timediffSecond(Date pbegintime, Date pendtime)
    {
        int min = 0;
        try
        {
            long beginl = pbegintime.getTime();
            long endl = pendtime.getTime();
            min = (int) ((endl - beginl) % 86400000 % 3600000) / 60000;
        } catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return min;
    }

    /**
     * 根据给定的格式获取当前时间
     * 
     * @return the current date/time
     */
    public static String getNow(String dateFormat)
    {
        return dateToString(new Date(), dateFormat);
    }

    /**
     * 获取日期间间隔秒数 getIntervalDays
     * 
     * @param startday
     * @param endday
     * @return
     */
    public static int getIntervalSeconds(Date startday, Date endday)
    {
        if (startday.after(endday))
        {
            Date cal = startday;
            startday = endday;
            endday = cal;
        }
        long sl = startday.getTime();
        long el = endday.getTime();
        long ei = el - sl;
        return (int) (ei / 1000);
    }

    /**
     * Date2 string.
     * 
     * @param pattern the pattern
     * @param date the date
     * @return the string
     */
    public static String dateToString(String pattern, Date date)
    {
        String date_string;
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        if (date != null)
        {
            date_string = df.format(date);
        } else
        {
            return null;
        }
        return date_string;
    }

    /**
     * @brief 获取一个时间，这个时间是某天的第0秒
     * @return 时间
     */
    public static Date getAtFirstSecond(Date date)
    {
        if (date == null)
        {
            return null;
        }
        Calendar day = Calendar.getInstance();
        day.setTime(date);
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(day.get(Calendar.YEAR), day.get(Calendar.MONTH), day.get(Calendar.DAY_OF_MONTH));
        return cal.getTime();
    }

    /**
     * @brief 获取一个时间，这个时间是某天的最后一秒
     * @return 时间
     */
    public static Date getAtLastSecond(Date date)
    {
        if (date == null)
        {
            return null;
        }
        Calendar day = Calendar.getInstance();
        day.setTime(date);
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(day.get(Calendar.YEAR), day.get(Calendar.MONTH), day.get(Calendar.DAY_OF_MONTH), LAST_HOUR_OF_DAY,
                LAST_MINUTE_OF_HOUR, LAST_SECOND_OF_MINUTE);
        return cal.getTime();
    }

    /**
     * @brief 两个时间之间的天数
     * @param startDate
     * @param endDate
     * @return
     */
    public static int getDays(String startDate, String endDate, String fmt)
    {
        if (startDate == null || startDate.equals(" "))
            return 0;
        if (endDate == null || endDate.equals(" "))
            return 0;
        // 转换为标准时间
        SimpleDateFormat myFormatter = new SimpleDateFormat(fmt);
        Date date = null;
        Date mydate = null;
        try
        {
            date = myFormatter.parse(startDate);
            mydate = myFormatter.parse(endDate);
        } catch (Exception e)
        {
        }
        long day = (mydate.getTime() - date.getTime()) / (24 * 60 * 60 * 1000);
        return (int) day;
    }

    /**
     * 根据Date格式时间获取时间戳
     * 
     * @param date Dtae格式的时间 DTS DigitalTimeStamp
     * @return 时间戳
     */
    public static long getDTSByDate(Date date)
    {
        // SimpleDateFormat format = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
        // String time="1970-01-06 11:45:55";
        // Date date = format.parse(time);
        return date.getTime();
    }

    /**
     * 根据Date格式时间获取时间戳
     * 
     * @param date String格式的时间 例如：1970-01-06 11:45:55 DTS DigitalTimeStamp
     * @return 时间戳
     */
    public static long getDTSByString(String time)
    {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // String time="1970-01-06 11:45:55";
        Date date = null;
        try
        {
            date = format.parse(time);
        } catch (ParseException e)
        {
            e.printStackTrace();
        }
        return date.getTime();
    }

    /**
     * String类型的时间转换成Timestamp类型
     * 
     * @param String strdate
     * @return Timestamp datetime
     * @throws ParseException
     */
    public final static Timestamp string2Time(String dateString)
    {
        DateFormat dateFormat;
        dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINESE);// 设定格式
        // dateFormat.setLenient(false);// 严格控制输入 比如2010－02－31，根本没有这一天 ，也会认为时间格式不对。
        Date timeDate = null;
        try
        {
            timeDate = dateFormat.parse(dateString);
        } catch (ParseException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }// util类型
        Timestamp dateTime = new Timestamp(timeDate.getTime());// Timestamp类型,timeDate.getTime()返回一个long型
        return dateTime;
    }
}
