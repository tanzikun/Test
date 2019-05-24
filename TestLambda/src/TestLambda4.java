public class TestLambda4 {

    public static void main(String[] args) {
        final int num = 1;
        Converter<String,Integer> converter = (int i) -> System.out.println(String.valueOf(i+num));
        converter.conver(1);
    }

    interface Converter<T1,T2>{
        void conver(int i);
    }
}
