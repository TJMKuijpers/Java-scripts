/** This script is used to solve a linear system of equations in the form of
 * ax+by=c
 * dx+ey=f
 *
 * The first input line gives a,b and c
 * the second input line gives d,e,f
 * Output is x and y
 */

package solver;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();
        double y = (f-(c*(d/a)))/(e-(b*(d/a)));
        double x = (c-b*y)/a;

        System.out.print(x);
        System.out.print(" ");
        System.out.print(y);
    }
}
