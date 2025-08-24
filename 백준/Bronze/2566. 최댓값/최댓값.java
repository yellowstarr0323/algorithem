import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] arr1= new int[10][10];

        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                arr1[i][j] = input.nextInt();
            }

        }
        int max=0;
        int indexI=0;
        int indexJ=0;
        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                if(max<=arr1[i][j]){
                    max = arr1[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(indexI+" "+indexJ);

    }
}
