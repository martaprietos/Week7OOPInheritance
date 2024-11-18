package ie.atu.week8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scan.nextLine(); //assign next line to name

        System.out.println("Please enter your address");
        String address = scan.nextLine(); //assign next line to address

        System.out.println("Please enter your phone number");
        String phoneNum = scan.nextLine(); //assign next line to phone number

        System.out.println("Please enter your cutomer number");
        String custNumb = scan.nextLine(); //assign next line to customer number

        System.out.println("would you like to be on the mailing List? True/False");
        Boolean mailList = scan.hasNextBoolean(); //assign next line to answer

        Customer newCust = new Customer(name, address, phoneNum, custNumb, mailList);
        System.out.println("you entered " + newCust.toString());
    }
}
