public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний ");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        int age1 = 33;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то он совершеннолетний ");
        }
        if (age1 < 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("Задача 2.");
        int temperature = 9;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        int temperature1 = 1;
        if (temperature1 >= 5) {
            System.out.println("На улице " + temperature1 + " градусов, можно идти без шапки");
        }
        if (temperature1 < 5) {
            System.out.println("На улице " + temperature1 + " градус, нужно надеть шапку");
        }
        System.out.println("Задача 3.");
        int speed = 89;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        int speed1 = 55;
        if (speed1 >= 60) {
            System.out.println("Если скорость " + speed1 + ", то придется заплатить штраф");
        }
        if (speed1 < 60) {
            System.out.println("Если скорость " + speed1 + ", то можно ездить спокойно");
        }
        System.out.println("Задача 4.");
        int ageHuman = 27;
        if (ageHuman >= 2 && ageHuman <= 6) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в детский сад");
        }
        if (ageHuman >= 7 && ageHuman <= 17) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в школу");
        }
        if (ageHuman >= 18 && ageHuman <= 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то его место в университете");
        }
        if (ageHuman >= 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему пора ходить на работу");
        }
        System.out.println("Задача 5.");
        int childAge = 12;
        if (childAge <= 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        }
        if (childAge >= 5 && childAge <= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то можно кататься на аттракционе в сопровождении взрослого");
        }
        if (childAge >= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println("Задача 6.");
        int peopleInCarriage = 118;
        if (peopleInCarriage >= 1 && peopleInCarriage <= 60) {
            System.out.println("Если человек в вагоне " + peopleInCarriage + ", то есть сидячее место");
        }
        if (peopleInCarriage >= 60 && peopleInCarriage <= 102) {
            System.out.println("Если человек в вагоне " + peopleInCarriage + ", то осталось только стоячее место");
        }
        if (peopleInCarriage >= 102) {
            System.out.println("Мест в вагоне нет");
        }
        System.out.println("Задача 7.");
        int one = 32;
        int two = 1;
        int three = 18;
        if (one > two && one > three) {
            System.out.println("Наибольшее число: " + one);
        } else
            if (two > three) {
                System.out.println("Наибольшее число: " + two);
            } else {
                System.out.println("Наибольшее число: " + three);
        }
    }
}