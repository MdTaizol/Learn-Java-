class Pen{

    String color;
    String type;

    public void printinfo(){
       System.out.println(this.color);
       System.out.println(this.type);
    }
    Pen(){

    }

    Pen( Pen s2){
        this.color = s2.color;
        this.type = s2.type;
    }

}


public class copyConstructor {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "green";
        p1.type = "ballpoint";

        Pen s2 = new Pen(p1);
        s2.printinfo();
    }
    
}
