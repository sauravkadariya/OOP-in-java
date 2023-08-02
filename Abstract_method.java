abstract class programming {
    public abstract void developer();

    public abstract void Rank();
}

abstract class HTML extends programming {
    @Override
    public void developer() {
        System.out.println("Tim Berners Lee.");
    }

}

class java extends HTML {
    @Override
    public void developer() {
        System.out.println("James Gosling.");
    }

    @Override
    public void Rank() {
        System.out.println("First...");

    }
}

public class Abstract_method {
    public static void main(String[] args) {

        programming j = new java();
        j.developer();
        j.Rank();
    }
}
