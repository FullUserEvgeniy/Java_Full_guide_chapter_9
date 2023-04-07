package p2;

import p1.Protection;

class OtherPackage {
    OtherPackage(){
        p1.Protection p = new Protection();
        System.out.println("Конструктор класса из другого пакета");
        // System.out.println("n = " + p.n); ошибка, только из того же класса или класса в пакете
        // System.out.println("n_pri = " + p.n_pri); ошибка, только из того же класса
        // System.out.println("n_pro = " + p.n_pro); ошибка, только класс, подкласс или пакет
        System.out.println("n_pub = " + p.n_pub);
    }
}
