package mypack;
// просто так ))
public class Demo {
    public static void main(String[] args) {
        System.out.println("Аргументов = " + args.length);

        p1.Demo demo1 = new p1.Demo();
        demo1.main(args);

        p2.Demo demo2 = new p2.Demo();
        demo2.main(args);
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
Аргументов = 0
 */