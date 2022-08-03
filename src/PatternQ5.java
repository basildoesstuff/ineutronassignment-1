public class PatternQ5 {
    public static void main(String[] args) {
        int n = 7;
        int i=n,j;
        for(int k=0;k<n;k++)
            System.out.print("**");
        System.out.println();
        while(i>0)
        {
            j=0;
            while(j++<i)
            {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
        for(int x=1;x<n;x++){
            for(int y = 0;y<=x;y++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int k=0;k<n;k++)
            System.out.print("**");
    }
}
