package xx;

public class quadratic {
    public static void main (string[] args) {
        scanner scan = new scanner (system.in);
        system.out.println("enter the value of a");
        double a = scan.nextdouble();
        system.out.println("enter the value of b");
        double b = scan.nextdouble();
        system.out.println("value of c ");
        double c = scan.nextdouble();
        double delta = b*b - 4*a*c;
        double sqrt = math.sqrt(delta);
        if(sqrt>=0.0){
            double result1 = (-b + delta) / (2*a);
            double result2 = (-b - delta) / (2*a);
            system.out.println("the possible values of x are");
            system.out.println("result1");
            system.out.println(result2);

        }else {
            system.out.println("square roots are not equal");
        }
    }
}
