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
public class NonMemberCustomer extends Customer {
    private double discountRate = 0.1;
    public NonMemberCustomer() {

    }

    public NonMemberCustomer(String name, String surname, Address addr) {
        super(name, surname, addr);
    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double redeemPoint2Cash(int usePoint) {
        System.out.println("You are not Membership, you have no point");
        return 0;
    }

    @Override
    public void addPointFromPrice(double netTotalPrice) {
        System.out.println("You are not Membership, you have no point");
    }

    @Override
    public String toString() {
        return super.toString() + "\nNonMemberCustomer{" + "discountRate=" + discountRate + '}';
    }
    
    

}
