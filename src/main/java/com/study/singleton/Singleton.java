package com.study.singleton;

/**
 * @author ：songdalin
 * @date ：2021-06-15 上午 09:29
 * @description：单例模式
 * @modified By：
 * @version: 1.0
 */
public class Singleton {

    /**
     * 懒汉模式
     * 静态模式，类变量
     */
    private static T t = new T();

    private Singleton() {}


    public static T getT() {
        return t;
    }
}
