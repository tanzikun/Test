import sun.applet.Main;

public class TestLambda {

    public static void main(String[] args) {
        TestLambda testLambda = new TestLambda();
        // 类型声明
        MathOperation addition = (int a,int b) -> a + b;
        // 不用类型声明
        MathOperation subtraction = (a,b) -> a - b;
        // 大括号中的返回语句
        MathOperation multiplication = (int a,int b) -> { return a * b; };
        // 没有大括号及返回语句
        MathOperation division = (int a , int b) -> a / b;

        System.out.println("10 + 5 = " + testLambda.operate(10, 5, addition));
        System.out.println("10 - 5 = " + testLambda.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + testLambda.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + testLambda.operate(10, 5, division));
    }



    interface MathOperation{
        int operate(int a,int b);
    }

    private int operate(int a,int b,MathOperation mathOperation){
        return mathOperation.operate(a,b);
    }
}

