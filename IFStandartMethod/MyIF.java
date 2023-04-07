package IFStandartMethod;

public interface MyIF {
    int getNumber();

    default String getString(){
        return "Это простая строка";
    }
}
