package com.study.factory.simple;

/**
 * @author ：songdalin
 * @date ：2021-08-20 下午 02:06
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class SimpleNoodleFactory {

    public static final String LZ = "1";

    public static final String HJ = "2";

    public static INoodle createNoodle(String type) {
        if (type == LZ) {
            return new LanzhouNoodle();
        }else if (type == HJ) {
            return new FireChickenNoodle();
        }
        return null;
    }
}
