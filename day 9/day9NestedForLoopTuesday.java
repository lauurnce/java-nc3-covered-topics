
package com.joysistvi.looping.forloop;

public class NestedForLoopTuesday {
    public static void main(String[] args) {
//        syntax: 
//    for (initialization; termination; increment) {  
//           // Outer loop block  
//        for (initialization; termination; increment) {  
//           // Inner loop block  
//    }  
//}  

//      for (int i = 1; i <= 5; i++) {  
//            for (int j = 1; j <= i; j++) {    //inner loop
//                System.out.print(j);     //2nd body 
//            }
//            System.out.println("");
//        } 
//      
      
        for (int i = 1; i <= 5; i++) {  
            for (int j = 1; j <= i; j++) {    //inner loop
                System.out.print("*");     //2nd body 
            }
            System.out.println(" ");
        } 
    }
    
    /* 
    Grading System 
    student1 
    i -> subjects
    j -> grades
    */
  /*
     For Each Loop -> enhance For Loop
   
  */
}
