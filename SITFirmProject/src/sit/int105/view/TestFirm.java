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
        Firm sitFirm = new Firm("SIT Company", allStaff);
        System.out.println(sitFirm);
    }

}
