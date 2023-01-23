import java.util.Arrays;
import java.util.Scanner;

public class Arrayss{
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int a[];
            System.out.println("Enter number of elements: ");
            int n=s.nextInt();
            a=new int[n];
            for(int i=0;i<n;i++){
                System.out.println("Enter element to insert in an array:");
                a[i]=s.nextInt();
            }
            System.out.println(Arrays.toString(a));

            //insertion
            int b[]= new int[n+1];
            System.out.println("Enter index where you want to insert value: ");
            int ind=s.nextInt();
            System.out.println("Enter value to insert:");
            int v=s.nextInt();
            for(int i=0;i<n+1;i++){
                if(i<ind){
                    b[i]=a[i];
                }else if(i==ind){
                    b[i]=v;
                }else if(i>ind){
                    b[i]=a[i-1];
                }
            }
            System.out.println(Arrays.toString(b));

            //deletion
            int c[]=new int[n];
            System.out.println("Enter index from where you want to delete the element:");
            int id=s.nextInt();
            for(int i=0;i<n+1;i++){
                if(i<id){
                    c[i]=b[i];
                }else if(i==id){
                    continue;
                }else if(i>id){
                    c[i-1]=b[i];
                }
            }
            System.out.println(Arrays.toString(c));
        }
    }
}