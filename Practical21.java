/*
Write an application that declares a class named Person. It should 
have instance variables to record name, age & salary. Use the new 
operator to create a Person object. Set & display its instance 
variables. 
 */
import java.util.Scanner;
class Person {
    String name;
    int age;
    int salary;
    
    public void set(){
        System.out.print("Enter name:");
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        System.out.print("Enter age:");
        age=sc.nextInt();
        System.out.print("Enter salary:");
        salary=sc.nextInt();
        sc.close();
    }
    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Salary:"+salary);
    }
}
public class Practical21 {
    public static void main(String[] args) {
        Person p=new Person();
        p.set();
        p.display();
    }
}

/*
OUTPUT:
Enter name:Krish Patel
Enter age:19
Enter salary:45000
Name:Krish Patel
Age:19
Salary:45000
 */