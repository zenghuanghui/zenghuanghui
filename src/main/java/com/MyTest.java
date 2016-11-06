package com;

import org.apache.log4j.Logger;

/**
 * Created by zenghuanghui on 2016/11/1.
 */
public class MyTest {
    private static  final Logger LOGGER = Logger.getLogger(MyTest.class);
    public static void  main(String[] agrs){

        // 记录debug级别的信息
        LOGGER.debug("This is debug message.");
        // 记录info级别的信息
        LOGGER.info("This is info message.");
        // 记录warn级别的信息
        LOGGER.info("This is warn message.");
        // 记录error级别的信息
        LOGGER.error("This is error message.");

    }

}
