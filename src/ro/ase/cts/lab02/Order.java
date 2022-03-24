package ro.ase.cts.lab02;

import java.util.ArrayList;

public class Order {
    private ArrayList<Product> productsList;
    private String address;

    public Order()
    {
        productsList = new ArrayList<Product>();
    }
    public void add(Product p)
    {
        if(productsList.size() > 99)
            return;

        productsList.add(p);
    }

    public void remove(Product p)
    {
        productsList.remove(p);
    }

    public String getAddr() {
        return address;
    }

    public void setAddr(String addr) {
        this.address = addr;
    }
}
