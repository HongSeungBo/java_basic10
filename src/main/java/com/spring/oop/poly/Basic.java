package com.spring.oop.poly;

class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
}

class E extends C {
}

public class Basic {

    public Basic() {
        A a = new A();
        Object a1 = a;

        A b = new B();

        a = b;

        D d = new D();

    }

}
