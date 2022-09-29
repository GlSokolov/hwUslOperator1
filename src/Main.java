public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte age1 = 15;
        if (age1 >= 18) {
            System.out.println("Красава");}
        else {
            System.out.println("Возраст еще не наступил, нужно немного подождать");}
        System.out.println();
        // Задание 2
        byte ageChildren = 7;
        byte ageDude = 18;
        byte ageDude2 = 24;
        if (ageChildren >= 7) {
            System.out.println("Rebenok hodit v shkolu");}
        if (ageDude >= 18) {
            System.out.println("Ti uje zakonchil shkolu, idi v unik");}
        if (ageDude2 >= 24) {
            System.out.println("Idi rabotay");}
        System.out.println();
        // Задание 3
        byte vsegoMest = 102;
        byte sidyachih = 60;
        int stoyachih = 42;
        if (sidyachih >= 60) {
            if (stoyachih >= 42)
                System.out.println("К сожалению мест в вагоне нет");}
        if (sidyachih < 60 && stoyachih < 42) {
            System.out.println("Места в вагоне есть на любой выбор");}
        if (sidyachih >= 60){
            if (stoyachih < 42)
                System.out.println("В вагоне остались только стоячие места");}
        if (sidyachih < 60) {
            if (stoyachih >=42)
                System.out.println("В вагоне остались лишь сидячие места");}
    }

}