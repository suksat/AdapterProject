package adapter;

public class ClassAdapter implements Interface1 {

    Interface2 interface2;

    public ClassAdapter(String var1) {
        if (var1.equalsIgnoreCase("class2")) {
            interface2 = new Class2();
        } else if (var1.equalsIgnoreCase("class3")) {
            interface2 = new Class3();
        }

    }

    @Override
    public void method1(String var1, String var2) {
        if (var1.equalsIgnoreCase("class2")) {
            interface2.method2(var2);
        } else if (var1.equalsIgnoreCase("class3")) {
            interface2.method3(var2);
        }
    }
}
