import java.util.Scanner;
public class loops {
public static void main(String[] args) {
    // for(int i = 100; i>= 1; i--){ 
    // // for( int i = 0; i<=100; i++){
    //     System.out.println(i);
    // }

//  while loop:

// int j = 100;
//  while(j>=1) {
//     System.out.println(j);
//     j--;
//  }

// do while loop : 

// int k = 100;
// do{
//     System.out.println(k);
//     k = k-1;
// }
// while(k>=1);
// }  

// using do while loop only positive number when enter the neagtive number out the programe :


// int num = 0;
// do{
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the number : ");
//      num = sc.nextInt();
//      System.out.print("Pay fast then out : ");
//      System.out.println(num);
//    } while(num>=0 );

//    System.out.println("The End ");
   int i= 0;

   while(true){
    if(i ==3){ 
      i += 1;
     continue;
    }
       System.out.println(i);
       i = i +1;
       if(i>5){
        break;
       }
   }
}
}
