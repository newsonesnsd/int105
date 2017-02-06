/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int105.model;

/**
 *
 * @author INT105
 */
public class PayStaff extends Staff{
    private double payRate;

    public PayStaff(double payRate) {
        this.payRate = payRate;
    }
    public PayStaff() {

    }

    public PayStaff(double payRate, String name, String surname) {
        super(name, surname);
        this.payRate = payRate;
    }

    public double pay(){
        return payRate;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    @Override
    public String toString() {
        return super.toString() + ", payRate=" + payRate;
    }

}
