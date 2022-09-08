// This is the brute force approach
o(n2)
class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
        // code here
        int min=Mat[0][0];
        int max=Mat[N-1][N-1];
        int arr[]= new int[N*N];
        int k=0;
        int Result[][]= new int [N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                arr[k]=Mat[i][j];
                k++;
            }
        }
        int k1=0;
        Arrays.sort(arr);
         for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                Result[i][j]=arr[k1];
                k1++;
    }}
    return Result;
}}
