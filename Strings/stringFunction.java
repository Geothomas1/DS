import java.lang.String;

public class stringFunction {
    public static void main(String[] args) {

        // charAT

        String myStr = "Hello";
        System.out.println(myStr.charAt(0));

        // codePointAt

        System.out.println(myStr.codePointAt(0));

        // codePointBefore retrun unicode value before the index

        System.out.println(myStr.codePointBefore(2));

        // codePointCount return uncode value with in a range
        System.out.println(myStr.codePointCount(0, 5));
        
        String myStr1 = "hello";
        System.out.println(myStr.compareTo(myStr1));
        System.out.println(myStr1.compareToIgnoreCase(myStr1));
        System.out.println(myStr.concat(myStr1));
        System.out.println(myStr.contains("Hel"));
    }

}
