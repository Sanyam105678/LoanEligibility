package com.company;

public class temporaryEmployee extends Employee{

    private int hoursWorked;
    private int hoursWages;

    public temporaryEmployee(String employeeName, int hoursWorked, int hoursWages) {
        super(0, employeeName);
        this.setHoursWorked(hoursWorked);
        this.setHoursWages(hoursWages);
    }

    @Override
    void calculateSalary() {

        this.setSalary(this.getHoursWages()*this.getHoursWorked());



    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWages() {
        return hoursWages;
    }

    public void setHoursWages(int hoursWages) {
        this.hoursWages = hoursWages;
    }
}
