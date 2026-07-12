interface Increment {
    void increase(int x);   // method declaration
}


class Test implements Increment {


    // implementing interface method
    public void increase(int x) {
        x = x + 10;
        System.out.println("Inside method: x = " + x);
    }
}


public class Main {
    public static void main(String[] args) {


        int num = 5;


        System.out.println("Before method call: num = " + num);


        // creating object
        Test t = new Test();


        // calling method
        t.increase(num);


        System.out.println("After method call: num = " + num);
    }
}
