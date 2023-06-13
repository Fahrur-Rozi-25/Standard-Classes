package App;

import java.util.Scanner;

public class ArrayApp {
    int[] array = new int[2];
    public void setArray() {
        Scanner scanner = new Scanner(System.in);
        for ( int i = 0; i<array.length;i++){
            if (array[i] != 0){
                System.out.println(array[i]);
            } else {
                System.out.println("Masukkan Data");
                int data = array[i] = scanner.nextInt();
                array[i] = data;
            }
        }
    }

    public static void main(String[] args) {
        ArrayApp array1 = new ArrayApp();
        array1.setArray();
    }
}
