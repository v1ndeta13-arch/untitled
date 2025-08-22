import java.util.Arrays;
public class SostavSemya {
    public static void main(String[] args) {
        Semya [] Semya = new Semya[4];
        Semya Semya1 = new Semya(Станислав,35,Папа);
        Semya Semya2 = new Semya(Альфия,30,Мама);
        Semya Semya3 = new Semya(Святослава,9,Дочь);
        Semya Semya4 = new Semya(Мирослава,8,Дочь);
Semya[0]=Semya1;
Semya[1]=Semya2;
Semya[2]=Semya3;
Semya[3]=Semya4;
System.out.println("Информация о члене семьи: "+Semya.InformaciyaOChleneSemya);
    }
}
