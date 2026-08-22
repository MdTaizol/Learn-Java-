class Student{
    String name;
    static String school ;
  public void info(){
   
    System.out.println(this.name);
  }
  public static void changeschool(){
    school = "scholars";
  }
}


public class statics {
    public static void main(String[] args) {
        Student.school = "ius";
        Student stu = new Student();
        stu.name = "tony";
        stu.info();

       System.out.println(Student.school);
    }
}
