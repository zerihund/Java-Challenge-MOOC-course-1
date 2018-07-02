
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment){
        if(this.squareMeters>otherApartment.squareMeters){
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment otherApartment){
        int appPtice = this.squareMeters*pricePerSquareMeter;
        int othPrice = otherApartment.squareMeters*otherApartment.pricePerSquareMeter;
        return Math.abs(appPtice-othPrice);
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment) {
        if(this.squareMeters*pricePerSquareMeter>otherApartment.squareMeters*otherApartment.pricePerSquareMeter){
            return true;
        }
        return false;
    }
}
