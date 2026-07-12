// import.util.*;
class matrix
{
    public static void main(String[] args) {
        int[][] a = {
            {1, 2},
            {3, 4}
        };
        int[][] b = {
            {4, 1, 5},
            {0, 2, 6}
        };
        int[][] c = new int[2][3];
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                c[i][j] = 0;
                for(int k=0; k<2; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
