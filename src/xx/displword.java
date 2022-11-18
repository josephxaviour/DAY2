package xx;

public class displword {
    public class words {
    public static void main(string[] args)
    {
        int p = integer.valueof(args[0]);
        if (p == 1) {
            system.out.println("unit");
        } else if (p == 10) {
            system.out.println("ten");
        }else if (p == 100) {
            system.out.println("hunderd");
        }else if (p ==1000) {
            system.out.println("thousand");
        }else{
            system.out.println("invalid")
        }
    }
}
}
