/*
Assume a vehicle plate number consists of three uppercase letters 
followed by four digits. Write a program to generate a plate
number.
 */
public class Practical12 {
    public static void main(String[] args) {
        int l1 = 65 + (int)(Math.random() * (90 - 65));
		int l2 = 65 + (int)(Math.random() * (90 - 65));
		int l3 = 65 + (int)(Math.random() * (90 - 65));	

		int num1 = (int)(Math.random() * 10);
		int num2 = (int)(Math.random() * 10);
		int num3 = (int)(Math.random() * 10);
		int num4 = (int)(Math.random() * 10);

		System.out.println("Number Plate:"+(char)(l1)+((char)(l2))+((char)(l3))+num1+num2+num3+num4);
    }
}

/*
OUTPUT:
Number Plate:FUM2892
 */