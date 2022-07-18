package tddClass;

public class FuelDiscount {

    private String location;
    //private boolean isThereFuel;
    private double actualPrice;
    private double discountedAmount;
    private double litresPurchased;
    private final double discount = 0.02;


    public FuelDiscount(String location) {
        this.location = location;
        this.actualPrice = 200.0;
    }


    public void setLitresPurchased(double litresPurchased){
        this.litresPurchased = litresPurchased;
    }

    private double discountInPrice(){
        this.discountedAmount = (actualPrice * litresPurchased) * discount;
        return discountedAmount;
    }

    public double getDiscountInPrice(){
        return discountInPrice();
    }

    public double getTotalPrice(){
        return (actualPrice * litresPurchased) - discountInPrice();
    }
}
