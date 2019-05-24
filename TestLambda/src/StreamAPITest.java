import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamAPITest {
    public static void main(String[] args) {
        List<String> list =  Arrays.asList("a","","bc","ef","","123");
        List<String> list2 = list.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
        System.out.println("筛选列表: " + list2);
        list2.forEach(System.out::println);
        List<String> list3 = list.stream().filter(x -> !x.isEmpty()).map(y->y.toUpperCase()).collect(Collectors.toList());
        System.out.println("筛选列表: " + list3);

        long count = list.stream().filter(x -> !x.isEmpty()).count();
        System.out.println("count:"+count);

        Predicate<String> predicate1 = x -> !x.isEmpty();
        long count1 = list.stream().filter(predicate1).count();
        System.out.println("count1:"+count1);

    }

}
