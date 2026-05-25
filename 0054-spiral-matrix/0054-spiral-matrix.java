class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        int startRow = 0;
        int endRow = rows - 1;

        int startCol = 0;
        int endCol = cols - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // Traverse Left → Right
            for (int col = startCol; col <= endCol; col++) {
                result.add(matrix[startRow][col]);
            }
            startRow++;

            // Traverse Top → Bottom
            for (int row = startRow; row <= endRow; row++) {
                result.add(matrix[row][endCol]);
            }
            endCol--;

            // Traverse Right → Left
            if (startRow <= endRow) {

                for (int col = endCol; col >= startCol; col--) {
                    result.add(matrix[endRow][col]);
                }
                endRow--;
            }

            // Traverse Bottom → Top
            if (startCol <= endCol) {

                for (int row = endRow; row >= startRow; row--) {
                    result.add(matrix[row][startCol]);
                }
                startCol++;
            }
        }

        return result;
    }
}