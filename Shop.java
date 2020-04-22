package lesson;

import java.util.ArrayList;
import java.util.Iterator;

public class Shop {
    int s = 0;
    private ArrayList<Automobile> automobiles = new ArrayList<>();

    public void addAutomobile(Automobile automobile) {
        automobiles.add(automobile);
        System.out.println(automobile);
    }

    public void priceOfAllAutomobiles() {
        for (Automobile automobile : automobiles) {
            automobile.priceOfAutomobile();
            s += automobile.getPrice();
        }
        System.out.println("Price of All Automobiles: " + s);
    }

    public void sellAutomobile(Automobile automobile) {
        automobiles.remove(automobile);
        System.out.println(automobile.getName()+" is sold!");
        inStockAuto();
    }

    public void inStockAuto() {
        System.out.println("In Stock Automobiles: ");
        for (Automobile automobile1 : automobiles)
            System.out.print(automobile1.getName()+" ");
    }
}

