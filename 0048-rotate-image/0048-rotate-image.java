class Solution {
    public static void swap(int[][] mat,int r, int c){
        int temp = mat[r][c];
        mat[r][c] = mat[c][r];
        mat[c][r] = temp;
    }
    public static void reverse(int[] numbers){
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
    
        for(int i =0;i<n-1;i++){
            for(int j =i+1;j<n;j++){
                swap(matrix,i,j);
            }
        }
        
        for(int i =0;i<n;i++){
            reverse(matrix[i]);
        }
        
    }
}