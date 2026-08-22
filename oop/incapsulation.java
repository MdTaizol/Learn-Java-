abstract class Animal{
  abstract public void walk();
  Animal(){
    System.out.println("you are draw animal");
  }
  public void eat(){
    System.out.println("Animal eats");
  }
}

class Horse extends Animal{
    Horse(){
        System.out.println("dram the horse");
    }
    public void walk(){
        System.out.println("walk on 4 legs");
    }

}
class chicken extends Animal{
    public void walk(){
        System.out.println("walk on 2 leg");
    }
}


public class incapsulation {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
        chicken chic = new chicken();
        chic.walk();
        Animal animal = new Horse();
        animal.walk();
    }
}
