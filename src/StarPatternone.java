public class StarPatternone {
    public static void main(String[] args) {
        int i = 0,j = 0;
        int rows = 14;
        for(i=1; i<=rows; i++)
        {
            for(int x=rows;x>=1;x--) {
                for (j = 1; j < i && x<=j ; j++) {
                    System.out.print("*");
                    System.out.print(" ");
                }
                for (j = i; j <= rows; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    }

