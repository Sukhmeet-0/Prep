public class PalindromeString {
    public static void main(String[] args) {
        String s="ASASASA";
        char a[]=s.toCharArray();
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(a[l]==a[r]){
                l++;
                r--;
            }else{
                System.out.println("Not palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
