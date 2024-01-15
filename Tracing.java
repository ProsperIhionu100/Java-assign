public class Tracing {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println("Before MethodCall: x = " + x + " , y = " +y);
        methodCall(x,y);
        System.out.println("After MethodCall: x = " + x + " , y = " +y);
    }

    public static void methodCall(int a, int b) {
        a +=5;
        b *=2;
        System.out.println("Inside MethodCall: a = " + a + " , b = " +b);
    }
}


// 1) What are the initail values of x and y before the method call
// (Ans) their values were 5 for x, and 10 for y

//  2) what values where passed to the methodCall method for parameters a and b
// (Ans) the values passed where 5 and 10 stored in the variables x and y respectively.

// 3) inside the methodCall method what are the values of a and b after the operations
//  (Ans) the  values of a and b where 10 and 20  after the operations respectively.

//  4) After the methodCall method has been executed, what are the values of x and y in the main method
//  (Ans) the values of x and y after the methodCall method has been executed sre 5 and 10 respectively

// 5) Provide the final output that will be printed to the console
/*
 * This are the final output
 * 
 * Before MethodCall: x = 5 , y = 10
   Inside MethodCall: a = 10 , b = 20
   After MethodCall: x = 5 , y = 10
 */