package IFStandartMethod;

public class MyIFImp2 implements MyIF{

    @Override
    public int getNumber() {
        return 100;
    }
    @Override
    public String getString(){
        return "Переопределенный метод getString() в классе";
    }
}
