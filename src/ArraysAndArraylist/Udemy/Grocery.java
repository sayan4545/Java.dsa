package ArraysAndArraylist.Udemy;

import java.util.ArrayList;

public class Grocery {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grocery(String name, String type, int amount, int unit_price) {
        this.name = name;
        this.type = type;
        this.amount = amount;
        this.unit_price = unit_price;
    }

    @Override
    public String toString() {
        return STR."Grocery{name='\{name}\{'\''}, type='\{type}\{'\''}, amount=\{amount}, unit_price=\{unit_price}\{'}'}";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(int unit_price) {
        this.unit_price = unit_price;
    }

    String name;
    String type;
    int amount;
    int unit_price;


}
