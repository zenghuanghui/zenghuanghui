/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.library.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.base.web.BaseController;
import com.library.model.LibraryBook;

import com.library.service.LibraryBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.common.JsonUtil;
import com.common.Page;
import com.common.StringUtil;
import org.apache.log4j.Logger;

@Controller
@RequestMapping("/libraryBook")
public class LibraryBookController  extends BaseController
{
    @Autowired
    private LibraryBookService libraryBookService;
    private LibraryBook                  libraryBook             ;
    Page<LibraryBookController>          page             = new Page<LibraryBookController>(10, true);

    private static final Logger logger =
            Logger.getLogger(LibraryBookController.class);

    public LibraryBook getLibraryBook()
    {
        return libraryBook;
    }

    public void setLibraryBook(LibraryBook libraryBook)
    {
        this.libraryBook =libraryBook;
    }


    /** 进入新增 */
    @RequestMapping(value = "/new_add")
    public String new_add()
    {
        return "LibraryBook/addLibraryBook";
    }

    /**
     * select:(查询LibraryBook). <br/>
     * 
     * @author Administrator
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/select", method = RequestMethod.GET)
    public String select(HttpServletRequest request, HttpServletResponse response)
    {
        try
        {
            request.setCharacterEncoding("utf-8");
            response.setContentType("text/html; charset=utf-8");
        		String id = request.getParameter("id");
        		LibraryBook libraryBook = libraryBookService.getLibraryBook(id);
        		if (libraryBook== null)
        		{
            	return "error";
        		}
        		String libraryBookJson = JsonUtil.ObjectToJsonStr(libraryBook);
        		request.setAttribute("libraryBook", libraryBook);
        } catch (Exception e)
        {
            e.printStackTrace();
            return "error";
        }
        return "LibraryBook/detailLibraryBook";
    }

    /**
     * show:(列表显示LibraryBook ). <br/>
     * 
     * @author Administrator
     * @param request
     * @return
     */
    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String show(HttpServletRequest request)
    {
        List<LibraryBook> libraryBooks = libraryBookService.showLibraryBook();
        if (libraryBooks == null)
        {
            return "error";
        }
        String libraryBooksJson = JsonUtil.ObjectToJsonStr(libraryBooks);
        request.setAttribute("libraryBooks", libraryBooks);
        return "LibraryBook/tabLibraryBook";
    }

    @RequestMapping(value = "/pagingShow", method = RequestMethod.GET)
    public String pagingShow(HttpServletRequest request)
    {
        return "LibraryBook/tabLibraryBook";
    }

		@RequestMapping(value = "/pagingShowList")
		    public String pagingShowList(HttpServletRequest request, HttpServletResponse response)
		    {

                logger.debug("Debug info.");
                logger.info("Info info");
                logger.warn("Warn info");
                logger.error("Error info");
                logger.fatal("Fatal info");

                logger.debug("调试信息.");
                logger.info("一般信息.");
                logger.warn("警告信息.");
                logger.error("错误信息.");
                logger.fatal("致命信息.");
		        try
		        {
		            //setPageInfo(page, request);
		            HashMap<String, Object> map = new HashMap<String, Object>();
			        if (!StringUtil.isEmpty(request.getParameter("name"))){
			        	map.put("name", request.getParameter("name"));
			        	request.setAttribute("name", request.getParameter("name"));
			      	 }
			        if (!StringUtil.isEmpty(request.getParameter("price"))){
			        	map.put("price", request.getParameter("price"));
			        	request.setAttribute("price", request.getParameter("price"));
			      	 }
			        if (!StringUtil.isEmpty(request.getParameter("author"))){
			        	map.put("author", request.getParameter("author"));
			        	request.setAttribute("author", request.getParameter("author"));
			      	 }
			        if (!StringUtil.isEmpty(request.getParameter("state"))){
			        	map.put("state", request.getParameter("state"));
			        	request.setAttribute("state", request.getParameter("state"));
			      	 }
			        if (!StringUtil.isEmpty(request.getParameter("spare1"))){
			        	map.put("spare1", request.getParameter("spare1"));
			        	request.setAttribute("spare1", request.getParameter("spare1"));
			      	 }
			        if (!StringUtil.isEmpty(request.getParameter("spare2"))){
			        	map.put("spare2", request.getParameter("spare2"));
			        	request.setAttribute("spare2", request.getParameter("spare2"));
			      	 }
			        if (!StringUtil.isEmpty(request.getParameter("spare3"))){
			        	map.put("spare3", request.getParameter("spare3"));
			        	request.setAttribute("spare3", request.getParameter("spare3"));
			      	 }
		          
		            
		            if (StringUtil.isEmpty(request.getParameter("sort")))
		            {
									map.put("sortColumns", "id desc");
		            }
		            else
		            {
		                map.put("sortColumns", camel2WithLine(request.getParameter("sort"), request.getParameter("order")));
		            }
//		            page = libraryBookService.getLists(page, map);
		            List<LibraryBook> list = libraryBookService.pagingSelect(map);
		            request.setAttribute("list",list);
                    request.setAttribute("data",new Date());
		            //readerPage2Json(page, response,"yyyy-MM-dd HH:mm:ss");
		            return "LibraryBook/tabLibraryBook";
		        } catch (Exception e)
		        {
		            e.printStackTrace();
		            return null;
		        }
		    }


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(HttpServletRequest request, HttpServletResponse response)
    {
        try
        {
            request.setCharacterEncoding("utf-8");
            response.setContentType("text/html; charset=utf-8");
        
         libraryBook= new LibraryBook();
         libraryBook.setId(StringUtil.getUUID2Long() + "");
        if (!StringUtil.isEmpty(request.getParameter("name"))){
         libraryBook.setName(request.getParameter("name"));
       }
       			if (!StringUtil.isEmpty(request.getParameter("price")))
		            {
		                libraryBook.setPrice(Double.parseDouble(request.getParameter("price")));
		            }
        if (!StringUtil.isEmpty(request.getParameter("author"))){
         libraryBook.setAuthor(request.getParameter("author"));
       }
        if (!StringUtil.isEmpty(request.getParameter("state"))){
         libraryBook.setState(request.getParameter("state"));
       }
        if (!StringUtil.isEmpty(request.getParameter("spare1"))){
         libraryBook.setSpare1(request.getParameter("spare1"));
       }
        if (!StringUtil.isEmpty(request.getParameter("spare2"))){
         libraryBook.setSpare2(request.getParameter("spare2"));
       }
        if (!StringUtil.isEmpty(request.getParameter("spare3"))){
         libraryBook.setSpare3(request.getParameter("spare3"));
       }
        int status=libraryBookService.addLibraryBook(libraryBook);
        if (status >0)
        {
            setEncodingHtml(response, "true");
        } else
        {
            setEncodingHtml(response, "false");
        }
        } catch (Exception e)
        {
        		e.printStackTrace();
            return "error";
        }
        return null;
    }

}
