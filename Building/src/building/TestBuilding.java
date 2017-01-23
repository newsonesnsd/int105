package building;
public class TestBuilding {
     public static void main(String[] args) {
        Building b1 = new Building("Information Technology",3);
        
        Building b2 = new Building("Information Technology",3);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1.equals(b2));
    }
}
