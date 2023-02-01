    import java.util.*;
    
    public class switchcase {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt ();
        switch (number){
            case 1: System.out.println("left");
            break;
            case 2: System.out.println("right");
            break;
            case 3: System.out.println("front");
            break;
            case 4: System.out.println("back");
            break;
            case 5: System.out.println("up");
            break;
            case 6: System.out.println("down");
            break;
            default: System.out.println("stay where you are");
        }
    }
    
}
