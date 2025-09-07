public class Chelovek11 {
    private String name;
    private int age;

    public Chelovek11(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
    public static void main(String[] args) {

        Chelovek11 chelovek1 = new Chelovek11("Иван", 30);
        Chelovek11 chelovek2 = new Chelovek11("Мария", 25);
        Chelovek11 chelovek3 = new Chelovek11("Петр", 42);

        chelovek1.displayInfo();
        chelovek2.displayInfo();
        chelovek3.displayInfo();
    }
}
