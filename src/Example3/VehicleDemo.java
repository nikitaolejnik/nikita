package Example3;

class Vehicle{
    int passengers;
    int fuelcap;
    int mpg;
    void range(){
        System.out.println(" Дальность "+ fuelcap*mpg + " Миль");
    }
}
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;
        minivan.passengers=7;
        minivan.fuelcap=16;
        minivan.mpg=21;
        range=minivan.fuelcap*minivan.mpg;
        System.out.println(" Минивен может перевести " + minivan.passengers+ " пассажиров на расстоянии " +range + " Миль " );

    }

}
