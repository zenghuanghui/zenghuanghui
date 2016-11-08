package com.jinghui.common.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.jinghui.common.utils.Page;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.LongSerializationPolicy;

public class BaseController {
    public void setEncoding(HttpServletResponse response, String resultStr) {
        response.setContentType("text/json");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = null;
        try {
            out = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.print(resultStr);
        out.close();
    }

    public void setEncodingHtml(HttpServletResponse response, String resultStr) {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = null;
        try {
            out = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.print(resultStr);
        out.close();
    }

    protected void setPageInfo(Page page, HttpServletRequest request) {
        // 页码(根据传入的参数计算页数)
        page.setPageNo((Integer.parseInt(request.getParameter("iDisplayStart")) / Integer.parseInt(request
                .getParameter("iDisplayLength"))) + 1);
        // 每页显示条数
        page.setPageSize(Integer.parseInt(request.getParameter("iDisplayLength")));
        // page.setOrderBy(getRequest().getParameter("sSortDir_0"));
    }

    protected String readerPage2Json(Page page, HttpServletResponse response) {
        // 将要转换的对象
        Map<String, Object> pageToJson = new HashMap<String, Object>();
        // 总记录条数
        if (page.getTotalCount() == -1) {
            pageToJson.put("iTotalRecords", 0);
        } else {
            pageToJson.put("iTotalRecords", page.getTotalCount());
        }
        // 数据行
        pageToJson.put("aaData", page.getResult());
        pageToJson.put("iTotalDisplayRecords", page.getTotalCount());
        // 调用通用转JSON方法
        renderJson(pageToJson, response);
        return null;
    }

    protected String readerPage2Json(Page page, HttpServletResponse response, String format) {
        // 将要转换的对象
        Map<String, Object> pageToJson = new HashMap<String, Object>();
        // 总记录条数
        if (page.getTotalCount() == -1) {
            pageToJson.put("iTotalRecords", 0);
        } else {
            pageToJson.put("iTotalRecords", page.getTotalCount());
        }
        // 数据行
        pageToJson.put("aaData", page.getResult());
        pageToJson.put("iTotalDisplayRecords", page.getTotalCount());
        // 调用通用转JSON方法
        renderJson(pageToJson, response, format);
        return null;
    }

    protected String renderJson(Object obj, HttpServletResponse response, String format) {
        String jsonStr = "{\"resultcode\":\"0\",\"resultmessage\":\"发送失败\"}";
        response.setContentType("application/json;charset=UTF-8");
        Gson gson = this.createGson(format);
        if (obj != null) {
            try {
                jsonStr = gson.toJson(obj);
                response.getWriter().write(jsonStr);
            } catch (Exception e) {
            }
        }
        return jsonStr;
    }

    protected String renderJson(Object obj, HttpServletResponse response) {
        response.setContentType("application/json;charset=UTF-8");
        Gson gson = this.createGson();
        if (obj != null) {
            try {
                String jsonStr = gson.toJson(obj);
                response.getWriter().write(jsonStr);
            } catch (Exception e) {
            }
        }
        return null;
    }

    protected String renderJson(Object obj, String format) {
        Gson gson = this.createGson(format);
        String jsonStr = "";
        try {
            jsonStr = gson.toJson(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonStr;
    }

    protected String renderJson(Object obj) {
        Gson gson = this.createGson();
        String jsonStr = "";
        try {
            jsonStr = gson.toJson(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonStr;
    }

    protected Gson createGson(String format) {
        return new GsonBuilder().setDateFormat(format).setLongSerializationPolicy(LongSerializationPolicy.STRING)
                .create();
    }

    protected Gson createGson() {
        return new GsonBuilder().setDateFormat("yyyy-MM-dd").setLongSerializationPolicy(LongSerializationPolicy.STRING)
                .create();
    }

    protected String camel2WithLine(String sort, String order) {
        Pattern p = Pattern.compile("[A-Z]");
        if (sort == null || "".equals(sort)) {
            return null;
        }
        StringBuilder builder = new StringBuilder(sort);
        Matcher mc = p.matcher(sort);
        int i = 0;
        while (mc.find()) {
            builder.replace(mc.start() + i, mc.end() + i, "_" + mc.group().toLowerCase());
            i++;
        }
        if ('_' == builder.charAt(0)) {
            builder.deleteCharAt(0);
        }
        return builder.toString() + " " + order;
    }

    protected String fullUrl(HttpServletRequest request, String path) {
        String url = "http://localhost:8080/library/" + path;
        return url;
    }
}
