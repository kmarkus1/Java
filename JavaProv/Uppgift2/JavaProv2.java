package JavaProv.Uppgift2;

import java.util.ArrayList;

public class JavaProv2 {

    
    public static void main(String args[]) {
        
       // int Numbers1[] = {5, 10, 25, 75, 125};
       // int Numbers2[] = {50, 100, 250, 750, 25};
        
    ArrayList<Integer> Numbers1 = new ArrayList<Integer>();
    Numbers1.add(5);
    Numbers1.add(10);
    Numbers1.add(25);
    Numbers1.add(75);
    Numbers1.add(125);

    
    Numbers1.remove(0); // Remove by index

    System.out.println(Numbers1);
    
    ArrayList<Integer> Numbers2 = new ArrayList<Integer>();
    Numbers2.add(50);
    Numbers2.add(100);
    Numbers2.add(250);
    Numbers2.add(750);
    Numbers2.add(25);

    
    Numbers2.remove(4);
        System.out.println(Numbers2);
   
   
    
        int sum1 = 0;
        for(int i : Numbers1){
            sum1 += i;
        }
        System.out.println(sum1);
        int sum2 = 0;
        for(int i : Numbers2){
            sum2 += i;
        }
        System.out.println(sum2);
        System.out.println(sum2 / sum1);
        
       
    }
}
