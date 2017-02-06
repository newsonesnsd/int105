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
public class Firm {
    private String firmName;
    private Staff[] staffs;

    public Firm() {

    }

    public Firm(String firmName, Staff[] staffs) {
        this.firmName = firmName;
        this.staffs = staffs;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public Staff[] getStaffs() {
        return staffs;
    }

    public void setStaffs(Staff[] staffs) {
        this.staffs = staffs;
    }

    @Override
    public String toString() {
       String result=firmName+"\n";
       for(int i=0;i<staffs.length;i++){
           result+=staffs[i]+"\n";
       }
       return result;
    }

    public double payMonthlyAll(){
        return 0;
    }

}
