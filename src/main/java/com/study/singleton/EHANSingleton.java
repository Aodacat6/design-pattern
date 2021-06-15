package com.study.singleton;

/**
 * @author ：songdalin
 * @date ：2021-06-15 上午 09:40
 * @description：饿汉模式
 * @modified By：
 * @version: 1.0
 */
public class EHANSingleton {

    /**
     * 饿汉模式
     *
     * DLC
     *
     * 指令重排序
     */

    //volitile 防止指令重排序
    private static volatile T t;

    private EHANSingleton() {}
    /**
     * synchronized 放并发
     * @return
     */
/*    public static synchronized T getT() {
        if(t == null) {
            t = new T();
        }
        return t;
    }*/

    /**
     * 升级  DLC模式锁
     * @return
     */
    public static T getT() {
        if(t == null) {
            synchronized (EHANSingleton.class) {
                if (t == null) {
                    t = new T();
                }
            }
        }
        return t;
    }
}
