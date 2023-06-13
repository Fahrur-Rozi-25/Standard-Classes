package App;

import java.util.UUID;

public class UUIDApp {
    public static void main(String[] args) {
        System.out.println("The UUID Is Never Same: ");

        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);

        for (var i = 0 ; i < 10 ; i++){
            UUID uuid1 = UUID.randomUUID();
            System.out.println(uuid1);
        }



    }
}
