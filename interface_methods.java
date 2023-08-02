interface client {
    void webdesign(); // public abstract

    void webdevelop();
}

abstract class RajTech implements client {
    @Override
    public void webdesign() {
        System.out.println("Green,top menu,three dot button");
    }
}

class RahulTech extends RajTech {
    @Override
    public void webdevelop() {
        System.out.println("HTML, CSS, JavaScript");
    }
}

public class interface_methods {
    public static void main(String[] args) {
        RahulTech r = new RahulTech();
        r.webdesign();
        r.webdevelop();
    }

}
