package inheritance;

public class Family extends WhatWillYouGet {

    public static void main(String[] args) {
        Family family = new Family();
        Family mom = new Family();
        Family son = new Family();
        son.money = son.money *.25;
        mom.money = mom.money * .5;

        System.out.printf("Family shall receive $%.2f dollars upon my death as well as a few other valuables\n", family.money);

        System.out.println("Mother will be given the job of splitting the money and valuables with the children");

        System.out.println("50% goes to her and the two children will receive 25% of the total funds");

        System.out.printf("Therefore mother will receive %.2f to keep for herself \n", mom.money);

        System.out.printf("And son will receive %.2f", son.money);
    }
}
