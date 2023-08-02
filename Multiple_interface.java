interface A {
    void show();

}

interface B {
    void Disp();

}

class Multiple_interface implements A, B {
    public void show() {
        System.out.println("Interface A");
    }

    public void Disp() {
        System.out.println("Interface  B");
    }

    public static void main(String[] args) {
        Multiple_interface m = new Multiple_interface();
        m.show();
        m.Disp();

    }

}
