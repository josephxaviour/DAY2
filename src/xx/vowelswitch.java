package xx;

public class vowelswitch {
    public static void main(string[] args) {
        scanner scan = new scanner(system.in);
        system.out.println("enter a character");
        string str = scan.nextline();

        switch (str){
            case "a":
                system.out.println("it is vowel");
                break;
            case "e":
                system.out.println("it is vowel");
                break;
            case "i":
                system.out.println("it is vowel");
                break;
            case "o":
                system.out.println("it is vowel");
                break;
            case "u":
                system.out.println("it is vowel");
                break;
            default:
                system.out.println("it is a constant");
        }
    }
}
