public class Main {
    public static void main(String[] args) {System.out.println("Домашняя работа УСЛОВНЫЕ ОПЕРАТОРЫ");
        System.out.println("Задание 1");
        //Задание 1
        //С помощью условного оператора напишите программу, которая выводит в консоль:
        //поздравление пользователя с совершеннолетием, если ему равно или больше 18 лет;
        //информационное сообщение, что возраст совершеннолетия ещё не наступил, и нужно немного подождать.
        byte age = 18;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием! ");
        }
        if (age <18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно еще немного подождать");
        }

        System.out.println("");

        System.out.println("Задание 2");
        //Задание 2
        //Напишите программу, которая выводит в консоль сообщение о том, что:
        //ребенок ходит в школу, если его возраст равен или больше 7 годам
        //человек уже закончил школу и может отправляться в университет, если его возраст 18 и больше;
        //человек окончил университет и ему пора искать первую работу, если ему 24 и больше лет.
        byte ageBaby=26;
       if (ageBaby >= 8) {
           if (ageBaby < 18) {
               System.out.println("Ребенок ходит в школу. ");
           }
       }
           if (ageBaby >= 18) {
               if (ageBaby < 24) {
                   System.out.println("Человек уже закончил школу и может отправляться в университет.");
               }
           }
           if (ageBaby >= 24) {
               System.out.println("Человек окончил университет и ему пора искать первую работу.");
           }
        System.out.println("   ");

        System.out.println("Задание 3");
        //Задание 3
        //Вместимость одного вагона поезда составляет 102 человека.
        // Вагон рассчитан на 60 сидячих мест, все остальные – стоячие.
        //Напишите программу, которая выводит в консоль сообщение о том,
        // есть ли место в вагоне: сидячее или стоячее или вагон уже полностью забит.
        byte totalVanPlace=102;
        byte sedentaryVan=60;
        byte stendingVan= (byte) (totalVanPlace-sedentaryVan);
        byte numberVan=30;
        if (numberVan<=sedentaryVan) {
            System.out.println("В вагоне свободно: "+(sedentaryVan-numberVan)+" сидячих мест, и "+stendingVan+" стояичих мест.");
        }
        if (numberVan>sedentaryVan) {
            if (numberVan < totalVanPlace) {
                System.out.println("В вагоне свободно: " + (totalVanPlace - numberVan) + " стоячих мест.");
            }
        }
        if (numberVan>=totalVanPlace) {
            System.out.println("В вагоне нет свободных мест.");
        }
        System.out.println("   ");

    }
}