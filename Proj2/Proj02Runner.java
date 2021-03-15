/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author pc
 */
public class Proj02Runner {

static int run(int valIn){
    //Print a required certification on the
    // command-line screen.
    System.out.println(
      "I certify that this program is my own work \n"+
      "and is not the work of others. I agree not \n" +
      "to share my solution with others.\n" +
      "Bo Nicholson\n");

    int myVar = valIn;
    System.out.println(myVar);
    myVar = ++myVar;
    return myVar;
  }//end run

}//end class Proj02Runner
