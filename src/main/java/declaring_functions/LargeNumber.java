package declaring_functions;

public class LargeNumber {
    public static int larger(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println("Larger Number is:"+larger(7, 17));
    }

}