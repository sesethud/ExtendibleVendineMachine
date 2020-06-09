package tests;


import org.junit.jupiter.api.Test;
import product.Chocolate;
import product.SaltySnack;
import product.SoftDrink;
import vendingmachine.Product;
import vendingmachine.extendibleVendingMachine;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class vendingMachineTest {

        Product chocolate=new Chocolate();
        Product saltySnack=new SaltySnack();
        Product softDrink=new SoftDrink();
    extendibleVendingMachine obj=new extendibleVendingMachine(3,2,4);

    @Test
    public void testStock(){

        obj.buy(chocolate,1);
        obj.buy(saltySnack,1);
        obj.buy(softDrink,1);

        assertEquals(2,obj.getStock(chocolate));
        assertEquals(1,obj.getStock(saltySnack));
        assertEquals(3,obj.getStock(softDrink));

    }

}
