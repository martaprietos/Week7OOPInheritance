package ie.atu.week8;

public class Main2 {
    public static void main(String[] args) {

        PreferredCustomer preferredCustomer2 = new PreferredCustomer();
        preferredCustomer2.setName("Paul");
        preferredCustomer2.setAddress("ATU");
        preferredCustomer2.setPhoneNumber("091 775678");
        preferredCustomer2.setCustNumber("1002");
        preferredCustomer2.setMailingList(false);
        preferredCustomer2.setDiscountLevel(0);
        preferredCustomer2.addLoyaltyPoints(700); // Accumulate points
        System.out.println(preferredCustomer2);
        preferredCustomer2.addLoyaltyPoints(800); // Accumulate more points
        System.out.println(preferredCustomer2);

    }
}
