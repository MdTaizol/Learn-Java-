public class first{
    public static void main (String[] args){
     System.out.println("hello world");
    

     // its all are premitive type:
       int age = 30;
     //byte ( 0 to 127)
       byte age1 =  30;
       int phone = 343432;
        long phone1 = 02344234234L;
       float pi = 3.14F;
       char letter = '@';
       boolean isAdult = true;

    // Non premitive type:
      String name = "apu";
      String fn = new String("Islam");
      System.out.println(fn);
      System.out.println(name.length());

      //concatenet
      System.out.println(name + " and " + fn);

       //see the first character in the string use charAt(0 ) function: 
      System.out.println(name.charAt(0));

      // replace function use when cut one string half or some of word and use new word.but declared another variable.
       String name2 = name.replace('p','d');
       System.out.println(name2);

       // we can find substring long string find some specific string its cutting the string  the spceifice index are replay given:
       String name3 = "aman And akku";
       System.out.println(name3.substring( 5,7));

      //  



    }
}