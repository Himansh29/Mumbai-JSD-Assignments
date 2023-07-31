public class NestedLoopsAssignment {

    static void traverseTheMatrix(int [][] matrix){
        for(int i = 0; i<matrix.length; i++) {
            for(int j = 0; j<matrix[i].length; j++) {
                System.out.println("Element at position " + i + " " + j + " is " + matrix[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {  { 3, 2, 1, 7 },
					        { 9, 11, 5, 4 },
					        { 6, 0, 13, 17 },
					        { 7, 21, 14, 15 } };
        traverseTheMatrix(matrix);
    }
}
