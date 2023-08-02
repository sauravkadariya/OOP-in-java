class A {
    A show() {
        System.out.println("learn coding");
        return this;
    }
}

class B extends A {
    @Override

    B show() {
        super.show();
        System.out.println("Please Like");
        return new B();
    }
}

public class covarient_returnType {
    public static void main(String[] args) {
        B r = new B();
        r.show();

    }

}
