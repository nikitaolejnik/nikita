package Example2;

import com.sun.org.apache.xpath.internal.SourceTree;

public class LogicalOpTaЬle {
    public static void main(String[] args) {
     boolean p, q;
     int x=1,y=0;
        System.out.println("P     \tQ   \tAND   \tOR   \tXOR   \tNOT   ");
        p=true; q=true;
        if (p=true);
        System.out.print(x+ "\t" + x+ "\t");
        if ((p&q)==true) System.out.print(x+ "\t");
        else System.out.print(y+ "\t");
        if ((p|q)==true) System.out.print(x+ "\t");
        else System.out.print(y+ "\t");
        if ((p^q)==true) System.out.print(x+ "\t");
        else System.out.print(y+ "\t");
        if ((!p)==true) System.out.println(x+ "\t");
        else System.out.println(y+ "\t");

        p=true; q=false;
        System.out.print(x+ "\t" + y+ "\t");
        if ((p&q)==true) System.out.print(x+ "\t");
        else System.out.print(y+ "\t");
        if ((p|q)==true) System.out.print(x+ "\t");
        else System.out.print(y+ "\t");
        if ((p^q)==true) System.out.print(x+ "\t");
        else System.out.print(y+ "\t");
        if ((!p)==true) System.out.println(x+ "\t");
        else System.out.println(y+ "\t");

        p=false; q=true;
        System.out.print(y+ "\t" + x+ "\t");
        if ((p&q)==true) System.out.print(x+ "\t");
        else System.out.print(y+ "\t");
        if ((p|q)==true) System.out.print(x+ "\t");
        else System.out.print(y+ "\t");
        if ((p^q)==true) System.out.print(x+ "\t");
        else System.out.print(y+ "\t");
        if ((!p)==true) System.out.println(x+ "\t");
        else System.out.println(y+ "\t");

        p=false; q=false;
        System.out.print(y+ "\t" + y+ "\t");
        if ((p&q)==true) System.out.print(x+ "\t");
        else System.out.print(y+ "\t");
        if ((p|q)==true) System.out.print(x+ "\t");
        else System.out.print(y+ "\t");
        if ((p^q)==true) System.out.print(x+ "\t");
        else System.out.print(y+ "\t");
        if ((!p)==true) System.out.println(x+ "\t");
        else System.out.println(y+ "\t");
    }
}
