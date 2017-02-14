/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int105.view;

import sit.int105.model.*;

/**
 *
 * @author INT105
 */
public class TestFirm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Staff[] allStaff = new Staff[4];
       allStaff[0] = new Volunteer("John", "Umaporn", "Sup");
       allStaff[1] = new PayStaff(50000, "Susan", "Mayer");
       allStaff[2] = new HourlyStaff(160, 50, "Ann", "Tonjung");
       allStaff[3] = new Executive(100000, 250000, "Somchai", "Rakdee");
       Firm sitFirm = new Firm("SIT Company\n", allStaff);
       // System.out.println(sitFirm);
       // System.out.println(sitFirm.payMonthlyAll());
       String lg = "******************\nSIT project report\n******************";
       sitFirm.setHeader(lg);
       sitFirm.sortByName();
       System.out.println(sitFirm);
       System.out.println(sitFirm.payMonthlyAll());
        // Volunteer v1 = new Volunteer("John", "Umaporn", "Sup");
        // Volunteer v2 = new Volunteer("Jame", "Umaporn", "Sup");
        // System.out.println("v1 = " + v1);
        // System.out.println("v2 = " + v2);
        // System.out.println(v1.compareTo(v2));
        // if (v1.compareTo(v2) == 0) {
        //     System.out.println("equals");
        // }
        // else if (v1.compareTo(v2) < 0 ) {
        //     System.out.println("v1 < v2");
        // }
        // else {
        //     System.out.println("v1 > v2");
        // }
    }

}
