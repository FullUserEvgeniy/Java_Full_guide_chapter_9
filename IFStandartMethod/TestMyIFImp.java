package IFStandartMethod;

public class TestMyIFImp {
    public static void main(String[] args) {
        MyIF myIF = new MyIFImp();
        System.out.println(myIF.getNumber()); // вызывает переопределенный метод в классе
        System.out.println(myIF.getString()); //вызывает метод default getString()

        MyIF myIF1 = new MyIFImp2();
        System.out.println(myIF1.getNumber());
        System.out.println(myIF1.getString());//переопределенный метод getString()
    }
}
/*
100
Это простая строка
100
Переопределенный метод getString() в классе
 */