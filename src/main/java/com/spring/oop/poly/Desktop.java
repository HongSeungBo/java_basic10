package com.spring.oop.poly;

public class Desktop {

    Monitor monitor;

    int[] arr;

    public Desktop(){
        this.monitor = new LgMonitor();

        arr = new int[] {10, 20, 30, 40};
    }
}
