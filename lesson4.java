public class lesson4 {
    public static boolean isEven(int num) {
        return num % 2 == 0;
        }
   public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
   }

    public static void main(String[] args) {
        int number = 11;
        if (isEven(number) ) {
            System.out.println(number + " - четное число");
        } else {
            System.out.println(number + " - нечетное число");
        }
        int year = 2025;
        if (isLeapYear(year)) {
            System.out.println(year + " год високосный");
        }
        else {
            System.out.println(year + " год не високосный");
        }

    }
}

