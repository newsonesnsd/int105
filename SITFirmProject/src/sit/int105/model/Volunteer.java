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
public class Volunteer extends Staff {
    private String staffId;
    private String EmergencyContactName;


    @Override
    public double pay(){
        return 0;
    }

    public Volunteer() {

    }

    public Volunteer(String EmergencyContactName, String name, String surname) {
        super(name, surname);
        staffId = "Vol-"+getSeqNo();
        this.EmergencyContactName = EmergencyContactName;
    }

    @Override
    public String toString() {
        return  "staffId=" + staffId + ", name= " + getName() + ", Emergency Contact Name=" + EmergencyContactName;
    }




}
