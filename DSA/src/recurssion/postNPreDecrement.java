package recurssion;

public class postNPreDecrement {
    public static void main(String[] args) {
        func(5);
    }

    private static void func(int n) {
        if(n<1){
            return;
        }
        System.out.println(n);
//        func(n--);
        func(--n);
    }
}
