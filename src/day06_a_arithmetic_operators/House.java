package day06_a_arithmetic_operators;

public class House {
    /*
    Create a class House
    create a main method
    - Each the datatype you feel is most appropriate for each variable.
    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),
    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3
     */
    public static void main ( String[]args){

        String houseType =" garden";
        byte numberOfBedrooms = 5;
        byte numberOfBathrooms = 2;
        byte numberOfKitchens = 1;
        boolean isThereABasement= true;
        boolean isThereAnAttic= false ;
        boolean isThereAPool = false;
        boolean  isTheHouseForSale= false;
        double costOfTheHouse= 380.000;
        String address = "13000 marvel pl";
         int zipCode = 28383;
         boolean isAParkNearBy= true;
         double schoolRating = 4.8 ;

        String houseInfo = "The " + houseType + " on " + address + ", " + zipCode + " costs $" + costOfTheHouse + "\nThe " + houseType + " has " + numberOfBedrooms + " bedroom, " + numberOfBathrooms + " bathrooms, " + numberOfKitchens + " kitchens" + "\nIt also includes a basement: " + isThereABasement + ", has an attic: " + isThereAnAttic + ", has a pool: " + isThereAPool + ", is on sale: " +  isTheHouseForSale + ", and has a park: " + isAParkNearBy + "\nThe schools in the area have a rating of " + schoolRating;








    }
}
