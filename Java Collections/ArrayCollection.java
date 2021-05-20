import java.util.ArrayList;
public class ArrayCollection {
        public static void main(String[] args) {
        ArrayList <String> a1=new ArrayList <String>();
        System.out.println(a1.size());
        a1.add("A");
        a1.add("B");
        a1.add("C");
        a1.add("D");
        System.out.println(a1.size());
        //get 0th elemenet
        System.out.println(a1.get(0));
        //change an elemenet
        a1.set(0, "E");
        System.out.println(a1.get(0));
        a1.remove(0);
        for(int i=0;i<a1.size();i++)
        {
            System.out.println(a1.get(i));
        }

        
    }
}
