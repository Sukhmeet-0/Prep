public class SortedMatrixSearch {
    public static void search(int[][]m,int n,int x){
        int i=0;
        int j=n-1;
        while(i<n && j>=0){
            if(m[i][j]==x){
                System.out.println("Found "+x+" at position "+i+", "+j);
                return;
            }
            if(m[i][j]>x){
                j--;
            }else{
                i++;
            }
        }
        System.out.println("Value not found");
    }
    public static void spiralPrint(int[][]m,int r,int c){
        int i,k=0,l=0;
        while(k<r && l<c){
            for(i=l;i<c;i++){
                System.out.print(m[k][i]+" ");
            }
            k++;
            for(i=k;i<r;i++){
                System.out.print(m[i][c-1]+" ");
            }
            c--;
            if(k<r){
                for(i=c-1;i>=1;i--){
                    System.out.print(m[r-i][i]+" ");
                }
                r--;
            }
            if(l<c){
                for(i=r-1;i>=k;i--){
                    System.out.print(m[i][l]);
                }
            }l++;
        }
    }
    public static void main(String[] args) {
        int [][]matrix={
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,51}
        };
        search(matrix,4,35);
        spiralPrint(matrix,4,4);
    }
}
