class  Student{
    //object name : 
    String name;
     int age ;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
      
    // non peramertar.

    Student() {
    }

//     Student(){
//         System.out.println("constructor called");
//     }

  //with perametar : 
   
//   Student(String name, int age){
//    this.name = name ;
//    this.age = age ; 

//   }
 
Student(Student s2){
    this.name = s2.name;
    this.age = s2.age;
}


 }

 


public class constructors {
    public static void main(String[] args) {
     
       Student stu = new Student();
       stu.name = "Taizol";
       stu.age = 23;

       Student s2 = new Student(stu);
        s2.printinfo();
       
    }
}
