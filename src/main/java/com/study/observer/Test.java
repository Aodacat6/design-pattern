package com.study.observer;

/**
 * @author ：songdalin
 * @date ：2021-09-23 下午 09:10
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Test {

    public static void main(String[] args){
        ISubject iSubject = new SubjectImpl();
        IObserver observer1 = new ObserverImpl();
        IObserver observer2 = new ObserverImpl();
        iSubject.addSubject(observer1);
        iSubject.addSubject(observer2);
        iSubject.notifyObservers();
    }
}
