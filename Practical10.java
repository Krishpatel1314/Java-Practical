/*Write an interactive program to print a string entered in a pyramid. 
For instance, the string “stream” has to be displayed as follows: 
     S
    S t
   S t r
  S t r e
 S t r e a
S t r e a m */
public class Practical10 {
    public static void main(String[] args) {
        char ch[]={'s','t','r','e','a','m'};
        String s=new String(ch);
        int i,j,k,n;
        n=s.length();
        for(i=n;i>0;i--)
        {
            j=0;
            for(k=i;k<=n;k++)
            {
                System.out.print(" ");
                System.out.print(ch[j]);
                System.out.print(" ");
                j++;
            }
            System.out.println(" ");
        }
    }
}
