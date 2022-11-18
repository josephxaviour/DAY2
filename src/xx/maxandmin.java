package xx;

public class maxandmin {
    public static void main (string[] args){
        scanner scan = new scanner(system.in);
        system.out.println("enter the value of b");
        int b = scan.nextint();
        system.out.println("enter the value of c");
        int c = scan.nextint();
        int[] arr = new int[4];
        arr[0] = a+b*c;
        arr[1] = c+a/b;
        arr[2] = a%b+c;
        arr[3] = a*b+c;
        int largest = arr[0];
        int smallest = arr[0];
        for(int i=0; i<arr.length;i++)
        {
            if(arr[1] > largest) {
                largest = arr[1];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];}

        }
    }system.out.println(" min value is " + smallest);
    system.out.println("max value is " + largest);
}
}

