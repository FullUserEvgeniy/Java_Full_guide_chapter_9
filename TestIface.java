public class TestIface {
    public static void main(String[] args) {
        Callback callback = new Client();
        callback.callback(42);
    }
}
/*
callback() вызывается с 42
 */