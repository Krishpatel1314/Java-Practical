/*
Write a program of constructor overloading and make zero 
argument constructor to set a default values of student name, roll 
no and total marks. And make another constructor with all the three 
parameters and make use of ‘this’ keyword. Using methods, 
display values of both the constructors. 
*/
class student{
    String name;
    int roll, marks;

    student()
    {
        name="";
        roll=0;
        marks=0;
        System.out.println("Default Constructor");
    }
    student(String name,int roll, int marks){
            this.name=name;
            this.roll=roll;
            this.marks=marks;
    }
    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Roll:"+roll);
        System.out.println("Marks:"+marks);
    }
}
public class Practical22 {
    public static void main(String[] args) {
        student s1= new student();
        student s2 = new student("Krish",20,67);
        s1.display();
        s2.display();
    }
}

/*
OUTPUT:
Default Constructor
Name:
Roll:0
Marks:0
Name:Krish
Roll:20
Marks:67
 */