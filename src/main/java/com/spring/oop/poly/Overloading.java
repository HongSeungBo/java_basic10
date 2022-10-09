package com.spring.oop.poly;

public class Overloading {
    void foo(){}
    void foo(int a){}
    void foo(double a){}
    void foo(int x, double y){} // 오버로딩은 메서드 이름이 같아도 매개변수 타입만 다르면 가능
    void foo(double y, int x){}
    void foo(int x, int y){}
    void foo(double x, double y){}

    public Overloading(){
        foo(10.5,20.1);
    }
}
