/*
Write a program to generate customized exception named 
ArgumentGreaterThanOne if there is more than one argument in 
command line. 
 */
import java.lang.Exception;
import java.lang.String;
class ArgumentGreaterThanOne extends Exception {
    ArgumentGreaterThanOne(String e) {
        super(e);
    }
}
public class Practical30{
    public static void main(String[] args) throws
    ArgumentGreaterThanOne{
        try {
            if (args.length>1) {
                throw new ArgumentGreaterThanOne("Too many arguments");
            } else {
                System.out.println("Successfully run without Exception");
            }
        } catch (ArgumentGreaterThanOne e) {
            System.out.println(e);
        }
    }
}
/*
OUTPUT:
C:\Users\HP\Desktop>java Practical30 1 2
ArgumentGreaterThanOne: Too many arguments
 */