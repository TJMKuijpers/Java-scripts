import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        // get the substring
        str = str.substring(number1, number2 + 1);
        // print the string
        System.out.print(str);
    }
}
