public class Array3D {
    public static void main(String[] args) {
        int threeD[][][] = new int[5][5][5] ;
        int i , j , k ;

        for( i = 0 ; i < 5 ; i++)
            for( j = 0 ; j < 5 ; j++)
                for( k = 0 ; k < 5 ; k++)
                    threeD[i][j][k] = i * j * k ;

        for( i = 0 ; i < 5 ; i++) {
            for (j = 0; j < 5; j++) {
                for (k = 0; k < 5; k++)
                    System.out.print(threeD[i][j][k] + " ");
                System.out.println();
            }
            System.out.println();
        }


    }
}
