package com.study.factory.abstractfactory;

/**
 * @author ：songdalin
 * @date ：2021-08-20 下午 02:22
 * @description：
 * @modified By：
 * @version: 1.0
 */
public interface IFactory {

    INoodle createNoodle();

    IRice createRice();

}
