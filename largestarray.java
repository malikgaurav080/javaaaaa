import java.util.*;
public class largestarray {
    public static int largest(int numbers[]){
        int largest = Integer.MIN_VALUE;
for(int i = 0;i<numbers.length;i++){
    if(largest < numbers[i]){
        largest = numbers[i];
    }
}
     return largest;
    }
 public static void main(String args[]){
    int numbers[] = {1,2,4,6,8,3,5};
   System.out.println("largest value is"+largest(numbers));
   
    }
    
    
}
