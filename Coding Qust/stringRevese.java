
// public class stringRevese {
//     public static void reverseString(char[] s) {
//         for (int i = s.length-1; i >= 0; i--) {
//             System.out.print(s[i]);
//         }
//     }

//     public static void main(String[] args) {
//         String s = "Geo";
//         char[] input = s.toCharArray();
//         System.out.println(input);
//         reverseString(input);
//     }
// }

public  class stringRevese{
    public static void main(String[] args) {
     String s="Geo Thomas";
     System.out.println(s);
     byte[] arrayinput=s.getBytes();   
     byte[] result=new byte[arrayinput.length];
     for(int i=0;i<arrayinput.length;i++){
         result[i]=arrayinput[arrayinput.length-i-1];
     }
     System.out.println(new String(result));
    }
}