package com.anhe.nc.codeGenerator.base;

/*
 * 作者：程杰
 * 创建时间：2018/7/17
 * 博客地址：www.chengjie-jlu.com
 */
public enum Access {
    PRIVATE("private"), DEFAULT(""), PROTECT("protect"), PUBLIC("public");

    private final String name;

    Access(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
