package com.study.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：songdalin
 * @date ：2021-09-23 下午 08:57
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class SubjectImpl implements ISubject {

    public SubjectImpl() {
    }

    //维护观察者列表
    private List<IObserver> observers = new ArrayList<>();

    @Override
    public void addSubject(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeSubject(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(8);
        }
    }
}
