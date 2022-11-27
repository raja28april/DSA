package maths;
//Time complexity O(log(base))
public class basePowN {
    public static void main(String[] args) {
        int base = 3;
        int n = 8;//110
        int ans = 1;

        while(n>0){
            if((n&1)==1){
                ans *= base;
            }
            base *= base;
            n=n>>1;
        }
        System.out.println(ans);
    }
}
