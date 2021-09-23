package com.study.observer;

/**
 * @author ：songdalin
 * @date ：2021-09-23 下午 09:09
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class ObserverImpl implements IObserver {

    public ObserverImpl (){}

    @Override
    public void update(int num) {
        System.out.println(Thread.currentThread() + "  " + this.getClass().getName()+ " 接收到了通知：" + num);
    }
}
