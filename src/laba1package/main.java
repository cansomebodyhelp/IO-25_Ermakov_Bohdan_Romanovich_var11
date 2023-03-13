package laba1package;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
            System.out.print("Введіть значення а: ");
            Scanner scanner = new Scanner(System.in);
            Summ viraz = new Summ();
            char a = scanner.next().charAt(0);
            viraz.azmina = a;
            System.out.print("Введіть значення b: ");
            char b = scanner.next().charAt(0);
            viraz.bzmina = b;
            System.out.print("Введіть значення n: ");
            short n = scanner.nextShort();
            viraz.nzmina = n;
            System.out.print("Введіть значення m: ");
            short m = scanner.nextShort();
            viraz.mzmina = m;
            viraz.viraz();
    }
}
