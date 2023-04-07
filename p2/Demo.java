package p2;

public class Demo {
    public static void main(String[] args) {
        Protection2 protection2 = new Protection2();
        OtherPackage otherPackage = new OtherPackage();
    }
}
/*
Конструктор базового класса
n = 1
n_pro = 3
n_pri = 2
n_pub = 4
Конструктор производного класса из другого пакета
n_pro = 3
n_pub = 4
Конструктор базового класса
n = 1
n_pro = 3
n_pri = 2
n_pub = 4
Конструктор класса из другого пакета
n_pub = 4
 */