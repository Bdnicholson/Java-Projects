/*File Proj03.java
The purpose of this assignment is to assess the student's
ability to write a program dealing with sequence, selection,
and loop.
**********************************************************/

// Student must not modify the code in this file. //

import java.util.Random;
import java.util.Date;

class Proj03 {

    public static void main(String[] args) { //define main
        int randomNumber = 0;
        //Create a random number generator
        Random generator = null;
        if (args.length != 0) {
            //User entered a command-line argument. Get it, 
            // convert it to a long integer, and use it as
            // the seed to create random number generator.
            // Each time the user runs the program with the
            // same command-line argument, the random number
            // generator will produce the same sequence of
            // random numbers.
            generator = new Random(Long.parseLong(args[0]));

        } else {
            //User did not enter a command-line argument.
            // The seed for the random number generator is
            // based on the date and time, which will be
            // different each time the program is run. Thus
            // the generator will produce a different 
            // sequence of random numbers each time the
            // program is run.
            generator = new Random(new Date().getTime());
            randomNumber = Math.abs((byte) generator.nextInt());

        };

        //Create an array object of type byte with 100
        // elements and populate it with random values 
        // of type byte.
        byte[] byteArray = new byte[100];
        generator.nextBytes(byteArray);
        if (args.length != 0) {
            randomNumber = byteArray.length;
        }
        //Print the last value in the array.
        System.out.println(randomNumber + "");
        System.out.println("Student output text begins here.");

        //Pass the byteArray's reference to a static method
        // named run belonging to the student's class named
        // Proj03Runner. Store the return value in the variable
        // named average of type double.
        double average = Proj03Runner.run(byteArray);
        System.out.println("Student output text ends on previous line");

        //Print the value stored in the variable named average.
        System.out.println("Average value = " + average);

    }//end main
}//end class Proj03
//End program specifications
