import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int a = scan.nextInt();
        if (a == 12) {
            System.out.print("Сейчас зима");
        } else if (a == 1 || a == 2 ) {
            System.out.print("Сейчас зима");
        } else if (a == 3 || a == 4 || a == 5) {
            System.out.print("Сейчас весна");
        } else if (a == 6 || a==7 || a== 8) {
            System.out.print("Сейчас лето");
        } else if (a == 9 || a == 10 || a == 11) {
            System.out.print("Сейчас осень");
        }
    }
}


