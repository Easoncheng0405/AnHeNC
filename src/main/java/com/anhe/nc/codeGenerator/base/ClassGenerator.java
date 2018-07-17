package com.anhe.nc.codeGenerator.base;

/*
 * 作者：程杰
 * 创建时间：2018/7/17
 * 博客地址：www.chengjie-jlu.com
 */


import java.util.List;

/**
 * 类生成器，只能生成主类
 */
public class ClassGenerator{

    /**
     * 类名
     */
    private String name;

    /**
     * 父类
     */
    private String parentClassName;

    /**
     * 实现的接口
     */
    private List<String> interfaces;


    /**
     * 属性
     */
    private Properties properties;


    /**
     * 方法
     */
    private Method method;





}
