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
public class HourlyStaff extends PayStaff {
    private double workHours;
    public HourlyStaff() {
    }

    public HourlyStaff(double workHours, double payRate, String name, String surname) {
        super(payRate, name, surname);
        this.workHours = workHours;
    }
    
    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    @Override
    public String toString() {
        return super.toString() + ", workHours=" + workHours + '}';
    }
    
    public double pay() {
        return getPayRate()*workHours;
    }
}
