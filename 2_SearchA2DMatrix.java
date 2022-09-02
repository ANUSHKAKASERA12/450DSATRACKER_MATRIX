class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      int r= matrix.length;
        int c= matrix[0].length;
        int t=0;
        int b=r-1;
        int le=0;
        int ri=c-1;
        int k=-1;
        if(r==1 &&c==1){
            if(target==matrix[0][0]){
                return true;
            }
        }
        else{
        for(int i=t; i<=b;i++){
            if(target>=matrix[i][le]&& target<=matrix[i][ri]){
                k=i;
                break ;
            }
        }
        if(k==-1){
            return false ;
        }
        else {
            for(int i=le; i<=ri;i++){
                if(target==matrix[k][i]){
                    return true;
                }
                
                
            }
      
    }}
        return false;
    }
}
