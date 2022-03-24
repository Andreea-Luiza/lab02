package ro.ase.cts.lab02;

import java.util.ArrayList;

public class Cart {

    private String username;
    private int id;
    private String name;
    private ArrayList<Product> products;

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void add(Product p)
    {
        if(products.size() > 99)
            return;

        products.add(p);
    }
}
