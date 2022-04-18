package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Loan obj1 = Loan.getInstance();


        System.out.println(obj1.calculateLoanAmount(new permanentEmployee(001,"Ram",240000)));
        System.out.println(obj1.calculateLoanAmount(new temporaryEmployee("Ramesh",8,10000)));
        System.out.println(obj1.calculateLoanAmount(null));


    }
}
