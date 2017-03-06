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
public abstract class Customer implements Comparable<Customer> {
    private String name;
    private String surname;
    private Address addr;

    public Customer() {

    }

    public int compareTo(Customer o) {
        if (name.equals(o.name)) {
            return surname.compareTo(o.surname);
        }
        else {
            return name.compareTo(o.name);
        }
    }

    public Customer(String name, String surname, Address addr) {
        this.name = name;
        this.surname = surname;
        this.addr = addr;
    }
    
    

    public abstract double getDiscountRate();
    public abstract void setDiscountRate(double DiscountRate);
    public abstract double redeemPoint2Cash(int usePoint);
    public abstract void addPointFromPrice(double netTotalPrice);

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", surname=" + surname + ", addr=" + addr + '}';
    }

}
