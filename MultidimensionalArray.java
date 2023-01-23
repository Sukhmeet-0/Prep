import java.util.Scanner;

public class MultidimensionalArray{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r=s.nextInt();
        System.out.print("Enter number of columns: ");
        int c=s.nextInt();
        int arr[][]=new int[r][c];
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Enter element to enter at row "+i+" and column "+j+" : ");
                arr[i][j]=s.nextInt();
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        s.close();
    }
}