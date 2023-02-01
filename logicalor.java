import java.util.*;
public class logicalor {
    public static void main(String args[]){
        System.out.println( (3>2) || (5>3));//both the conditions are true
        System.out.println( (3>2) || (5>8));//first condition is true and the second one is false
        System.out.println( (3>5) || (5>3));//first condition isfalse and the second one is true///
        System.out.println( (3>5) || (5>8));//both the conditions are false

    }
    
}
