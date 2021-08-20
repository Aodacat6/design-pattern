package com.study.factory.abstractfactory;

/**
 * @author ：songdalin
 * @date ：2021-08-20 下午 02:23
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Factory implements IFactory {
    @Override
    public INoodle createNoodle() {
        return new Noodle();
    }

    @Override
    public IRice createRice() {
        return new Rice();
    }
}
