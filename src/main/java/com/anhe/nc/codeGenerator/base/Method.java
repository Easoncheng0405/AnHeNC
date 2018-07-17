package com.anhe.nc.codeGenerator.base;


import java.util.Map;

/*
 * 作者：程杰
 * 创建时间：2018/7/17
 * 博客地址：www.chengjie-jlu.com
 */
public class Method {

    /**
     * 函数名
     */
    private String name;

    /**
     * 访问修饰符
     */
    private Access access;

    /**
     * 返回类型
     */
    private String returnType;

    /**
     * 参数列表
     */
    private Map<String,String> argument;

    /**
     * 是否静态
     */
    private boolean isStatic;

    /**
     * 函数内容
     */
    private String content;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public Map<String, String> getArgument() {
        return argument;
    }

    public void setArgument(Map<String, String> argument) {
        this.argument = argument;
    }

    public boolean isStatic() {
        return isStatic;
    }

    public void setStatic(boolean aStatic) {
        isStatic = aStatic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Method method = (Method) o;

        if (name != null ? !name.equals(method.name) : method.name != null) return false;
        return argument != null ? argument.equals(method.argument) : method.argument == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (argument != null ? argument.hashCode() : 0);
        return result;
    }
}
