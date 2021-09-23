package com.study.observer;

/**
 * @author ：songdalin
 * @date ：2021-09-23 下午 08:50
 * @description：观察者模式
 * @modified By：
 * @version: 1.0
 */
public interface IObserver {

    /**
     *
     * 观察者
     *
     */

    //接收消息
    void update(int num);
}
