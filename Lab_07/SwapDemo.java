public class SwapDemo {


    // method to swap numbers
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;


        System.out.println("Inside swap function:");
        System.out.println("a = " + a + ", b = " + b);
    }


    public static void main(String[] args) {


        int x = 10;
        int y = 20;


        System.out.println("Before swapping:");
        System.out.println("x = " + x + ", y = " + y);


        // calling swap function
        swap(x, y);


        System.out.println("After swapping (in main):");
        System.out.println("x = " + x + ", y = " + y);
    }
}
