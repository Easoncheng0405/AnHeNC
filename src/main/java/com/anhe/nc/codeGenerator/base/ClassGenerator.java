package com.anhe.nc.codeGenerator.base;

/*
 * 作者：程杰
 * 创建时间：2018/7/17
 * 博客地址：www.chengjie-jlu.com
 */

import java.util.Set;

/**
 * 类生成器，只能生成主类
 */
public class ClassGenerator {

    /**
     * 包名
     */
    private String packageName;

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
    private Set<String> interfaces;


    /**
     * 属性
     */
    private Set<Properties> properties;


    /**
     * 方法
     */
    private Set<Method> method;

    public String getPackageName() {
        return packageName;
    }

    public ClassGenerator setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    public String getName() {
        return name;
    }

    public ClassGenerator setName(String name) {
        this.name = name;
        return this;
    }

    public String getParentClassName() {
        return parentClassName;
    }

    public ClassGenerator setParentClassName(String parentClassName) {
        this.parentClassName = parentClassName;
        return this;
    }

    public Set<String> getInterfaces() {
        return interfaces;
    }

    public ClassGenerator setInterfaces(Set<String> interfaces) {
        this.interfaces = interfaces;
        return this;
    }

    public Set<Properties> getProperties() {
        return properties;
    }

    public ClassGenerator setProperties(Set<Properties> properties) {
        this.properties = properties;
        return this;
    }

    public Set<Method> getMethod() {
        return method;
    }

    public ClassGenerator setMethod(Set<Method> method) {
        this.method = method;
        return this;
    }
}
