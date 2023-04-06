package adapter;

public class Class3 implements Interface2{
    @Override
    public void method2(String var2) {
        System.out.println("Interface2 -> Class3 -> method2 -> " + var2);
    }

    @Override
    public void method3(String var2) {
        System.out.println("Interface2 -> Class3 -> method3 -> " + var2);
    }
}
