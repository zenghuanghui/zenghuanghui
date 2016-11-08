package com.common;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class JsonUtil
{
    /**
     * 日志
     */

    /**
     * 根据JSON字符串返回map对象、要求传入的text形式：{"a":"1","b":"2","c":"3","4":"d"}
     * 
     * @param text
     * @return
     */
    @SuppressWarnings("unchecked")
    public static Map<String, Object> getMapFromJsonStr(String text)
    {
        Map<String, Object> map = null;
        if (text != null && !text.equals("") && text.startsWith("{"))
        {
            map = (Map<String, Object>) JSONObject.parse(text);
        }
        return map;
    }

    /**
     * 根据JSON字符串返回List<Map>对象、要求传入的text形式：[{ 'age':'1','id':'1','name':'1'},{'age':'2','id':'2','name':'2'}]
     * 
     * @param text
     * @return
     */
    @SuppressWarnings("unchecked")
    public static List<Map> getListMapFromJsonStr(String text)
    {
        List<Map> returnList = null;
        if (text != null && !text.equals("") && text.startsWith("["))
        {
            returnList = JSONArray.parseArray(text, Map.class);
        }
        return returnList;
    }

    /**
     * json字符串转换为java对象
     * 
     * @author wangyao
     * @param text json字符串
     * @param clazz 需要转换的类对象
     * @return
     */
    @SuppressWarnings("unchecked")
    public static Object jsonToObject(String text, Class clazz)
    {
        Object retObject = null;
        if (text.startsWith("["))// 数组形式的json字符串
        {
            List returnList = JSONArray.parseArray(text, clazz);
            retObject = returnList;
        } else if (text.startsWith("{"))// 对象形式的json字符串
        {
            retObject = JSONObject.parseObject(text, clazz);
        }
        return retObject;
    }

    /**
     * java对象转换为json格式的对象字符串
     * 
     * @param object java对象:javaBean形式 或者map形式对象
     * @return
     */
    public static String ObjectToJsonStr(Object object)
    {
        return ObjectToJsonStr(object, false);
    }

    public static String ObjectToJsonStr(Object object, boolean dateFormat)
    {
        if (!dateFormat)
        {
            return JSON.toJSONString(object);
        }
        return JSON.toJSONStringWithDateFormat(object, JSON.DEFFAULT_DATE_FORMAT);
    }

    public static String ObjectToJsonStr(Object object, String datepattern)
    {
        if (datepattern == null || "".equals(datepattern))
        {
            datepattern = JSON.DEFFAULT_DATE_FORMAT;
        }
        return JSON.toJSONStringWithDateFormat(object, datepattern);
    }

    /**
     * java对象转换为json格式的对象字符串
     * 
     * @param object java对象:javaBean形式 或者map形式对象
     * @return
     */
    public static String ObjectToJsonStr(Object object, boolean dateFormat, int iTotalDisplayRecords, int iTotalRecords)
    {
        String jsonStr = paginationJson(iTotalDisplayRecords, iTotalRecords, ObjectToJsonStr(object, dateFormat));
        return jsonStr;
    }

    /**
     * java对象转换为json格式的对象字符串
     * 
     * @param object java对象:javaBean形式 或者map形式对象
     * @return
     */
    public static String ObjectToJsonStr(Object object, int iTotalDisplayRecords, int iTotalRecords)
    {
        return ObjectToJsonStr(object, false, iTotalDisplayRecords, iTotalRecords);
    }

    private static String paginationJson(int iTotalDisplayRecords, int iTotalRecords, String json)
    {
        return "{\"iTotalDisplayRecords\":" + iTotalDisplayRecords + ",\"iTotalRecords\":" + iTotalRecords
                + ",\"aaData\":" + json + "}";
    }

    /**
     * java数组对象转换为json格式的数组字符串
     * 
     * @param object java对象:list对象
     * @return
     */
    public static String listObjectToJsonStr(Object object)
    {
        String jsonArrayStr = null;
        if (object != null)
        {
            JSONArray json = (JSONArray) JSON.toJSON(object);
            jsonArrayStr = json.toString();
        }
        return jsonArrayStr;
    }

    /**
     * java数组对象转换为json格式的数组字符串(iTotalDisplayRecords和iTotalRecords含义一样)
     * 
     * @param object java对象:list对象
     * @return
     */
    public static String listObjectToJsonStr(Object object, int iTotalRecords)
    {
        String jsonArrayStr = paginationJson(iTotalRecords, iTotalRecords, listObjectToJsonStr(object));
        return jsonArrayStr;
    }

    /**
     * java数组对象转换为json格式的数组字符串
     * 
     * @param object java对象:list对象
     * @return
     */
    public static String listObjectToJsonStr(Object object, int iTotalDisplayRecords, int iTotalRecords)
    {
        String jsonArrayStr = paginationJson(iTotalDisplayRecords, iTotalRecords, listObjectToJsonStr(object));
        return jsonArrayStr;
    }

    public static void outprintJson(HttpServletResponse response, String str) throws IOException
    {
        outprintChildJson(response, "[" + str + "]");
    }

    public static void outprintChildJson(HttpServletResponse response, String str) throws IOException
    {
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        PrintWriter out;
        out = response.getWriter();
        out.write(str);
        out.flush();
        out.close();
    }
}
