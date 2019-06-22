package encapsulation;

public class HouseHold {
    private int kids;
    private int parents = 2;

    public void newKid() {
        kids++;
    }

    public int getKids() {
        return kids;
    }

    public int getParents() {
        return parents;
    }


}
