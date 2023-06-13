package App;

import java.util.Objects;
import java.util.Scanner;

public class ScannerStringApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Akun");

        String data = scanner.next();

        if (Objects.equals(data, "Fahrur")){
            System.out.println("Selamat Datang Admin");
        }
        else {
            System.out.println("Tidak Valid");
        }

    }

}
