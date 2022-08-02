public class ineutron {
    public static void main(String[] args) {
        String word = "INEUTRON";
        int length=word.length();
        for(int i=0;i<length;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
    }
}
