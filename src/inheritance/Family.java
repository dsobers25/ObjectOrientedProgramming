package inheritance;

public class Family extends WhatWillYouGet {

    public static void main(String[] args) {
        Family mom = new Family();
        System.out.println("Mother shall receive $" + mom.money + " dollars upon my death");
    }
}
