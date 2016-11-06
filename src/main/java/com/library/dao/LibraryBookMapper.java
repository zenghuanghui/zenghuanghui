/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2016
 */

/**
 * @brief    模块功能简单描述
 * @details  模块功能详细描述
 */

package com.library.dao;

import java.util.HashMap;
import java.util.List;

import com.library.model.LibraryBook;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryBookMapper {
    /**
     * @brief   功能: 查询
     * @return  List<LibraryBook>：LibraryBook对象集合
     */
	List<LibraryBook> getLibraryBookList();
    /**
     * @brief   功能: 查询总共多少条记录
     * @return  int：总共多少条记录
     */
	int getCount(HashMap<String, Object> map);
    /**
     * @brief   功能: 分页查询
     * @param   map: 分页查询的参数集合
     * @return  List<LibraryBook>:LibraryBook对象集合
     */
	List<LibraryBook> pagingSelect(HashMap<String, Object> map);
	/**
     * @brief   功能: 条件查询
     * @param   map: 条件查询的参数集合
     * @return  List<LibraryBook>:LibraryBook对象集合
     */
	List<LibraryBook> getLibraryBookByCondition(HashMap<String, Object> map);
    /**
     * @brief   功能: 根据LibraryBook的id查询
     * @param   id: 待查询对象id）
     * @return  LibraryBook: LibraryBook对象
     */
	LibraryBook getLibraryBookById(String id);
    /**
     * @brief   功能: 新增
     * @param   libraryBook: LibraryBook对象 
     * @return int: 影响的行数
     */
	int insertLibraryBook(LibraryBook libraryBook);
    /**
     * @brief   功能: 修改
     * @param   libraryBook: LibraryBook对象 
     * @return int: 影响的行数
     */
	int updateLibraryBook(LibraryBook libraryBook);
    /**
     * @brief 功能: 根据LibraryBook的id进行删除
     * @param id: 待删除对象id
     * @return int: 影响的行数
     */
	int deleteLibraryBookById(String id);
    /**
     * @brief 功能: 批量删除
     * @param list: 待删除对象的集合
     * @return int: 影响的行数
     */
	int batchDelete(List<String> list);
}
