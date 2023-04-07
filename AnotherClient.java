public class AnotherClient implements Callback{

    @Override
    public void callback(int param) {
        System.out.println("Еще одна версия callback()");
        System.out.println("param в квадрате = " + (param * param));
    }
}
