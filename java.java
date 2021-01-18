import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        int s = num*num;
        System.out.printf("%s - square of the number: %d", s, num);
    }
}