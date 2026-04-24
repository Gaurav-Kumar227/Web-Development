import java.util.Scanner;

public class TriangleClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a <= 0 || b <= 0 || c <= 0 || a > 10 || b > 10 || c > 10) {
            System.out.println("Invalid Triangle");
        } 
        else if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Invalid Triangle");
        } 
        else if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } 
        else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        } 
        else {
            System.out.println("Scalene Triangle");
        }

        sc.close();
    }
}