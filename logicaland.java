public class logicaland {
    public static void main(String args[]){
       System.out.println( (3>2) && (5>3));//both the condition is true 
       System.out.println( (3<2) && (5>3));//first condition is false and second condition is true
       System.out.println( (3>2) && (5<3));//first condition is false and the second one is true
       System.out.println( (3<2) && (5<3));//both the conditions are false

    }
    
}
