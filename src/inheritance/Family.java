package inheritance;

public class Family extends WhatWillYouGet {

    public static void main(String[] args) {
        Family mom = new Family();
        Family son = new Family();
        son.money = son.money *.25;

        System.out.println("Family shall receive $" + Family.money + " dollars upon my death");

        System.out.println("Mother will be given the job to split the money with the children");

        System.out.println("50% goes to her and the two children will receive 25% of the total funds");

        System.out.println("Therefore mother will receive " + mom.money + " to keep for herself");

        System.out.printf("And son will receive %.2f", son.money);
    }
}
