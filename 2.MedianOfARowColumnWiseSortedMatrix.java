public class Solution {
    public int findMedian(int[][] A) {
        int r=A.length;
        int c=A[0].length;
        int n=r*c;
        int startVal=Integer.MIN_VALUE;
        int endVal=Integer.MAX_VALUE;
        while(startVal<=endVal){
            int mid= (startVal+endVal)/2;
            int count=0;
            for(int i=0; i<r; i++){
                int l=0;
                int h=c-1;
                while(l<=h){
                int m=l+(h-l)/2;
                if(A[i][m]<=mid)
                l=m+1;
                else 
                h=m-1;
        }
        count=count+l;
     }
     if(count<=n/2){
         startVal=mid+1;
     }
     else{
         endVal=mid-1;
     }
    }
