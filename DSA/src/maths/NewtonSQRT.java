package maths;

public class NewtonSQRT {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }

    private static double sqrt(double n) {
        double x = n;
        double root;
        while(true){
            root = 0.5 * (x+(n/x));
            double err = Math.abs(root-x);
            if(err<0.01){
                break;
            }
            x=root;
        }
        return root;
    }
}
