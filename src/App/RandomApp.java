package App;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        Random random = new Random();
        int value = random.nextInt(1000);
        System.out.println(value);

        for (var i=0;i<10;i++){
            Random randoms = new Random();
            int values = randoms.nextInt(1000);
            System.out.println(values);
        }



    }
}
