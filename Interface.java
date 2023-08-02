import java.util.Scanner;

interface client {
    void input();// public + abstract

    void output();
}

class Raju implements client {
    String name;
    double salary;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username:");
        name = sc.nextLine();
        System.out.println("Enter Salary:");
        salary = sc.nextDouble();
    }

    public void output() {
        System.out.println(name + " " + salary);
    }
}

public class Interface {
    public static void main(String[] args) {
        client c = new Raju();
        c.input();
    }

}
