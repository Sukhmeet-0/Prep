public class Searching {
    static int []a={2,4,6,7,3,34,6,7,5,3,8};
    public static void linear(int k){
        for(int i=0;i<a.length;i++){
            if(a[i]==k){
                System.out.println("Found");
                return;
            }
        }
        System.out.println("Not Found");
        return;
    }
    public static void binary(int k){
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==k){
                System.out.println("Found");
                return;
            }
            if(k<a[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        System.out.println("Not found");
        return;
    }
    public static int possiblePositionOfKey(int k){
        int low=0;
        int high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==k){
                return mid;
            }
            if(k<a[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        linear(34);
        binary(33);
        System.out.println(possiblePositionOfKey(33));
    }
}
