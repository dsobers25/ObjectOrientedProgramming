package encapsulation;

// This class is encapsulating 3 instance variables sweetCandy, sourCandy, and chocolate
// and using public accessor and mutator methods called getter and setters to assign and
// return their values.

public class CandyStore {

    // create 3 private String variables
    private String sweetCandy;
    private String sourCandy;
    private String chocolate;

    // these are getter and setter methods to access the private instance variables
    // within the CandyStore class

    // returns the value for the variable sweetCandy
    public String getSweetCandy() {
        return sweetCandy;
    }

    // returns the value for the variable sourCandy
    public String getSourCandy() {
        return sourCandy;
    }

    // returns the value for the variable chocolate
    public String getChocolate() {
        return chocolate;
    }

    // assigns a value to the instance variable sweetCandy
    public void setSweetCandy(String str) {
        sweetCandy = str;
    }

    // assigns a value to the instance variable sourCandy
    public void setSourCandy(String str) {
        sourCandy = str;
    }

    // assigns a value to the instance variable chocolate
    public void setChocolate(String str) {
        chocolate = str;
    }

}// End of class
