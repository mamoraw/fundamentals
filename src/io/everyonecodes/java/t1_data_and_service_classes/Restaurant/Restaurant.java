package io.everyonecodes.java.t1_data_and_service_classes.Restaurant;

public class Restaurant {

    public void host() {
        Dish dish = Waiter.getOrder();
        Dish food = Chef.prepareFood(dish);

        if (Costumer.wantsToPay()) {
            System.out.printf("That will be %d$%n", food.getPrice());
            int moneyHanded = Costumer.pay(food);
            System.out.printf("Here is %d$%n", moneyHanded);
            int returnMoney = (int) Math.round(Waiter.calculateCash(moneyHanded, food));
            System.out.printf("Thanks a lot, you get %d$ back. Have a nice evening.%n", returnMoney);
            Waiter.cleanTable();
        } else {
            System.out.println("I will come later.");
        }
    }
}
