import java.util.Arrays;
public class Semya {
    public String name;
    public int age;
    public String doljnost;
    public Semya(String name, int age, String doljnost) {
        this.name = name;
        this.age = age;
        this.doljnost = doljnost;
    }
    public String InformaciyaOChleneSemya(){
        return "Должность: "+this.doljnost+"Имя: "+this.name+"Возраст: "+this.age;
    }
}