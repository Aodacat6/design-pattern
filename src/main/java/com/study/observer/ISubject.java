package com.study.observer;

/**
 * @author ：songdalin
 * @date ：2021-09-23 下午 08:54
 * @description：被观察者接口
 * @modified By：
 * @version: 1.0
 */
public interface ISubject {

    //注册主题
    void addSubject(IObserver observer);

    //取消注册
    void removeSubject(IObserver observer);

    //通知观察者更新
    void notifyObservers();
}
