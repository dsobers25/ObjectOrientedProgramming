package encapsulation;

public class TestHouseHold {

    public static void main(String[] args){

        // Created an object named house from the HouseHold class
        HouseHold house = new HouseHold();

        // any time a the newkid method is called this kids instance variable is incremented by one
        house.newKid();
        house.newKid();
        house.newKid();
        house.newKid();

        // if the kids instance variable is less than or equal to 1 then the prompt is singular
        if (house.getKids() <= 1) {
            System.out.println("There is " + house.getKids() + " kid in the house and " + house.getParents() + " parents in the household");

            // else the prompt is plural
        } else {
            System.out.println("There are " + house.getKids() + " kids in the house and " + house.getParents() + " parents in the household");
        }


    }// End of main method
}// End of class
