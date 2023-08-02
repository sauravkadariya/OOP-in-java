interface customerRaj {
    int amt = 5; // public + static + final

    void purchase();
}

class sellerSanju implements customerRaj {
    @Override
    public void purchase() {
        // amt = 7; final cannot initialise
        System.out.println("Raj needs " + amt + "kg rice");
    }
}

public class interface_variable {
    public static void main(String[] args) {
        customerRaj c = new sellerSanju();
        c.purchase();
        System.out.println(customerRaj.amt);// static variable
    }
}
