package lesson;

import java.util.ArrayList;
import java.util.List;

public abstract class Automobile {
    private String name;
    private int price;
    private int speed;
    private int year;


    public Automobile(String name, int price, int speed, int year) {
        this.name = name;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Automobile:" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                ", year=" + year +
                '.';
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void priceOfAutomobile() {
    }

    ;
}
