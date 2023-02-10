public class ShipCostCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the price of the item: $50"); //Asking the user to enter item price
        double shippingCost;
        double price = 50;

        if (price < 100) {
            shippingCost = price * 0.02; //calculating shippingCost
            System.out.println("Shipping cost: $" + shippingCost);// outputs shippingCost
            System.out.println("Total price: $" + (price + shippingCost));// outputs total price with the shipping cost
        } else {
            shippingCost = 0 ;// Shipping cost is 0
            System.out.println("Shipping cost is 0"); // shipping cost is free as item price is above $100
            System.out.println("Total price: $" + price);// outputs total price
        }
    }
}
