import java.util.Arrays;

public class SetMatixZero {

    public static void bruteSetMatrixZero(int matrix[][]){
        int m = matrix.length;
        int n = matrix[0].length;   
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(matrix[i][j]==0){
                    
                    // Mark entire row as -1
                    for(int col=0;col<n;col++){
                        if(matrix[i][col]!=0){
                            matrix[i][col]=-1;
                        }
                    }

                    // Mark entire column as -1
                    for(int row=0;row<m;row++){
                        if(matrix[row][j]!=0){
                            matrix[row][j]=-1;
                        }
                    }
                }
            }
        }

        // replace all -1 with 0
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==-1) matrix[i][j]=0;
            }
        }
    }
   public static void main(String[] args) {

    int arr[][] ={
       {1,1,1},
       {1,0,1},
       {1,1,1}
    };

   

    for(int a[]:arr){
        System.out.println(Arrays.toString(a));
    }
    
   }
    }