package snackBar;

public class Main
{
    public static void snackData() 
    {
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());
        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());



        
        // Jane buys 3 Sodas. Print Customer 1 Cash on hand. Print quantity of Soda.
        System.out.println("*** Data Processing ***");
        System.out.println("Jane has $" + jane.getCash() + ", and buys 3 Soda's for $" + soda.getCost() + " each");
        jane.buySnack(3, soda);
        System.out.println("Jane has $" + jane.getCash() + " left.");
        System.out.println("And there are " + soda.getQuantity() + " " + soda.getName() + "'s" + " left.");
        System.out.println("-----------------------------------------------------------------------");
        
        
        
        // Jane buys 1 Pretzels. Print Customer 1 Cash on hand. Print quantity of Pretzel.
        System.out.println("Jane has $" + jane.getCash() + ", and buys 1 pretzel that cost her $" + pretzel.getCost());
        jane.buySnack(1, pretzel);
        System.out.println("Jane now has $" + jane.getCash() + " left.");
        System.out.println("And there are " + pretzel.getQuantity() + " " + pretzel.getName() + "'s" + " left.");
        System.out.println("-----------------------------------------------------------------------");
        
        
        
        
        // Bob buys 2 Sodas. Print Customer 2 Cash on Hand. Print quantity of Soda.
        System.out.println("Bob has $" + bob.getCash() + ", and buys 2 Soda's for $" + soda.getCost() + " each");
        bob.buySnack(2, soda);
        System.out.println("Bob has $" + bob.getCash() + " left.");
        System.out.println("And there are " + soda.getQuantity() + " " + soda.getName() + "'s" + " left.");
        System.out.println("-----------------------------------------------------------------------");
        
        
        
        
        // Jane finds $10. Print Customer 1 Cash on Hand.
        System.out.println("Jane has found $10.00");
        jane.addCash(10.00);
        System.out.println("Now Jane has $" + jane.getCash() + " left.");
        System.out.println("-----------------------------------------------------------------------");
        
        
        
        
        // Jane buys 1 Chocolate Bar. Print Customer 1 Cash on Hand. Print quantity of Chocolate Bar.
        System.out.println("Jane has $" + jane.getCash() + ", and buys 1 Chocolate Bar that cost her $" + chocolateBar.getCost());
        jane.buySnack(1, chocolateBar);
        System.out.println("Jane now has $" + jane.getCash() + " left.");
        System.out.println("And there are " + chocolateBar.getQuantity() + " " + chocolateBar.getName() + "'s" + " left.");
        System.out.println("-----------------------------------------------------------------------");
        
        
        
        
        
        // Add 12 more Pretzels. Print quantity of Pretzels.
        System.out.println("Vending Service's of America has added 12 more pretzel's to the Food vending machine");
        pretzel.addQuantity(12);
        System.out.println("Now there are " + pretzel.getQuantity() + " " + pretzel.getName() + "'s" + " left.");
        System.out.println("-----------------------------------------------------------------------");
        
        
        
        
        
        // Bob buys 3 Pretzels. Print Customer 2 Cash on hand. Print quantity of Pretzels.
        System.out.println("Bob has $" + bob.getCash() + ", and buys 3 pretzel's for $" + pretzel.getCost() + " each");
        bob.buySnack(3, pretzel);
        System.out.println("Now Bob has $" + bob.getCash() + " left.");
        System.out.println("And there are " + pretzel.getQuantity() + " " + pretzel.getName() + "s" + " left.");
        System.out.println("-----------------------------------------------------------------------");
    }
    
    public static void main(String[] args) 
    {
        snackData();
    }
}