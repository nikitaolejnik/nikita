package Example4;

public class Break {
    public static void main(String[] args) {


        int x, y , stop1, stop2;


        for (x = 0; x < 10; x++)
            stop1:{
            for (y = 10; y > 0; y--) {
                if (y == 5) break stop1;

                System.out.println(" " + x + " " + y);
        }
        }

        System.out.println(" ");

        for (x = 0; x < 20; x++)
        stop2:{
        for (y = 10; y > 0; y--) {
            if (y == 5) break stop2;

            System.out.println(x + " " + y + " ");
        }}
    }
}