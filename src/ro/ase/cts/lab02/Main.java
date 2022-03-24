package ro.ase.cts.lab02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // write your code here
        OShop o = new OShop("Emag", "logo.jpg", new ArrayList<>());

        Product product1 = new Product(1,"Laptop" ,3444,"");
        Product product2 = new Product(2,"Frigider" ,3784,"");


        o.modifyProductsList(1,product1);
        o.modifyProductsList(1,product2);

        o.modifyProductsList(2, product1);
        System.out.println(product1.equals(product2));
    }
}
