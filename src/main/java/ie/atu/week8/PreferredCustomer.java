package ie.atu.week8;

public class PreferredCustomer extends Customer{
    private int loyaltyPoints;
    private int discountLevel;

    public PreferredCustomer() {
        this.loyaltyPoints = 0;//set to 0 for default constructor
        this.discountLevel = 0;
    }

    public PreferredCustomer(String phoneNumber, String address, String name, String custNumber, boolean mailingList, int loyaltyPoints, int discountLevel) {
        super(phoneNumber, address, name, custNumber, mailingList);//populate from parent class
        this.loyaltyPoints = loyaltyPoints;
        this.discountLevel = discountLevel;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public int getDiscountLevel() {
        return discountLevel;
    }

    public void setDiscountLevel(int discountLevel) {
        this.discountLevel = discountLevel;
    }

    public void setDiscountLevel() {
       if(loyaltyPoints < 500){
           this.discountLevel = 0;
       } else if(loyaltyPoints >=500 && loyaltyPoints <=999){
           this.discountLevel = 5;
       } else if(loyaltyPoints >=1000 && loyaltyPoints <=1499){
           this.discountLevel = 6;
       } else if(loyaltyPoints >=1500 && loyaltyPoints <=1999){
           this.discountLevel = 7;
       } else{ //2000 or more
           this.discountLevel = 10;
        }
    }

    public void addLoyaltyPoints(int loyPoints) {
        this.loyaltyPoints += loyPoints;//add more points
        setDiscountLevel();//after adding points, set new discount level
    }

    @Override
    public String toString() {
        return super.toString()+ //include parent toString method
                ", loyalty points = " + loyaltyPoints +
                ", discount level = " + discountLevel + "%";
    }
}

