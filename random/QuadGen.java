package random;
import java.util.*;
import java.io.*;
@SuppressWarnings("unused")

public class QuadGen {

    int a;
    int b;
    int c;
    int vertex = -b/(2*a);

    public static int plug(int a, int b, int c, int x) {
        return a*x*x + b*x + c;
    }

   //create an instance of an object of a quadratic equation
    public QuadGen(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int genKey = sc.nextInt();
        int a = r
    }
    
}
