package tr.edu.maltepe.oop;
import java.util.Scanner;

public class Simple_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kedinin adını al
        System.out.print("Kedinin adını girin: ");
        String name = scanner.nextLine();

        // Kullanıcıdan kedinin cinsini al
        System.out.print("Kedinin cinsini girin: ");
        String breed = scanner.nextLine();

        // Kedi nesnesi oluştur
        Cat myCat = new Cat(name, breed);

        // Kediyi miyavlat
        myCat.meow();

        scanner.close();
    }
}



