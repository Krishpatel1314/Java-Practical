/*Write a program that creates a Random object and displays the first 100 random 
integers between 1 and 49 using the NextInt (49) method.*/
import java.util.Random;
public class Practical11 {
    public static void main(String[] args) {
        Random random= new Random(100);
        for (int i = 0; i < 100; i++) {
            System.out.print("   "+random.nextInt(49));
      if ((i + 1) % 10 == 0) {
        System.out.println();
      }
        }
    }
}

/*
OUTPUT:
 2   24   32   26   8   41   38   31   41   17
   43   2   29   40   15   31   43   24   5   33
   0   42   19   26   14   6   48   29   26   9
   7   37   9   40   23   16   34   27   4   2
   17   16   12   48   7   36   44   12   14   48
   15   2   31   43   9   26   5   42   8   38
   2   29   21   0   23   46   46   24   38   7
   46   6   29   8   27   21   12   40   39   5
   48   45   15   45   12   5   12   19   37   48
   15   43   13   6   15   35   0   41   19   29
 */