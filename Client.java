public class Client implements Callback{
    @Override
    public void callback(int param) {
        System.out.println("callback() вызывается с " + param);
    }

    void nonIfaceMeth(){ // собственный метод
        System.out.println("Классы реализующие интерфейсы, \nмогут так же определять и другие члены.");
    }
}
// классы реализующие интерфейсы. могут иметь собственные члены класса, поля и методы