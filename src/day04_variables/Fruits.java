package day04_variables;

public class Fruits {
    public static void main(String[]args){
        // create 3 variables called apple,grapes,bananas -->dataType is int
        int apples= 50;
        int grapes=100;
        int bananas=150;
        //lets print out "This is how many apples we have:"

        System.out.println ("This is how many apples we have: "+ apples);
        System.out.println("Grapes: " +grapes);
        System.out.println("Bananas: "+bananas);

        //We gave 20 apples to a friend
        apples = 30;
        System.out.println("Apples left: " +apples );

        //declare new variable called price and assign a value 20.0
       double price = 20.0;

       //Write statement: "The price for 100 grapes is $20.0"
        System.out.println("The price for " +grapes+ " grapes is $" +price);

    }

}
