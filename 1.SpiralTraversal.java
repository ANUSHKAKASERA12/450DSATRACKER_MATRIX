class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList< Integer> a= new ArrayList<>();
        if(r==0){
          return a;  
        }
        int t=0;
        int b= r-1;
        int le=0;
        int ri=c-1;
        int d=0;
        while(t<=b && le<=ri){
            if(d==0){
               for(int i=le; i<=ri;i++){
                   a.add(matrix[t][i]);
               } 
               d=1;
               t++;
            }
            else if(d==1){
                 for(int i=t; i<=b;i++){
                   a.add(matrix[i][ri]);
               } 
            d=2;
            ri--;
            }
            else if(d==2){
                for(int i=ri; i>=le;i--){
                   a.add(matrix[b][i]);
               }  
               b--;
               d=3;
            }
            else if (d==3){
                 for(int i=b; i>=t;i--){
                   a.add(matrix[i][le]);
               } 
               le++;
               d=0;
            }
        }
        return a;
    }
}
