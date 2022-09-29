public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte age = 5;
        if (age >= 2 && age <= 6) {
            System.out.println("Нужно ходить в школу");
        } else {
            System.out.println("В школу еще рано");
        }
        System.out.println();
        // Задание 2
        // то же самое
        // Задание 3 (Было в ветке 1-3)
        int one = 593071495;
        int two = 52345;
        int three = 42391525;
        if (one > two && one > three) {
            System.out.println(one + " Самое большое число");
        } else { if (two > one && two > three) {
            System.out.println(two + " Самое большое число");
        } else { if (three > one && three > two) {
            System.out.println(three + " Самое большое число");
        }}};

    }
}