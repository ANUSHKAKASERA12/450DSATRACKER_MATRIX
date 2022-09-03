class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int t=0;
        int k=-1;
        int countall=0;
        int b=n-1;
        int count=0;
        while(t<=b){
        for(int i=0; i<m;i++){
            if(arr[t][i]==1)
            {
                count++;
            }
        }
        if(countall<count){
            
        countall=count;
        k=t;
            
        }
        t++;
        count=0;
    }
    return k;}
}
