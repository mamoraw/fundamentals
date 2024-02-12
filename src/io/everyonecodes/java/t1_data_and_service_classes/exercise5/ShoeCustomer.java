package io.everyonecodes.java.t1_data_and_service_classes.exercise5;

//Define the ShoeCustomer class that contains the shoe size property which it receives through the constructor.
//It also contains the tryShoe method which receives the shoe to try on. If the shoe size is the same as the shoe size property it returns true, otherwise false.
public class ShoeCustomer {
    private int shoeSize;

    public ShoeCustomer(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public boolean tryShoe(Shoe shoe) { // Checks if the sizes are matching. This method can't be static!
        return shoe.getSize() == shoeSize;
    }
}
