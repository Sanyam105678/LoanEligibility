package com.company;

public class Loan {

    static Loan instance = null;

    private Loan(){

    }

    static public Loan getInstance()
    {
        if (instance == null)
            instance = new Loan();

        return instance;
    }

    public double calculateLoanAmount(Employee employeeObj){
        if (employeeObj instanceof permanentEmployee){
            employeeObj.calculateSalary();
           return  0.15*employeeObj.getSalary();
        }

        else if(employeeObj instanceof temporaryEmployee){
            employeeObj.calculateSalary();
             return 0.1*employeeObj.getSalary();
        }
        else{
           return 0;
        }

    }
}
