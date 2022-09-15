import java.util.Scanner;

public class Arraysist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int twoD[][] = new int[10][] ;
        twoD[0] = new int[1] ;
        twoD[1] = new int[2] ;
        twoD[2] = new int[3] ;
        twoD[3] = new int[4] ;
        twoD[4] = new int[5] ;
        twoD[5] = new int[6] ;
        twoD[6] = new int[7] ;
        twoD[7] = new int[8] ;
        twoD[8] = new int[9] ;
        twoD[9] = new int[10] ;

        int i , j , k = 0 ;

        for( i = 0 ; i < 10 ; i++)
            for( j = 0 ; j < i + 1 ; j++) {
                twoD[i][j] = k ;
                k++ ;
            }

        for( i = 0 ; i < 10 ; i++) {
            for( j = 0 ; j < i + 1 ; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }
}
