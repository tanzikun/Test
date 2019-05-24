public class TestLambda2 {

    public static void main(String[] args) {
        SayMessage sayMessage1 = (String message) -> {
            System.out.println("Hello: "+message);
        };
        SayMessage sayMessage2 = (String message) ->{
            System.out.println("bye: "+message);
        };
        sayMessage1.sayMessage("kuhn");
        sayMessage2.sayMessage("kuhn");
    }

    interface SayMessage{
        void sayMessage(String message);
    }
}
