package com.spring.oop.poly;

class Avante extends Car{

    @Override
    void run() {
        System.out.println("아반떼가 달립니다.");
    }
    void nMode(){
        System.out.println("아반떼가 빠르게 달립니다.");
    }
}
class Sonata extends Car{
    @Override
    void run() {
        System.out.println("소나타가 달립니다.");
    }
}
class Granduer extends Car{
    @Override
    void run() {
        System.out.println("그랜져가 달립니다.");
    }
}

public class Car {
    void run(){
        System.out.println("자동차가 달립니다.");
    }
}
