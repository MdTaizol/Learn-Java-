class Student{
    String name;
    int age ;

    public void printinfo(String name){
        System.out.println(this.name);
    }
    public void printinfo(int age){
        System.out.println(this.age);
    }
    // public void printinfo(String name,int age){
    //     System.out.println(name + " " + age);
    // }
}


public class polymorphism {
  
    public static void main(String args []){
        Student s1 = new Student();
        s1.name = "Taizol";
        s1.age = 24;
        s1.printinfo(s1.age);
        // s1.printinfo(s1.name,s1.age);
    }
    
}
