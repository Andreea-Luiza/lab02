package ro.ase.cts.lab02;

import ro.ase.cts.lab02.exceptions.AmountDiscountValueException;
import ro.ase.cts.lab02.exceptions.InvalidPriceValueException;
import ro.ase.cts.lab02.exceptions.PercentageValueException;
import ro.ase.cts.lab02.exceptions.StringMinLengthException;

public class Product {
    private int id;
    private String name;
    private double price;
    private String description;


    public Product(int id, String name, double price, String description) {
        try{
            this.id = id;
            if(name.length()<5){
                throw new StringMinLengthException();
            }else {
                this.name = name;
            }
            if(price<0){
                throw new InvalidPriceValueException();
            }else {
                this.price = price;
            }
            this.description = description;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public boolean equals(Product p)
    {
        if((p.id != this.id) ||
                (!p.name.equals(this.name)) ||
                (p.price != this.price)||
                (!p.description.equals(this.description)))
            return false;
        return true;
    }

    public void applyPercentageDiscount(float discountPercentage){
        try{
            if(discountPercentage<0||discountPercentage>100){
                throw new PercentageValueException();
            }else{
                this.price-=this.price*discountPercentage/100;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void applyAmountDiscount(double discountAmount){
        try{
            if(discountAmount>this.price){
                throw new AmountDiscountValueException();
            }else{
                this.price-=discountAmount;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    public void increasePricePercentage(float pricePercentage){
        try{
            if(pricePercentage<0||pricePercentage>100){
                throw new PercentageValueException();
            }else{
                this.price+=this.price*pricePercentage/100;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void increaseAmountPrice(double priceAmount){
        try{
            if(priceAmount<0){
                throw new AmountDiscountValueException();
            }else{
                this.price+=priceAmount;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
