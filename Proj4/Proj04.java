/*File Proj04.java
The purpose of this assignment is to assess the student's
ability to write a program dealing with the String and
StringBuffer classes.
**********************************************************/

// Student must not modify the code in this file. //


import java.util.Random;
import java.util.Date;
class Proj04{
  public static void main(String[] args){ //define main
    //Create a pseudo-random number generator
    Random generator = null;
    if(args.length != 0){
      generator = new Random(Long.parseLong(args[0]));
    }else{
      generator = new Random(new Date().getTime());
    };
    
    //Get a random number of type int. Cast it down to
    // type byte simply to reduce the maximum value.
    // Store it in a variable named val of type byte.
    byte val = (byte)(generator.nextInt());

    
    //Create a String object and display it. Use 
    // string concatenation to convert the value to
    // a String and concatenate it to the characters
    // shown in the quotation marks.
    String stringVal = "Random byte value = " + val;
    System.out.println(stringVal);

    //Pass the String object to the student's method
    // named run and save the returned value in a
    // variable named result of type StringBuffer.
    StringBuffer result = Proj04Runner.run(stringVal);

    //Display the value returned from the student's code.
    // Note that it must include a period followed by
    // a space and the student's name.
    System.out.println("The next line must contain two period characters.");
    System.out.println(result);

  }//end main
}//end class Proj04
//End program specifications