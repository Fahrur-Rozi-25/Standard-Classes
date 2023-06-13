package App;

import java.util.Random;
import java.util.Scanner;

public class RandomsApp {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int count = 0;

        System.out.print("Masukkan Angka Yang Akan di random yaitu 0-...: ");
        var randoms = scanner.nextInt();
        if (randoms <= 0){
            System.out.println("ERROR NILAI TIDAK BOLEH 0 ATAU KURANG DARI 0");
            System.exit(1);
        }

        System.out.print("Masukkan Jumlah Yang Ingin Di Looping: ");
        var a = scanner.nextInt();
        if (a <= 0){
            System.out.println("ERROR NILAI TIDAK BOLEH 0 ATAU KURANG DARI 0");
            System.exit(1);
        }

        System.out.print("Masukkan Angka Yang Anda pilih ketika di random: ");
        var persamaan = scanner.nextInt();
        if (persamaan <= 0){
            System.out.println("ERROR NILAI TIDAK BOLEH 0 ATAU KURANG DARI 0");
            System.exit(1);
        }

        if (persamaan > randoms) {

            System.out.println("ERROR ,, NILAI NYA HARUS LEBIH KECIL DARI ANGKA YANG AKAN DI RANDOM");
            System.exit(1);
        }

        for (var i = 0; i<a; i++){
            int b =random.nextInt(randoms);
            System.out.println(b);
            if (b == persamaan){
                count++;
                System.out.println("Nomor tersebut sama dengan yang anda pilih yaitu Nilai "+persamaan+"  Ke - "+count);
            }
        }
        System.out.println("Jumlah tebakan anda yang benar yaitu sebanyak: "+count);
        }
    }
