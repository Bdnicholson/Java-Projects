/*File Proj05.java
The purpose of this assignment is to assess the student's
ability to write a program dealing with constructors and
overridden methods.
***********************************************************/

// Student must not modify the code in this file. //

class Proj05{
  public static void main(String[] args){
    //Instantiate a new object of the student's class named
    // Proj05Runner. Store the object's reference in a
    // variable named obj of type Proj05.Note the 
    // difference in the type of the object and the type
    // of the variable (think inheritance).
    Proj05 obj = new Proj05Runner();
    System.out.println("\n========Required=======\n");
    System.out.println("Call the method named run.");
    
    //Call the instance method named run belonging to
    // the object whose reference is stored in the 
    // variable named obj.
    obj.run();
    
    //Instantiate a new object of the class named Proj05.
    // Store the object's reference in the variabler named
    // obj, overwriting the reference that was previously
    // stored there.
    obj = new Proj05();
    //Call the instance method named run belonging to
    // the object whose reference is stored in the 
    // variable named obj.
    obj.run();
  }//end main
  //----------------------------------------------------//
  void run(){
    System.out.println("Hello World");
  }//end run
}//end class Proj05
//End program specifications.