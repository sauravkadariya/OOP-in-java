interface A {
    public static void show() {
        System.out.println("Can't override interface static methods");
    }
}

class Demo implements A {
    // @override

    public static void show() {
        System.out.println("Error");
    }
}

public class interface_jdk2 {
    public static void main(String[] args) {
        A.show();
        Demo d = new Demo();
        d.show();

    }

}
