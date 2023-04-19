/*
Make a package called “MyPack” in which declare one class called 
“PackDemo” which displays the string from three different classes 
of that same package. 
*/
package MyPack;
public class packDemo {
    public static void main(String[] args) {
        System.out.println(ClassA.getString());
        System.out.println(ClassB.getString());
    }
}

/*
OUTPUT:
Hello from A
Hello from B
 */