

package com.training.org;

public class ABCBank {
    private String bankName;
    private String bankAddress;
    private int noOfEmployees;

    public ABCBank(){
        System.out.println("Default constructor of XYZBank is called");
        bankName="";
        bankAddress="";
        noOfEmployees=0;
    }

    public ABCBank(String bankName, String bankAddress, int noOfEmployees) {
        System.out.println("Parameterised constructor of XYZBank is called");
        this.bankName = bankName;
        this.bankAddress = bankAddress;
        this.noOfEmployees = noOfEmployees;
    }

    public String toString(){
        return "Bank Details are "+bankName+" Address "+bankAddress+" NoOfEmployees"+noOfEmployees;
    }
}
