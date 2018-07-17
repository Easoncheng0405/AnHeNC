package com.anhe.nc.codeGenerator.base;

/*
 * 作者：程杰
 * 创建时间：2018/7/17
 * 博客地址：www.chengjie-jlu.com
 */

/**
 * 属性类
 */
public class Properties {

    private String name;

    private Access access;

    private String type;

    private boolean isStatic;

    private boolean isFinal;

    public Properties(String name, Access access, String type) {
        this.name = name;
        this.access = access;
        this.type = type;
        this.isStatic = false;
        this.isFinal = false;
    }

    /**
     * 属性生成器
     *
     * @return 方法代码
     */
    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append(Constant.CHANGE_LINE).append(access).append(" ");

        if (isStatic)
            builder.append("static ");

        if (isFinal)
            builder.append("final ");

        builder.append(type).append(" ").append(name).append(Constant.SEMICOLON).append(Constant.CHANGE_LINE);

        return builder.toString();
    }


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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatic() {
        return isStatic;
    }

    public void setStatic(boolean aStatic) {
        isStatic = aStatic;
    }

    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean aFinal) {
        isFinal = aFinal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Properties that = (Properties) o;

        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
