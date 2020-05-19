package project;

import java.sql.SQLOutput;
import java.util.*;

public class GiftBox implements AbleToBeGifted {
    private ArrayList<Confection> confectionList;
    private int     countOfConfections;
    private double  weight;
    private int     price;

    public GiftBox() {
        confectionList = new ArrayList<>();
    }

    @Override
    public void addConfection(Confection confection) {
        confectionList.add(confection);
        System.out.println(confection.getName() + " has successfully added.");

        countOfConfections++;
        weight += confection.getWeight();
        price  += confection.getPrice();
    }

    @Override
    public void removeConfection(int index) {
        if (confectionList.isEmpty()) {
            System.out.println("Gift box is empty.");
        }
        else if (index >= 0 && index < confectionList.size()) {
            Confection target = confectionList.get(index);
            confectionList.remove(index);
            System.out.println(target.getName() + " has successfully removed.");

            countOfConfections--;
            weight -= target.getWeight();
            price  -= target.getPrice();
        }
        else {
            System.out.println("Index " + index + " is invalid... Try again.");
        }
    }

    public void removeConfection() {
        if (confectionList.isEmpty()) {
            System.out.println("Gift box is empty.");
        }
        else {
            Confection target = confectionList.get(confectionList.size() - 1);
            confectionList.remove(confectionList.size() - 1);
            System.out.println(target.getName() + " has successfully removed.");

            countOfConfections--;
            weight -= target.getWeight();
            price  -= target.getPrice();
        }
    }

    @Override
    public void printWeight() {
        if (confectionList.isEmpty()) {
            System.out.println("The gift box is empty. Weight is 0kg");
        }
        else {
            System.out.println("The weight of the gift box is " + weight + "kg.");
        }
    }

    @Override
    public void printPrice() {
        if (confectionList.isEmpty()) {
            System.out.println("The gift box is empty. Price is 0rub.");
        }
        else {
            System.out.println("The price of the gift box is " + price + "rub.");
        }
    }

    @Override
    public void printFullInfo() {
        System.out.println("Info about this gift box:\n");
        System.out.println("Count of confections - " + this.countOfConfections + "\nWeight - " + this.weight + "kg\nPrice: " + this.price + "rub\n");
        for (Confection element : confectionList) {
            System.out.println(element);
        }
    }

    public void reduceWeight(double weight) {
        if (weight < 0) {
            System.out.println("Entered invalid value.");
        }
        else if (weight == 0) {
            confectionList.clear();
            this.countOfConfections = 0;
            this.weight = 0;
            this.price = 0;
            System.out.println("Done. The weight of this gift box is 0kg.");
        }
        else if (confectionList.isEmpty()) {
            System.out.println("The gift box is empty.");
        }
        else if (this.weight < weight) {
            System.out.println("The weight of this gift box is already less than entered value.");
        }
        else {
            while (this.weight >= weight && !confectionList.isEmpty()) {
                Confection minWeightTarget = confectionList.get(0);
                for (Confection element : confectionList) {
                    if (minWeightTarget.getWeight() > element.getWeight()) {
                        minWeightTarget = element;
                    }
                }
                confectionList.remove(minWeightTarget);
                countOfConfections--;
                this.weight -= minWeightTarget.getWeight();
                this.price -= minWeightTarget.getPrice();
                System.out.println(minWeightTarget.getName() + " has removed. " + "Weight is " + this.weight + "kg.");
            }
        }
    }

    public void reducePrice(int price) {
        if (price < 0) {
            System.out.println("Entered invalid value.");
        }
        else if (price == 0) {
            confectionList.clear();
            this.countOfConfections = 0;
            this.weight = 0;
            this.price = 0;
            System.out.println("Done. The price of this gift box is 0rub.");
        }
        else if (confectionList.isEmpty()) {
            System.out.println("The gift box is empty.");
        }
        else if (this.price < price) {
            System.out.println("The price of this gift box is already less than entered value.");
        }
        else {
            while (this.price >= price && !confectionList.isEmpty()) {
                Confection minPriceTarget = confectionList.get(0);
                for (Confection element : confectionList) {
                    if (minPriceTarget.getPrice() > element.getPrice()) {
                        minPriceTarget = element;
                    }
                }
                confectionList.remove(minPriceTarget);
                countOfConfections--;
                this.weight -= minPriceTarget.getWeight();
                this.price -= minPriceTarget.getPrice();
                System.out.println(minPriceTarget.getName() + " has removed. " + "Price is " + this.price + "rub.");
            }
        }
    }
}
