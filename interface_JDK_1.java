//------- Interface JDK 1.8 ------
interface A {
    void a1(); // public +abstract

    void a2(); // public + abstract

    default void a3() { // not abstract
        System.out.println("may or may not override in implementing classes");
    }

}

class B implements A {
    public void a1() {
        System.out.println("Class B a1()");
    }

    public void a2() {
        System.out.println("Class B a2()");
    }

    public void a3() { // not abstract
        System.out.println("Overriding in class B");
    }
}

class C implements A {
    public void a1() {
        System.out.println("Class C a1()");
    }

    public void a2() {
        System.out.println("Class C a2()");
    }
}

class D implements A {
    public void a1() {
        System.out.println("Class D a1()");
    }

    public void a2() {
        System.out.println("Class D a2()");
    }
}

public class interface_JDK_1 {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        b.a1();
        b.a2();
        c.a1();
        c.a2();
        d.a1();
        d.a2();
        b.a3();
    }

}
