package com.company;

public class permanentEmployee extends Employee {

    private double basicPay;

    public permanentEmployee(int employeeId, String employeeName,double basicPay) {
        super(employeeId, employeeName);
        this.basicPay=basicPay;

    }

    @Override
    void calculateSalary() {

        double pf = this.getBasicPay()*0.12;
        this.setSalary(this.getBasicPay() - pf);

    }


    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }
}
