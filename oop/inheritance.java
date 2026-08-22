import java.util.Scanner;

class Shape{
    String color;
    public void area(){
        System.out.println("display area");
    }
}
// single level inheritance: 
class triangle extends Shape{
    public void areas(int l, int h){
        System.out.println(1/2 * l * h);
    }

    // class EquilateralTriangle extends triangle{
    //     public void area(int l , int h){
    //         System.out.println(1/2 * l* h);
    //     }
    // }
  // hierarchial inheritance : 
    class circle extends Shape{
        public void area(int r){
            System.out.println(3.14*r*r);

        }
    }

    // hybird inheritance : 

    class retance extends circle{
        public void square(int m , int n){
            System.out.println( m* n);
        }
    }


}

public class inheritance {
    public static void main(String [] args){
       triangle s1 = new triangle();
        s1.color ="green"; 
        
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int h = sc.nextInt();
       s1.area();
    s1.areas(l, h);
    }
    
}
