/*
Create a class Vehicle, which has single variable NoOfWheels. 
Develop two subclasses, TwoWheeler and FourWheeler. Develop 
subclasses of these 2 subclasses. Create instances of these classes 
and print appropriate details. (use super keyword). 
 */
class vehicle{
    protected int noofwheels;
    public vehicle(int wheels){
        noofwheels=wheels;
    }
}
class TwoWheeler extends vehicle{
    public TwoWheeler(){
        super(2);
    }
}
class FourWheeler extends vehicle{
    public FourWheeler(){
        super(4);
    }
}
class motorcycle extends TwoWheeler{
    public motorcycle(){
        String type="Motorcycle";
        System.out.println("Type of Vehicles:"+type);
        System.out.println("No. of Wheels:"+noofwheels);
    }
}
class scooter extends TwoWheeler{
    public scooter(){
        String type="Scooter";
        System.out.println("Type of Vehicles:"+type);
        System.out.println("No. of Wheels:"+noofwheels);
    }
}
class suv extends FourWheeler{
    public suv(){
        String type="SUV";
        System.out.println("Type of Vehicles:"+type);
        System.out.println("No. of Wheels:"+noofwheels);
    }
}
class car extends FourWheeler{
    public car(){
        String type="Car";
        System.out.println("Type of Vehicles:"+type);
        System.out.println("No. of Wheels:"+noofwheels); 
    }
}
public class Practical26 {
    public static void main(String[] args) {
        scooter sc=new scooter();
        motorcycle m=new motorcycle();
        car c=new car();
        suv s=new suv();
    }
}
/*
OUTPUT:
Type of Vehicles:Scooter
No. of Wheels:2
Type of Vehicles:Motorcycle
No. of Wheels:2
Type of Vehicles:Car       
No. of Wheels:4
Type of Vehicles:SUV
No. of Wheels:4
 */