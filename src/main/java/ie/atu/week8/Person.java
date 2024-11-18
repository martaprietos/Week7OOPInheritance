package ie.atu.week8;

public class Person { //class has uppercase letter, object has lowercase letter
    private String phoneNumber;
    private String address;
    private String name;

    public Person() {//default constructor
        this.phoneNumber = null;
        this.address = null;
        this.name = null;
    }

    public Person(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "name = '" + name + '\'' +
                ", address = '" + address + '\'' +
                ", phone number = '" + phoneNumber + '\''
                ;
    }
}

