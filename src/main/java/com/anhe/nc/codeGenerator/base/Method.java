package com.anhe.nc.codeGenerator.base;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;

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
    private Map<String, String> argument;

    /**
     * 是否静态
     */
    private boolean isStatic;

    /**
     * 函数内容
     */
    private String content;


    public Method(String name, Access access, String returnType, Map<String, String> argument) {
        this.name = name;
        this.access = access;
        this.returnType = returnType;
        this.argument = argument;
        this.isStatic = false;
        this.content = Constant.CHANGE_LINE;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(Constant.CHANGE_LINE).append(access).append(" ");
        if (isStatic)
            builder.append("static ");

        builder.append(returnType).append(" ").append(name).append(Constant.LEFT_LITTLE_PARENTHESIS);
        Iterator<Map.Entry<String, String>> it = argument.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            builder.append(entry.getValue()).append(" ").append(entry.getKey());
            if (it.hasNext())
                builder.append(Constant.COMMA).append(" ");
        }

        builder.append(Constant.RIGHT_LITTLE_PARENTHESIS).append(Constant.LEFT_BIG_PARENTHESIS)
                .append(Constant.CHANGE_LINE).append(Constant.TAB).append(content).append(Constant.CHANGE_LINE);

        builder.append(Constant.RIGHT_BIG_PARENTHESIS).append(Constant.CHANGE_LINE);
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
