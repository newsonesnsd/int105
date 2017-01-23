package company;
public class TestCompany {
    public static void main(String[] args) {
        Address a1 = new Address("111","Sipraya","Bangkok","10500");
        Address a2 = new Address("126","Ratchadapisak","Bangkok","10600");
        Address a3 = new Address("99","Silom","Bangkok","10500");
        Address a4 = new Address("99","Silom","Bangkok","10500");
        Address addr[] = new Address[]{a1,a2};
        
        Company c1 = new Company("KMUTT" ,addr); 
        System.out.println(c1);
        
        (c1.getCompAddr()[1])=a3;
        System.out.println(c1);
        System.out.println(a3.equals(a4));
        
//        Address a2 = new Address(126,"Ratchadapisak","Bankok","10600");
//        c1.setCompAddr(a2);
//        System.out.println(c1);
//        a2.setStreet("Ratchadapisak26");
//
//        (c1.getCompAddr()).setStreet("Ratchadapisak26");
//        System.out.println(c1);
//        
//        (c1.getCompAddr()).setZipCode("10110");
//        System.out.println(c1);
//        
        Company c2 = new Company("pizza", addr);
        System.out.println(c1.equals(c2));
        c1.replaceAddress(a1,a2);
        System.out.println();
//        
//       
    }
}
