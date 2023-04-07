package Stack;
//тестирование DynStack
public class IFTest2 {
    public static void main(String[] args) {
        DynStack dynStack1 = new DynStack(5);
        DynStack dynStack2 = new DynStack(8);

        for (int i=0; i<12; i++) dynStack1.push(i);
        for (int i=0; i<12; i++) dynStack2.push(i);

        System.out.println("Стек dynStack1 = ");
        for (int i=0; i<12; i++) System.out.print(dynStack1.pop() + " | ");

        System.out.println("\nСтек dynStack2 = ");
        for (int i=0; i<20; i++) System.out.print(dynStack2.pop() + " | ");
    }
}
/*
Стек dynStack1 =
11 | 10 | 9 | 8 | 7 | 6 | 5 | 4 | 3 | 2 | 1 | 0 |
Стек dynStack2 =
11 | 10 | 9 | 8 | 7 | 6 | 5 | 4 | 3 | 2 | 1 | 0 |
Стек пуст
0 |
Стек пуст
0 |
Стек пуст
0 |
Стек пуст
0 |
Стек пуст
0 |
Стек пуст
0 |
Стек пуст
0 |
Стек пуст
0 |
 */