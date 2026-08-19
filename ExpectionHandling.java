public class ExpectionHandling{
    public static void main(String[] args) {
        int marks [] = {98,96,95};
        try{
            System.out.println(marks[5]);
        }catch(Exception exception){
           //do something after catching.
        }
         System.out.println("This is aman");
    }
}
