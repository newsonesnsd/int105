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
public class Firm implements Report {
    private String firmName;
    private Staff[] staffs;
    public String logo;
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

       String result = firmName + getHeader() + "\n";
       for(int i=0;i<staffs.length;i++){
           result+=staffs[i]+"\n";
       }
       return result;
    }

    public double payMonthlyAll(){
        double totalPay = 0;
        for(int i=0;i<staffs.length;i++) {
            totalPay+=staffs[i].pay();
        }
        return totalPay;
    }

    @Override
    public String getHeader(){
        return logo;
    }

    @Override
    public void setHeader(String header){
        logo = header;
    }

    public void sortByName() {
        int minIndex=0;
        Staff tmp;
        for (int i = 0;i<staffs.length;i++) {
            minIndex=i;
            for (int j=1;j<staffs.length;j++) {
                if(staffs[j].compareTo(staffs[minIndex])<0)
                    minIndex=j;
            }
            System.out.println("min Staff = " + staffs[minIndex]);
            tmp = staffs[i];
            staffs[i]=staffs[minIndex];
            staffs[minIndex]=tmp;
        }
    }
}
