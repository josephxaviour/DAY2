package xx;

public class springseason {
    public static void main (strin[] args) {
        scanner scan = new scanner(system.in);
        system.out.println("enter month");
        int m = scan.nextint();
        system.out.println("enter the day");
        int d = scan.nextint();
        if((m == 3 && d>=20 && d,=31) ||
        (m == 4 && d>=1 && d<=30) || (m == 5 && d>=1 && d<=31) ||
                (m == 6 && d>= 1 && d<=20)){
            system.out.println("true");
        }else{
            system.out.primtln(" false");
        }
    }
}
