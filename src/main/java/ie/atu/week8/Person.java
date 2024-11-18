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

    @Override
    public String toString() {
        return
                "name ='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone number='" + phoneNumber + '\''
                ;
    }
}

