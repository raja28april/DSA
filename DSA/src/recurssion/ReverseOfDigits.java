package recurssion;

public class ReverseOfDigits {
    static int sum=0;
    public static void main(String[] args) {
        reverseNum(5463);
        System.out.println(sum);
        System.out.println(rev2(5678));
    }

    private static void reverseNum(int n) {
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        reverseNum(n/10);
    }
    https://careers.adeccogroup.com/berlin
    private static int rev2(int n){
        int digits = (int)(Math.log10(n))+1;
        return helper(n,digits);
    }

    private static int helper(int n, int digits){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem * (int)Math.pow(10,digits-1)+helper(n/10,digits-1);
    }

    private static boolean palindrome(int n){
        return n==reverseNum(n);
    }
}
