import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main main = new Main();
        main.readNumbers();
        main.printNumbers();
    }
    void readNumbers() {
        Scanner scanner = new Scanner(System.in);
    }
    void printNumbers() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println(scanner1.nextLine());
    }
}