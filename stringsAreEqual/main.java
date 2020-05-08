/** This file compares two strings without taking into account the whitespaces
    it will return true if two strings are equal, otherwise it will return false */

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        // make sure to remmove the white spaces
        str1 = str1.replace(" ","");
        str2 = str2.replace(" ","");
        System.out.print(str1.equals(str2));
    }
}
