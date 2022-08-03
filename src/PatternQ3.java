public class PatternQ3 {
    public static void main(String[] args) {
        int rows = 7;
        for (int i = rows; i >= 1; i-- )
        {
            for (int j = 1 ; j <= i; j++ )
            {
                System.out.print("*");
            }
            for (int k = 1 ; k <= 2 * (rows - i); k++ )
            {
                System.out.print(" ");
            }
            for (int l = 1 ; l <= i; l++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int x =0;x<2*rows;x++){
            for(int y =0;y<2*rows;y++){
                if(y==0||y==13||x==13)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}