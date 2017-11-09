package Example4;

public class G3Ypr1 {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch, z, l,p;
        int counter = 0, x = 0, y = 0;

        System.out.println(" Vvedite text: ");


        for (; ; ) {
            ch = (char) System.in.read();


            if (ch >= 'a' & ch <= 'z') {
                if(ch==' '){
                    System.out.println(" ");

                z = (char) (ch - 32);
                System.out.print( ""+ z);

            }
            }
            if (ch >= 'A' & ch <= 'Z') {
                     l = (char) (ch + 32);
                    System.out.print("" + l );
                if(ch==' ') {
                    p = (char) (' ');
                    System.out.println(" ");
                }
            }

            if (ch >= 'a' & ch <= 'z') x = x + 1;
            if (ch >= 'A' & ch <='Z') y = y + 1;


            if (ch == '.') break;
        }
        System.out.println("\n"+(x + y));
    }












}