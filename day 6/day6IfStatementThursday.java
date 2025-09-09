
public class IfStatementThursday {
    
    public static void main(String[] args) {
        //String result = number % 2 == 0 ? "Even" : "Odd";
        
        //System.out.println(result);
        
        // if statement
        /* syntax: 
             if(condition) {
             statement 1; // it executes when condition is true.
        */
        int number = 50;
        
        String result = ""; 
        if(number % 2 == 0) {
           result = "Even";
        }
        System.out.println(result);
        
    }
}


