/*
Write a program that generate 6*6 two-dimensional matrix, filled 
with 0’s and 1’s , display the matrix, check every raw and column 
have an odd number’s of 1’s
 */
public class Practical17 {
    public static int[][] create() {
        int[][] m = new int[6][6];
        for (int i = 0; i < 6; i++) {
          for (int j = 0; j < 6; j++) {
            m[i][j] = (int)((Math.random() * 5) % 2);
          }
        }
        return m;
    }
    public static void display(int[][] m) {
        System.out.print("Matrix Values \n");
        for (int i = 0; i < 6; i++) {
          for (int j = 0; j < 6; j++) {
            System.out.print(m[i][j] + " ");
          }
          System.out.println();
        }
    }
    public static void main(String[] args) {
    int m[][];
    int i, j, count;
    m = create();
    display(m);
    System.out.println("Rows Having ODD no of 1s");
    for (i = 0; i < 6; i++) {
      count = 0;
      for (j = 0; j < 6; j++) {
        if (m[i][j] == 1) {
          count++;
        }
      }
      if (count % 2 != 0) {
        System.out.println("Row : " + (i + 1) + " have ODD no of 1s");
      }
    }
    System.out.println("Columns Having ODD no of 1s");
    for (i = 0; i < 6; i++) {
      count = 0;
      for (j = 0; j < 6; j++) {
        if (m[j][i] == 1) {
          count++;
        }
      }
      if (count % 2 != 0) {
        System.out.println("Column : " + (i + 1) + " have ODD no of 1s");
      }
    }    
    }
}
/*
OUTPUT:
Matrix Values 
0 1 1 1 0 1 
1 1 0 0 0 0 
1 1 0 1 0 0
0 1 0 0 0 1
1 1 1 0 1 1
1 0 1 0 1 0
Rows Having ODD no of 1s
Row : 3 have ODD no of 1s
Row : 5 have ODD no of 1s
Row : 6 have ODD no of 1s
Columns Having ODD no of 1s
Column : 2 have ODD no of 1s
Column : 3 have ODD no of 1s
Column : 6 have ODD no of 1s
 */