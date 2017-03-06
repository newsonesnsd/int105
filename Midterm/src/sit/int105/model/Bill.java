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
public class Bill {
    private static long runningId=1000000L;
    private long billId;
    private Customer cust;
    private double totalPay;

    public Bill() {
        this(null, 0);
    }

    public Bill(Customer cust, double totalPay) {
        this.billId = runningId++;
        this.cust = cust;
        this.totalPay = totalPay;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }


    public void redeem(int usePoints){
        totalPay = totalPay-cust.getDiscountRate()*totalPay-cust.redeemPoint2Cash(usePoints);
    }
    public void redeem(){
        totalPay = totalPay-cust.getDiscountRate()*totalPay;
    }

    @Override
    public String toString() {
        return "Bill{" + "bllId=" + billId + ", cust=" + cust + ", totalPay=" + totalPay + '}';
    }












}
