public class MyClass {
    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3, 4 },
                      { 5, 6, 7, 8 },
                      { 9, 10, 11, 12 },
                      { 13, 14, 15, 16 } };    
        
        for(int i=0; i<4; ++i){
            for(int j=0; j<i; ++j){
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }}
        for(int i=0; i<4; ++i){
            for(int j=0; j<2; ++j){
            int temp=arr[i][j];
            arr[i][j]=arr[i][4-j-1];
            arr[i][4-j-1]=temp;
        }}
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
    }
}}