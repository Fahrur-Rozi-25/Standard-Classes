package Data;

import java.util.Scanner;

public class Rumusluas {
    public  void Luas (){
        Scanner InputUser = new Scanner(System.in);
        System.out.println("RUMUS MENGHITUNG LUAS");
        System.out.print("Masukkan Panjang = ");
        int panjang = InputUser.nextInt();
        System.out.print("Masukkan Luas = ");
        int luas = InputUser.nextInt();
        int hasil = panjang * luas;
        System.out.println("Hasil Penjumlahan = "+hasil);
    }
}
