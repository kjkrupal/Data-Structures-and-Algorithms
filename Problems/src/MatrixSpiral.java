public class MatrixSpiral {

    static void spiralPrint(int m, int n, int a[][])
    {
        int i, k = 0, l = 0;

        while (k < m && l < n)
        {
            // Print the first row from the remaining rows
            for (i = l; i < n; ++i)
            {
                System.out.print(a[k][i]+" ");
            }
            k++;


            // Print the last column from the remaining columns
            for (i = k; i < m; ++i)
            {
                System.out.print(a[i][n-1]+" ");
            }
            n--;


            // Print the last row from the remaining rows
            if (k < m)
            {
                for (i = n-1; i >= l; --i)
                {
                    System.out.print(a[m-1][i]+" ");
                }
                m--;
            }

            // Print the first column from the remaining columns
            if (l < n)
            {
                for (i = m-1; i >= k; --i)
                {
                    System.out.print(a[i][l]+" ");
                }
                l++;
            }

        }
    }

    // driver program
    public static void main (String[] args)
    {
        /*
        int R = 3;
        int C = 4;
        int a[][] = {   {1, 2, 3, 10},
                        {4, 5, 6, 10},
                        {7, 8, 9, 10}};
        spiralPrint(R,C,a);
*/
        int [][]mat = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int r = 3, c = 3;

        // Function calling
        printSpiral(mat, r, c);
    }

    // Java program to print a
// matrix in spiral form


    static void printSpiral(int [][]mat, int r, int c)
    {
            int i, a = 0, b = 2;

            int low_row = (0 > a) ? 0 : a;
            int low_column = (0 > b) ? 0 : b - 1;
            int high_row = ((a + 1) >= r) ? r - 1 : a + 1;
            int high_column = ((b + 1) >= c) ? c - 1 : b + 1;

            while ((low_row > 0 - r && low_column > 0 - c))
            {
                for (i = low_column + 1; i <= high_column &&
                        i < c && low_row >= 0; ++i)
                    System.out.print (mat[low_row][i] + " ");
                low_row -= 1;

                for (i = low_row + 2; i <= high_row && i < r &&
                        high_column < c; ++i)
                    System.out.print(mat[i][high_column] + " ");
                high_column += 1;

                for (i = high_column - 2; i >= low_column &&
                        i >= 0 && high_row < r; --i)
                    System.out.print(mat[high_row][i] + " ");
                high_row += 1;

                for (i = high_row - 2; i > low_row && i >= 0
                        && low_column >= 0; --i)
                    System.out.print(mat[i][low_column] +" ");
                low_column -= 1;
            }
            System.out.println();
    }



}
