import java.util.Scanner;

public class twodigit {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int number=Integer.parseInt(sc.nextLine());
            int lar=9;
            int small=1;
            while(number>0){
                int d=number%10;
                if(d>lar){
                    lar=d;
                    
                }
                if(d<small){
                    small=d;
                }
                number=number/10;

            }
            System.out.println(lar);
            System.out.println(small);


    }
    
}
