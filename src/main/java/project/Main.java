package project;

import project.confections.*;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        GiftBox box = new GiftBox();

        //add method test
        box.addConfection(new Kitkat());
        box.addConfection(new Kitkat());
        box.addConfection(new Kitkat());
        box.addConfection(new Mars());
        box.addConfection(new Mars());
        box.addConfection(new Bounty());
        box.addConfection(new Nuts());
        box.addConfection(new Snickers());
        box.addConfection(new Snickers());

        System.out.println();
        box.printFullInfo();
        System.out.println();

        //remove methods test
        box.removeConfection();
        System.out.println();
        box.removeConfection(3);
        System.out.println();
        box.removeConfection(-777777);

        System.out.println();
        box.printFullInfo();
        System.out.println();


        //print methods test
        box.printPrice();
        System.out.println();
        box.printWeight();
        System.out.println();
        box.printFullInfo();
        System.out.println();

        //reduce price method test
        box.reducePrice(-9);
        System.out.println();
        box.reducePrice(99999);
        System.out.println();
        box.reducePrice(0);
        System.out.println();
        box.reducePrice(15);
        System.out.println();

        box.printFullInfo();

        //uncomment to test

       /* box.addConfection(new Kitkat());
        box.addConfection(new Kitkat());
        box.addConfection(new Kitkat());
        box.addConfection(new Mars());
        box.addConfection(new Mars());
        box.addConfection(new Bounty());
        box.addConfection(new Nuts());
        box.addConfection(new Snickers());
        box.addConfection(new Snickers());
        box.addConfection(new Kitkat());
        box.addConfection(new Kitkat());
        box.addConfection(new Kitkat());
        box.addConfection(new Mars());
        box.addConfection(new Mars());
        box.addConfection(new Bounty());
        box.addConfection(new Nuts());
        box.addConfection(new Snickers());
        box.addConfection(new Snickers());
        box.addConfection(new Kitkat());
        box.addConfection(new Kitkat());
        box.addConfection(new Kitkat());
        box.addConfection(new Mars());
        box.addConfection(new Mars());
        box.addConfection(new Bounty());
        box.addConfection(new Nuts());
        box.addConfection(new Snickers());
        box.addConfection(new Snickers());
        System.out.println();*/

        //reduce weight method test
        box.reduceWeight(-9);
        System.out.println();
        box.reduceWeight(99999);
        System.out.println();
        box.reduceWeight(2);
        System.out.println();
        box.reduceWeight(0);
        System.out.println();

        box.printFullInfo();
    }
}