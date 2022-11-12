import java.util.Scanner;

public class newHomework12_11 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int digit = x.nextInt();
        int first = digit / 100;
        int second = digit % 100 /10;
        int third = digit % 110 % 10;
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);


    }
}
