import java.util.*;  

public class VectorListCollection {
    public static void main(String[] args) {
        Vector<String> v=new Vector<String>();
        v.addElement("Geo");
        v.add("Appu");
        System.out.println(v.size());
        System.out.println(v.hashCode());
        System.out.println(v.capacity());
        
    }
    
}
