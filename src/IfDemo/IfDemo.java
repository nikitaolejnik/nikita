package IfDemo;

public class IfDemo {
    public static void main(String[] args) {
        int a,b,c;
        a=2;
        b=3;
        if (a<b) System.out.println("a меньше b");
        if (a==b) System.out.println("//////");
        System.out.println();
        c= a-b;
        System.out.println("с содержит -1");
        if (c>=0) System.out.println("с не отрицательное число");
        if (c<0) System.out.println("с  отрицательное число");
        System.out.println();
        c = b-a;
        System.out.println("с содержит 1");
        if (c>=0) System.out.println("с не отрицательное число");
        if (c<0) System.out.println("с  отрицательное число");
    }
}
