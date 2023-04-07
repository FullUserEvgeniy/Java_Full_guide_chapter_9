package p2;

class Protection2 extends p1.Protection{
    Protection2(){
        System.out.println("Конструктор производного класса из другого пакета");
        // System.out.println("n = " + n); ошибка, только из того же класса или класса в пакете
        // System.out.println("n_pri = " + n_pri); ошибка, только из того же класса
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
