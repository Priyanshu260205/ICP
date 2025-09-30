public class leet_74 {
    public static void main(String[] args) {
        int[][] nums = { {1,3,5,7},{10,11,16,20},{23,30,34,60} };
        System.out.println(searchMatrix(nums, 3));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = m * n - 1;
        while (left < right) {
            int mid = (left + right) >> 1;
            int x = mid / n, y = mid % n;
            if (matrix[x][y] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return matrix[left / n][left % n] == target;
    }
}
