/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/* File Proj03Runner
This is skeleton code for Proj03. It will compile and
run, but it won't meet the assignment specifications.
*****************************************************/
class Proj03Runner {

    static double run(byte[] byteArray) {
        //Print a required certification on the
        // command-line screen.
        System.out.println(
                "I certify that this program is my own work \n"
                + "and is not the work of others. I agree not \n"
                + "to share my solution with others.\n"
                + "Bo Nicholson\n");

        //Insert code to get and display the length of the array
        int size = byteArray.length;
        System.out.println("Array length " + size);

        //Insert code to get and display the value in the
        // last element in the array.
        double lastElement = byteArray[size - 1];
        System.out.println("Value in last element = " + lastElement);
        //Insert code to determine and display whether the
        // last element in the array is odd or even.
        if (lastElement % 2 == 0) {

            System.out.println("The value in the last element is Even");

        } else {
            System.out.println("The value in the last element is Odd");
        }

        size = size - 1;
        System.out.println("Begin loop at index 0");
        System.out.println("End loop at index " + size);

        double sum = 0;
        //calculating the sum of all the number stored in byteArray
        for (byte b : byteArray) {
            sum = sum + b;
        }
        //Printing out the sum on the console
        System.out.println("The sum is " + sum);

        //calculationg avg here
        double avg = 0.0;
        avg = (sum / 100);
        System.out.println("The average is " + avg);

        return avg;

    }//end run method

}//end class Proj03Runner
