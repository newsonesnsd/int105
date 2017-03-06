package sit.int105.view;

import sit.int105.model.*;
/**
 *
 * @author Jirapong Rungsawang
 */
public class billSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Address a1 = new Address("111", "Bangkok");
        Address a2 = new Address("112", "Bangkok");
        System.out.println(a1.equals(a2));
        Customer c1 = new MemberCustomer("K", "F", a1);
        c1.addPointFromPrice(80000)
        Customer c2 = new NonMemberCustomer("Somsak", "Jeam", a2);

    }

}
