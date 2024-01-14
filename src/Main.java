import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! It's my HW_4");
        // Задача 1
        int age = 19;
        if (age >= 18) {
            System.out.println("Ты достиг совершеннолетия, тебе " + age + " лет/год/года, это больше чем 18 лет");
        } else {
            System.out.println("Ты не достиг совершеннолетия, тебе " + age + " лет/год/года, нужно подождать до 18 лет");
        }
        // Задача 2
        int temperature = 7;
        if (temperature > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки, температура на улице " + temperature + " градус(а,ов) Цельсия");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку, температура на улице " + temperature + " градус(а,ов) Цельсия");
        }
        // Задача 3
        int speed = 62;
        if (speed > 60) {
            System.out.println("Текущая скорость составляет " + speed + " км/час. Нарушение скоростного режима в населенном пункте (> 60 км/час). Вам прийдется заплатить штраф!");
        } else {
            System.out.println("Текущая скорость составляет " + speed + " км/час. Нарушения скоростного режима в населенном пункте (> 60 км/час) нет.");
        }
        //Задача 4
        int agePerson = 4;
        if (agePerson >= 2 && agePerson <= 6) {
            System.out.println("Если возраст человека составляет " + agePerson + " лет/год/года, то ему нужно ходить в детский сад");
        } else if (agePerson >= 7 && agePerson <= 17) {
            System.out.println("Если возраст человека составляет " + agePerson + " лет/год/года, то ему нужно ходить в школу");
        } else if (agePerson >= 18 && agePerson <= 24) {
            System.out.println("Если возраст человека составляет " + agePerson + " лет/год/года, то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека составляет " + agePerson + " лет/год/года, то ему нужно ходить на работу");
        }
        // Задача 5
        int ageKid = 3;
        if (ageKid >= 2 && ageKid < 5) {
            System.out.println("Возраст ребенка составляет " + ageKid + " года. Ему нельзя кататься на аттракционе!");
        } else if (ageKid >= 5 && ageKid <= 14) {
            System.out.println("Возраст ребенка составляет " + ageKid + " лет. Ему можно кататься на аттракционе только в сопровождении взрослого!");
        } else if (ageKid > 14 && ageKid < 18) {
            System.out.println("Возраст ребенка составляет " + ageKid + " лет. Ему можно кататься на аттракционе без сопровождении взрослого!");
        } else {
            System.out.println("Возраст человека составляет " + ageKid + " лет/год/года. Он слишком взрослый для аттракциона");
        }
        //Задача 6
        int seatNumberInTheCarriage = 12;
        if (seatNumberInTheCarriage >= 1 && seatNumberInTheCarriage <= 60) {
            System.out.println("Ваше место в вагоне № " + seatNumberInTheCarriage + ", сидячее. Еще есть места");
        } else if (seatNumberInTheCarriage > 60 && seatNumberInTheCarriage <= 102) {
            System.out.println("Ваше место в вагоне № " + seatNumberInTheCarriage + ", стоячее. Еще есть места");
        } else {
            System.out.println("Вы пытаетесь купить место под номером " + seatNumberInTheCarriage + ". Пассажировместимость вагона 102 чел. Все места в вагоне заняты. Возьмите билет на следующий рейс");
        }
        //Задача 7
        int one = 15;
        int two = 25;
        int three = 19;
        if (one > two && one > three) {
            System.out.println("Наибольшее число " + one);
        } else if (two > one && two > three) {
            System.out.println("Наибольшее число " + two);
        } else if (three > one && three > two) {
            System.out.println("Наибольшее число " + three);
        } else if (one == two && one >= three) {
            System.out.println("Наибольшее число " + one);
        } else if (two == three && two >= one) {
            System.out.println("Наибольшее число " + two);
        } else if (three == one && three >= two) {
            System.out.println("Наибольшее число " + three);
        }

    }
}
