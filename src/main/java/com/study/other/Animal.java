package com.study.other;

/**
 * @author ：songdalin
 * @date ：2021-08-20 下午 01:55
 * @description：
 * @modified By：
 * @version: 1.0
 */
public abstract class Animal implements Behaver {

    protected String kind;

    @Override
    public void eat() {
        System.out.println(kind + " can eat...");
    }
}
