//вложенный интерфейс
public class AAA {
    public interface NestedIf{
        boolean isNotNegative(int x);
    }
}
class BBB implements AAA.NestedIf{

    @Override
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
class NestedIf{
    public static void main(String[] args) {
        AAA.NestedIf nif = new BBB();
        if (nif.isNotNegative(10)) System.out.println("10 положительное число");
        if (nif.isNotNegative(-12)) System.out.println("Эта строка не выведется");
    }
}