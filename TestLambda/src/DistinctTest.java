import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class DistinctTest {
    private String a;
    private String b;

    DistinctTest(){

    }
    DistinctTest(String a,String b){
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "DistinctTest{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Supplier<DistinctTest> supplier = DistinctTest::new;
        BiFunction<String, String, DistinctTest> biFunction = DistinctTest::new;
        DistinctTest supplier1 = supplier.get();
        supplier1.setA("1");
        supplier1.setB("1");
        DistinctTest supplier2 = supplier.get();
        supplier2.setA("2");
        supplier2.setB("2");
        DistinctTest supplier3 = supplier.get();
        supplier3.setA("2");
        supplier3.setB("2");
        DistinctTest supplier4 = biFunction.apply("4","4");
        List<DistinctTest> distinctTestList = Arrays.asList(supplier1,supplier2,supplier3,supplier4);
        //long count = distinctTestList.stream().map(distinctTest->distinctTest.getA()).distinct().count();
        //System.out.println(count);
        //List<DistinctTest> distinctTestList2 = distinctTestList.stream().map(distinctTest->distinctTest.getA()).distinct().collect(Collectors.toList());
        List<DistinctTest> distinctTestList2 = distinctTestList.stream()
                .collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(distinctTest -> distinctTest.getA()+distinctTest.getB()))), ArrayList::new));
                //.forEach(System.out::println);
        distinctTestList2.forEach(System.out::println);
    }
}
