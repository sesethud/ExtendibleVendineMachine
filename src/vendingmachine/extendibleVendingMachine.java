package vendingmachine;

import product.Chocolate;
import product.SaltySnack;
import product.SoftDrink;

public class extendibleVendingMachine {

    private int softDrinkQty;
    private int saltySnacksQty;
    private int chocolatesQty;

    public extendibleVendingMachine(int chocolatesQty,int saltySnacksQty,int softDrinkQty){
        this.chocolatesQty=chocolatesQty;
        this.saltySnacksQty=saltySnacksQty;
        this.softDrinkQty=softDrinkQty;
    }
  // Product chocolate=new  Chocolate();
    public void buy(Product product, int quantity){
        if(product instanceof Chocolate ) {
            chocolatesQty=chocolatesQty-quantity;

        }if(product instanceof SaltySnack){
            saltySnacksQty=saltySnacksQty-quantity;
        }
        if(product instanceof SaltySnack){
            softDrinkQty=softDrinkQty-quantity;
        }
    }
    public int getStock(Product product){
        if(product instanceof Chocolate){
            return chocolatesQty;
        }
        if(product instanceof SaltySnack){
            return saltySnacksQty;
        }
        if(product instanceof SoftDrink){
            return softDrinkQty;
        }
        return 0;
    }
    public void addStock(Product product){
        if(product instanceof Chocolate){
            chocolatesQty=chocolatesQty+3;
        }if(product instanceof SaltySnack){
            saltySnacksQty=saltySnacksQty+3;
        }if(product instanceof SoftDrink){
            softDrinkQty=softDrinkQty+3;
        }
    }
}
