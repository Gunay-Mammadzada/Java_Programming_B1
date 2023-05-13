package day25_methods;

public class CurrencyConverter {
    public static double currency (String currencyType, double currencyAmount){

        switch (currencyType){
            case "euro":
                return  currencyAmount * 0.91;

            case "yen":
                return currencyAmount *121.03;
            case "lira":
                return currencyAmount * 14.85;
            case "won":
                return currencyAmount* 1_217.52;
            case "rupee":
                return currencyAmount * 181.45;
            default:
                System.out.println("Not valid currency");
                return 0.0;




        }
    }

    public static void main(String[] args) {
        System.out.println("You converted currency: " +currency("Euro" ,500));
        System.out.println("You converted currency: " +currency("YEN" ,500));
    }


}
