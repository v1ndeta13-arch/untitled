public class lesson13 {
    private static int count = 0;
    private String name;
    public lesson13(String name) {
        this.name = name;
        count++;
    }
    public static int getCount() {
        return count;
    }
    public static void main(String[] args) {
        lesson13 obj1 = new lesson13("Объект 1");
        lesson13 obj2 = new lesson13("Объект 2");
        lesson13 obj3 = new lesson13("Объект 3");
        System.out.println("Количество созданных объектов: " + lesson13.getCount());
    }
}

