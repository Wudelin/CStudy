package com.example.wudelin.cstudy.util;

/**
 * Created by wudelin on 2017/11/24.
 */

public class URL {
    //服务器ip
    private static final String HTTP_URL = "http://114.67.224.207:8080/Okhttp/";

    //获取答案
    public static final String HTTP_URL_ANSWER = HTTP_URL+"Answer?l_name=";

    //获取题目
    public static final String HTTP_URL_PROBLEM = HTTP_URL+"Problen?l_name=";

    //获取给个章节题目数
    private static final String HTTP_URL_PROBLEM_LENGTH = HTTP_URL+"Req_length?l_name=";
}
