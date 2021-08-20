package com.study.factory.simple;

/**
 * @author ：songdalin
 * @date ：2021-08-20 下午 02:09
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Test {

    public static void main(String[] args){
        SimpleNoodleFactory.createNoodle("1").desc();
        SimpleNoodleFactory.createNoodle("2").desc();

    }
}
