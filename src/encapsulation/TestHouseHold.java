package encapsulation;

public class TestHouseHold {

    public static void main(String[] args){
        HouseHold house = new HouseHold();

        house.newKid();
//        house.newKid();
//        house.newKid();
//        house.newKid();

        if (house.getKids() <= 1) {
            System.out.println("There is " + house.getKids() + " kid in the house and " + house.getParents() + " parents in the household");

        } else {
            System.out.println("There are " + house.getKids() + " kids in the house and " + house.getParents() + " parents in the household");
        }


    }
}
