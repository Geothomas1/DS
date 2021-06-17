import java.util.Scanner;

class Qust1{
    public static void main(String args[]) throws StringIndexOutOfBoundsException
    {
        String input;
        char arr1[]=new char[4];
        int num[]=new int[4];
        int j=0,k=0;
        Scanner sc=new Scanner(System.in);
        input=sc.nextLine();
        for(int i=0;i<=input.length();i++)
        {
            if(i%2==0)
            {
                arr1[k]=input.charAt(i);
                System.out.println(arr1[k]);
                k++;
            }else
            {
                char tmp=input.charAt(i);
                num[j]=Character.getNumericValue(tmp);
                j++;
            }
        }
        for(int i=0;i<num[i];i++)
        {
            for(int l=0;l<i;l++)
            {
                System.out.println(arr1[l]);
            }
        }
    }
}