package com.ewitowski;

public class Employee {

    private String firstName;
    private String lastName;
    private int empShift;
    private String empIdNumber;


    public Employee(String firstName, String lastName, int empShift, String empIdNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.empShift = empShift;
        this.empIdNumber = empIdNumber;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEmpShift() {
        return empShift;
    }

    public void setEmpShift(int empShift) {
        this.empShift = empShift;
    }

    public String getEmpIdNumber() {
        return empIdNumber;
    }

    public void setempIdNumber(String empIdNumber) {
        this.empIdNumber = empIdNumber;
    }

public void printAll() {
        System.out.println("First Name: "+ firstName + "\n" + "LastName: " + lastName + "\n" + "Employee Shift #: " + empShift + "\n" + "Employee Id  #: " + empIdNumber);
}

    }



