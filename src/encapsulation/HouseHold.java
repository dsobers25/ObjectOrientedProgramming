package encapsulation;

public class HouseHold {

    // private instance variable to be returned
    private int kids;
    private int parents = 2;

    // when this method is called the kids variable is incremented by one
    public void newKid() {
        kids++;
    }

    // returns the kids variable
    public int getKids() {
        return kids;
    }

    // returns the parents variable
    public int getParents() {
        return parents;
    }


}// End of class
