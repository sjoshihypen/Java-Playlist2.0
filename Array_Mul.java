public class Array_Mul {
    public static void main(String[] args) {
        // Define matrices A and B
        int[][] a = {{1, 1, 1},{2, 2, 2}, {3, 3, 3}};
        int[][] b = {{1, 1, 1},{2, 2, 2}, {3, 3, 3}};
        // Initialize result matrix C
        int[][] c = new int[3][3];

        // Perform matrix multiplication
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
        // Initialize the element in result matrix C at position (i, j)
                c[i][j] = 0;
        // Multiply and accumulate the products for each element in C
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        // Display the result matrix C
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}