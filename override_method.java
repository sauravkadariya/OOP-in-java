class A {
    void show() {
        System.out.println("Super class");
    }
}

class B extends A {
    @Override
    void show() {
        System.out.println("Sub class");
    }

    void disp() {
        System.out.println("Sub2 class");
    }
}

public class override_method {
    public static void main(String[] args) {
        B r = new B();
        r.show();
        r.disp();
    }
}
