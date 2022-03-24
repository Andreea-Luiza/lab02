package ro.ase.cts.lab02;

public class ProductInventory {
    private Product product;
    private int quantity;

    public ProductInventory(Product p, int q)
    {
//        this.product = new Product(p);
        this.quantity = q;
    }
    public Product getP() {
        return product;
    }

    public void setP(Product p) {
        this.product = p;
    }

    public int getQ() {
        return quantity;
    }

    public void setQ(int q) {
        this.quantity = q;
    }

}
