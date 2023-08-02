interface Gill {
    void addition();
}

interface Raj extends Gill {

    void subtraction();
}

class Saurav implements Raj {
    @Override
    public void addition() {
        int a = 10, b = 10, c;
        c = a + b;
        System.out.println("Additon " + c);
    }

    @Override
    public void subtraction() {
        int a = 10, b = 5, c;
        c = a - b;
        System.out.println("Subtraction " + c);
    }
}

public class Extending_interface {
    public static void main(String[] args) {
        Raj r = new Saurav();
        r.addition();
        r.subtraction();
    }
}
