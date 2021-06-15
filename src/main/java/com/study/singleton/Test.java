package com.study.singleton;

/**
 * @author ：songdalin
 * @date ：2021-06-15 上午 09:33
 * @description：
 * @modified By：
 * @version: 1.0
 */
public class Test {

    public static void main(String[] args){
/*        for (int i = 0; i < 20; i++) {
            new Thread() {
                @Override
                public void run() {
                    Singleton singleton = new Singleton();
                    System.out.println(singleton.getT().hashCode());
                }

            }.start();
        }*/

        for (int i = 0; i < 20; i++) {
            new Thread() {
                @Override
                public void run() {
                    System.out.println(EHANSingleton.getT().hashCode());
                }

            }.start();
        }

    }
}
