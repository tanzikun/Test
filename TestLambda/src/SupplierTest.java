import java.util.function.Supplier;

public class SupplierTest {

    /*
    1.supplier是个接口，有一个get()方法
    2.语法 ：Supplier<TestSupplier> sup= TestSupplier::new;
    3.每次调用get()方法时才创建对象，且返回的对象不一样
     */
    private int age;

    SupplierTest(){
        System.out.println("----------age:"+age+"----------------");
    }

    public static void main(String[] args) {
        Supplier<SupplierTest> supplierTest = SupplierTest::new;
        SupplierTest st = supplierTest.get();
        System.out.println("--------"+st.getAge()+"---------");
        supplierTest.get();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
