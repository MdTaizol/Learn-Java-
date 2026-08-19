import java.util.Scanner;
public class MethodFunction {
    public static void printjava(){
        System.out.println("Hello java");
    }
    public static void printname(String name){
        System.out.println(name);
    }

     public static void printSum( int a, int b){
        int sum  = a + b;
        System.out.println(sum);
     }
    public static void main(String[] args) {
        printjava();
        printjava();
        printjava();
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printname(name);
        printname("Taizol");
        printname("islam");
        printSum(5,6);

    }
}
