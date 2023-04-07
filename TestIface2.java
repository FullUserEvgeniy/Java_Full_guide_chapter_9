public class TestIface2 {
    public static void main(String[] args) {
        Callback callback = new Client();
        AnotherClient anotherClient = new AnotherClient();
        callback.callback(42); //вызываемая версия callback ( ) определяется типом объекта
        callback = anotherClient;
        callback.callback(42);//вызываемая версия callback ( ) определяется типом объекта
    }
}
/*
callback() вызывается с 42
Еще одна версия callback()
param в квадрате = 1764
 */