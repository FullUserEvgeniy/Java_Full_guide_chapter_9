package p1;

public class Demo {
    public static void main(String[] args) {
        Derived derived = new Derived();
        Protection protection = new Protection();
        SamePackage samePackage = new SamePackage();
    }
}
/*
Конструктор базового класса
n = 1
n_pro = 3
n_pri = 2
n_pub = 4
Конструктор производного класса
n = 1
n_pro = 3
n_pub = 4
Конструктор базового класса
n = 1
n_pro = 3
n_pri = 2
n_pub = 4
Конструктор базового класса
n = 1
n_pro = 3
n_pri = 2
n_pub = 4
Конструктор класса из того же пакета
n = 1
n_pro = 3
n_pub = 4
 */