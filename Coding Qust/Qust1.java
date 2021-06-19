import java.util.Scanner;

class Qust1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Character character = null;
        String number = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                if (i != 0) {
                    printChar(character, number);
                    number = "";
                }
                character = input.charAt(i);
            } else {
                number = number + input.charAt(i);
                if (i == input.length() - 1) {
                    printChar(character, number);
                }
            }
        }
    }

    public static void printChar(Character character, String number) {
        // System.out.println(number);
        for (int i = 0; i < Integer.parseInt(number); i++) {
            System.out.print(character);
        }
    }
}
//a1b2c3
//output abbccc
