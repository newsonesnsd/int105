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
public class MemberCustomer extends Customer {
    private double totalPoint;
    private double discountRate = 0.2;
    //private double cash;

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
        double cashVoucher = 0;
        if (totalPoint >= 800 && usePoint <= totalPoint) {
            if (usePoint % 800 == 0) {
                cashVoucher = (usePoint/800) * 100;
                totalPoint -= usePoint;
            }
            else {
                cashVoucher = (usePoint/800)*100;
                totalPoint = (totalPoint - usePoint) + (usePoint % 800);
            }
        }
        else {
            System.out.println("You don't have enough point");
        }
        return cashVoucher;
    }

    @Override
    public void addPointFromPrice(double netTotalPrice) {
        totalPoint = totalPoint+((int) netTotalPrice/25);
    }

    @Override
    public String toString() {
        return super.toString() + "\nMemberCustomer{" + "totalPoint=" + totalPoint + ", discountRate=" + discountRate + '}';
    }



}
