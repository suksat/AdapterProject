package adapter;

public class Class1 implements Interface1{

    ClassAdapter classAdapter;

    @Override
    public void method1(String var1, String var2) {
        if (var1.equalsIgnoreCase("class1")) {
            System.out.println("Interface1 -> Class1 -> method1 -> "+ var2);
        } else if (var1.equalsIgnoreCase("class2")
                || var1.equalsIgnoreCase("class3")) {
            classAdapter = new ClassAdapter(var1);
            classAdapter.method1(var1, var2);
        } else {
            System.out.println("Not found " + var1);
        }
    }
}
