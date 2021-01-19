package ru.golovanova.Inheritance;

import java.util.Objects;

public class DiscountedItem extends Item{
    protected double discount;

    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject)
            return true;
        if (otherObject == null)
            return false;
        if (super.equals(otherObject) == false)
            return false;
        if (otherObject instanceof DiscountedItem) {
            DiscountedItem other = (DiscountedItem) otherObject;
            if (discount == other.discount) {
                return true;
            } else return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), discount);
    }

    public static void main(String[] args) {
        DiscountedItem one = new DiscountedItem("Number", 12.0, 5);
        DiscountedItem two = new DiscountedItem("Number", 12.0, 3);
        Item three= new Item("Number", 12.0);
        System.out.println("DiscountedItem one = Item three ?");
        System.out.println(one.equals(three));
        System.out.println("DiscountedItem two = Item three ?");
        System.out.println(three.equals(two));
        System.out.println("DiscountedItem one = Item two ?");
        System.out.println(one.equals(two));
    }

}
