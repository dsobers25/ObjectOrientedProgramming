package encapsulation;

// This program uses a CandyStore object to call public accessor and mutator methods
// to get and or set private instance variables
public class TestCandyStore {

    public static void main(String[] args) {
        // created an object named Deron from the CandyStore class
        CandyStore Deron = new CandyStore();

        // using the "." operator and the mutator methods from the CandyStore class
        // I am assigning the instance variables to equal the String I am passing in
        // the setter methods parameters
        Deron.setSweetCandy("Tropical Lemonheads");
        Deron.setSourCandy("Sour Power Straws");
        Deron.setChocolate("Dark Chocolate Blueberries");

        // each of the String variables equal a Deron object "." operator getter
        // method to return the value of the Deron instance variable
        String deronSweet = Deron.getSweetCandy();
        String deronSour = Deron.getSourCandy();
        String deronChocolate = Deron.getChocolate();

        // outputs the candy that Deron selected
        System.out.println("Deron selected some amazing " + deronSweet);
        System.out.println("Deron selected some tongue twisting " + deronSour);
        System.out.println("Deron selected some tart but sweet " + deronChocolate);






    }
}
