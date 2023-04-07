package Stack;
//тестирование FixedStack
public class IFTest {
    public static void main(String[] args) {
        FixedStack fixedStack1 = new FixedStack(5);
        FixedStack fixedStack2 = new FixedStack(8);

        for (int i=0; i<5; i++) fixedStack1.push(i);
        for (int i=0; i<8; i++) fixedStack2.push(i);

        System.out.println("Стек fixedStack1 = ");
        for (int i=0; i<5; i++) System.out.print(fixedStack1.pop() + " | ");

        System.out.println("\nСтек fixedStack2 = ");
        for (int i=0; i<8; i++) System.out.print(fixedStack2.pop() + " | ");
    }
}
/*
Стек fixedStack1 =
4 | 3 | 2 | 1 | 0 |
Стек fixedStack2 =
7 | 6 | 5 | 4 | 3 | 2 | 1 | 0 |
 */