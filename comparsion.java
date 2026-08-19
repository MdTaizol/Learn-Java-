// import java.util.Scanner;
// public class comparsion {

// public static void main(String[] args) {
//     // boolean is = false;
//     //    if(is == true)
//     //     System.out.println("Day");
//     // else
//     //     System.out.println("Night");

//     Scanner sc = new Scanner(System.in);
//     int age = sc.nextInt();
//     int age1 = sc.nextInt();


//     //  if( age <= 40 && age1<= 40)
//     // if (age > age1)
//    if ( age >= 18 || age1 >= 19)
//         System.out.println("your are elight for voting");
//     else
//         System.out.println("your are not elight for voting ");
// }

// }


// if else if else neseted : 
import java.util.Scanner;
public class comparsion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the votion year : ");
        int age = sc.nextInt();
        if(age > 18){
            System.out.println("fully eligable");
        }
        else if( age == 18 ){
            System.out.println("new voter");
        }
        else{
            System.out.println("your are not eligable.");
        }
    }
}