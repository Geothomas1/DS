import java.util.*;
public class StackCollection {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);

        System.out.println(s);
        Iterator<Integer> itr=s.iterator();  
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
    }
    
}
