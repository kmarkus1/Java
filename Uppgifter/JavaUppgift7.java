
public class JavaUppgift7 {

    
    public static void main(String args[]) {
       //numbers array
        int[] Numbers = {10, 20, 30, 40, 50};
        //prints all numbers in "Numbers"
        for(int i : Numbers){
           System.out.println(i);
       }
        
       //Finds first number
         int firstNum = Numbers[0];
         //Finds last number
        int lastNum = Numbers[Numbers.length-1];
        System.out.println(firstNum);
        System.out.println(lastNum);
        
        // sums all numbers in array
        int sum = 0;
        for(int i : Numbers){
            sum += i;
        }
        System.out.println(sum);
        
        //Finds largest number in array
       int max = Integer.MIN_VALUE;
        for(int i : Numbers)
        if(max < i)
        max = i;
        System.out.println(max);
    
    }
    
    
}
