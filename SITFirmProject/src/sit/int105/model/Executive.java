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
public class Executive extends PayStaff {
    private double bonus;

    public Executive(){

    }

    public Executive(double bonus, double payRate, String name, String surname) {
        super(payRate, name, surname);
        this.bonus = bonus;
    }


    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double pay(){
        return super.pay()+bonus;
    }
    @Override
    public String toString() {
        return super.toString()+ ", bonus=" + bonus;
    }


}
