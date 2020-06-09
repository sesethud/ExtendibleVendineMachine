package com.company;

import product.Chocolate;
import product.SaltySnack;
import product.SoftDrink;
import vendingmachine.Product;
import vendingmachine.extendibleVendingMachine;

public class Main {

    public static void main(String[] args) {
       // System.out.println("Testing stuff");
        extendibleVendingMachine obj=new extendibleVendingMachine(3,2,4);
        Product chocolate=new Chocolate();
        Product saltySnacksQty=new SaltySnack();
        Product softDrinkQty=new SoftDrink();

        obj.buy(chocolate,1);
        obj.buy(saltySnacksQty,1);
        obj.buy(softDrinkQty,1);

        System.out.println(obj.getStock(chocolate));
        System.out.println(obj.getStock(saltySnacksQty));
        System.out.println(obj.getStock(softDrinkQty));

        obj.addStock(chocolate);
        obj.addStock(saltySnacksQty);
        obj.addStock(softDrinkQty);
        System.out.println(obj.getStock(chocolate));

    }
}
