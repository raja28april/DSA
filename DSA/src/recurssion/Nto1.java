package recurssion;

public class Nto1 {
    public static void main(String[] args) {
//        fuc(5);
//        funcRev(5);
        funcBoth(5);
    }

    private static void fuc(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        fuc(n-1);
    }

    private static void funcRev(int n){
        if(n==0){
            return;
        }
        funcRev(n-1);
        System.out.println(n);
    }

    private static void funcBoth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funcBoth(n-1);
        System.out.println(n);
    }
}
