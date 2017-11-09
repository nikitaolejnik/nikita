package Example4;

import java.io.IOException;

class ChkNum{
    boolean isIven(int x , int y){
        if (x%y==0) return true;
        else return false;
        }

      }



public class ParmDemo {
    public static void main(String[] args)
        throws java.io.IOException{
        char ignore;

        ChkNum z = new ChkNum();
        System.out.println("Введите v:  ");
        int v = (int) System.in.read();

        do {
            ignore = (char) System.in.read();
        } while (ignore != '\n');

        System.out.println("Введите b: ");
        int b=(int) System.in.read();
        if(z.isIven(v,b)) System.out.println(" b является делителем v ");
        else System.out.println(" Не делится");

    }
}
