/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

package com.library.service;

import com.common.Page;
import com.library.dao.LibraryBookMapper;
import com.library.model.LibraryBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class LibraryBookService{
    @Autowired
    private LibraryBookMapper libraryBookMapper
            ;
    /**
     * getLibraryBook:(根据id查询 ). <br/>
     * 
     * @param id：对象id
     * @return LibraryBook:对象
     */

     public LibraryBook getLibraryBook(String id) {
				return libraryBookMapper.getLibraryBookById(id);
     }

    /**
     * showLibraryBook:(查询所有). <br/>
     * 
     * @return List<LibraryBook>：对象集合
     */
     public List<LibraryBook> showLibraryBook() {
				return libraryBookMapper.getLibraryBookList();
	   }
    /**
     * selectCount:(查询总共多少条记录 ). <br/>
     * 
     * @return int:总共多少条记录
     */
     public int selectCount(HashMap<String, Object> map) {
	       return libraryBookMapper.getCount(map);
      }

    /**
     * pagingSelect:(分页查询). <br/>
     * 
     * @param map:分页查询需要的参数集合
     * @return List<{className}>：对相集合
     */
     public List<LibraryBook> pagingSelect(HashMap<String, Object> map) {
	       return libraryBookMapper.pagingSelect(map);
      }
   
      /**
     * @brief   功能: 条件查询
     * @param   map: 条件查询的参数集合
     * @return  List<LibraryBook>:LibraryBook对象集合
     */
      public List<LibraryBook> getLibraryBookByCondition(HashMap<String, Object> map) {
	       return libraryBookMapper.getLibraryBookByCondition(map);
      }
	
      public Page getLists(Page page, HashMap<String, Object> map) throws Exception
    {
        int rowSum = selectCount(map);
        page.setTotalCount(rowSum);
        map.put("pageBegin", (page.getPageNo() - 1) * page.getPageSize());
        map.put("pageSize", page.getPageSize());
        List<LibraryBook> list = pagingSelect(map);
        page.setResult(list);
        return page;
    }
    /**
     * addLibraryBook:(新增). <br/>
     * 
     * @param libraryBook：对象
     * @return int:insert影响行数
     */
     public int addLibraryBook(LibraryBook libraryBook) {
	        return libraryBookMapper.insertLibraryBook(libraryBook);
      }
    /**
     * deleteLibraryBook:(删除). <br/>
     * 
     * @param id：对象id
     * @return int:delete影响的行数
     */

     public int deleteLibraryBook(String id) {
	        return libraryBookMapper.deleteLibraryBookById(id);
       }
    /**
     * batchDeleteLibraryBook:(批量删除). <br/>
     * 
     * @param list:待删除的条件集合
     * @return int：batchDelete影响的行数
     */

     public int batchDeleteLibraryBook(List<String> list) {
	       return libraryBookMapper.batchDelete(list);
       }
    /**
     * updateLibraryBook:(修改). <br/>
     * 
     * @param libraryBook：对象
     * @return int:update影响的行数
     */

     public int updateLibraryBook(LibraryBook libraryBook) {
	       return libraryBookMapper.updateLibraryBook(libraryBook);
       }
}
