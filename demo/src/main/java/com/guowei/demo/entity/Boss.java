package com.guowei.demo.entity;

/**
 * <p>
 *  老板类
 * </p>
 *
 * @author guowei
 * @since 2020-12-30
 */
public class Boss {
    public Boss(String name, String[] titles) {
        this.name = name;
        this.titles = titles;
    }

    /**
     * 老板名
     */
    String name;
    /**
     * 老板头衔
     */
    String[] titles;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getTitles() {
        return titles;
    }

    public void setTitles(String[] titles) {
        this.titles = titles;
    }
}
