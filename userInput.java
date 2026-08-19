import java.util.Scanner;
public class userInput {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Input Your Age : ");
        // int age = sc.nextInt();
        // System.out.println(age);

        // Scanner ag = new Scanner(System.in);
        // System.out.println("Enter the float number : ");
        // float pi = ag.nextFloat();
        // System.out.println(pi);
        
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter the string vlaue : ");
        String str = s2.nextLine();
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the string vlaue : ");
        String std = s1.nextLine();
        System.out.println(str + std);
    }
}
