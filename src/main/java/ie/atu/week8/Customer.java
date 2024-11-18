package ie.atu.week8;

public class Customer extends Person{//Person class with additional information
    private String custNumber;
    private boolean mailingList;

    public Customer() {
        this.custNumber = null;
        this.mailingList = false;
    }

    public Customer(String phoneNumber, String address, String name, String custNumber, boolean mailingList) {
        super(phoneNumber, address, name);//pass to parent to populate these values
        this.custNumber = custNumber;
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {//turn into printable string
        return super.toString() + //print person toString and then customer toString, concatenate both
                ", custNumber = '" + custNumber + '\'' +
                ", mailingList = " + mailingList ;
    }

    public String getCustNumber() {
        return custNumber;
    }

    public void setCustNumber(String custNumber) {
        this.custNumber = custNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }
}
