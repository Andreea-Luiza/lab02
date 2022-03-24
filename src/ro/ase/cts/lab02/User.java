package ro.ase.cts.lab02;

import ro.ase.cts.lab02.exceptions.IdentiferValueException;
import ro.ase.cts.lab02.exceptions.StringMinLengthException;

import java.util.ArrayList;

public class User {
    private String username;
    private int id;
    private String name;
    private ArrayList<Order> orderHistory;
    private Cart shoppingCart;

    public User(String username, int id, String name) {
        try{
            if(id<1){
                throw new IdentiferValueException();
            }else{
                this.id = id;
            }
            if(username.length()<5){
                throw new StringMinLengthException();
            }else{
                this.username = username;
            }
            if(name.length()<5){
                throw new StringMinLengthException();
            }else{
                this.name = name;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void addO1(Order order)
    {
        this.orderHistory.add(order);
    }

    public void addO2(Product product)
    {
        this.shoppingCart.add(product);
    }
}
