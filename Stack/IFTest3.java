package Stack;
//тестирование FixedStack и DynStack через ссылку на интерфейс
public class IFTest3 {
    public static void main(String[] args) {
        IntStack intStack;
        FixedStack fixedStack = new FixedStack(8);
        DynStack dynStack = new DynStack(5);

        intStack = fixedStack;
        for (int i=0; i<8; i++) intStack.push(i);
        System.out.println("Данные в фиксированном стеке");
        for (int i = 0; i <8; i++) System.out.print(intStack.pop() + " | ");

        intStack = dynStack;
        for (int i=0; i<12; i++) intStack.push(i);
        System.out.println("\nДанные в динамическом стеке");
        for (int i = 0; i <12; i++) System.out.print(intStack.pop() + " | ");
    }
}
/*
Данные в фиксированном стеке
7 | 6 | 5 | 4 | 3 | 2 | 1 | 0 |
Данные в динамическом стеке
11 | 10 | 9 | 8 | 7 | 6 | 5 | 4 | 3 | 2 | 1 | 0 |
 */