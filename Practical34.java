/*
Write a program that creates an Array List and adds a Loan object , 
a Date object , a string, and a Circle object to the list, and use a 
loop to display all elements in the list by invoking the object’s to 
String() method.
*/
import java.util.ArrayList;
import java.util.Date;
class Circle{
    double r;
    Circle(double r){
        this.r=r;
    }
    public String toString(){
        return "Circle with radius:"+this.r;
    }
}
class loan{
    double amount;
    loan(double amount){
        this.amount=amount;
    }
    public String toString(){
        return "Loan with amount:"+this.amount;
    }
}
public class Practical34 {
    public static void main(String[] args) {
        ArrayList<Object> arr=new ArrayList<Object>();
        arr.add(new loan(5000));
        arr.add(new Date());
        arr.add(new String("Java Practical"));
        arr.add(new Circle(6.45));
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i).toString());
        }
    }
}
/*
OUTPUT:
Loan with amount:5000.0
Wed Apr 19 22:36:03 IST 2023
Java Practical
Circle with radius:6.45
 */