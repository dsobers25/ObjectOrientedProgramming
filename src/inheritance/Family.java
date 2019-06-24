package inheritance;

public class Family extends WhatWillYouGet {

    public static void main(String[] args) {
        Family family = new Family();
        Family mom = new Family();
        Family son = new Family();
        Family daughter = new Family();
        son.money = son.money *.25;
        mom.money = mom.money * .5;
        daughter.money = daughter.money * .25;

        System.out.printf("Family shall receive $%.2f dollars upon my death as well as a few other valuables\n", family.money);

        System.out.println("Mother will be given the job of splitting the money and valuables with the children");

        System.out.println("50% goes to her and the two children will receive 25% of the total funds");

        System.out.printf("Therefore mother will receive %.2f to keep for herself \n", mom.money);

        System.out.printf("Son will receive $%.2f \n", son.money);
        System.out.printf("Also Daughter will receive the exact same amount of $%.2f dollars \n", daughter.money);

        System.out.println("One thing that will be missed is the sounds of his various forms of meditations " );
        mom.peaceHabits();
    }
}
