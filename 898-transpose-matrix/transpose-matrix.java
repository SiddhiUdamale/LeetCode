class Solution {
    public int[][] transpose(int[][] matrix) {
        int count = 0;
        
           
            for(int j=0;j<matrix[0].length;j++){
                count++;
            }
           // System.out.println(count);
        
        // System.out.println(" "+a.length+" ");
        int c[][] = new int[count][matrix.length];
        int k = 0;
        for(int i=0;i<count;i++){
            for(int j=0;j<c[i].length;j++){
                if(k==matrix.length){
                    k=0;
                }
                 c[i][j] = matrix[k++][i];
                
                
                }
            
            }
            return c;
    }
}