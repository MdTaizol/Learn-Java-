class pen{
    String color;
    String type;

    public static void writes(){
        System.out.println("understand the class & object");
    }

    public void peninfo(){
        System.out.println(this.color);
        System.out.println(this.type);
    }

}

class student{
    String name;
    int age ;
    double cgpa;

    public void stu(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.cgpa);
    }
}



public class Classobject{

    public static void main(String[] args) {
         pen.writes();
         pen pen1 = new pen();
         pen1.color = "green";
         pen1.type = "ballpoint";

         pen1.peninfo();

         pen pen2 = new pen();
         pen2.color = "black";
         pen2.type = "gel";
         pen2.peninfo();

         student stu1 = new student();
         stu1.name = "taizol";
         stu1.age = 23;
         stu1.cgpa = 3.70;

         stu1.stu();

    }
}