package xx;

public class distance {
    public static void main(string[] args) {
        scanner scan = new scanner( system.in);
        system.out.println("enter the distance along x axis");
        int x = scan.nextint();
        system.out.println("enter the distance along y axis");
        it y = scan.nextint();
        int z= x*x + y*y;
        double distance = math.sqrt(z);
        system.out.println(distance);
    }
}
