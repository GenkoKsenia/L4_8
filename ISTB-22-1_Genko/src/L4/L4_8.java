package L4;

import L4.Places.Region;
import L4.Places.City;
import L4.Places.Village;

public class L4_8 {
    public static void main(String[] args) {

        //Начальные города и деревни
        Region.add(new City("Иркутск", 280, 611215, "Руслан Николаевич Болотов"));
        Region.add(new City("Ангарск", 294, 221296, "Сергей Анатольевич Петров"));
        Region.add(new City("Тулун", 128, 37842, "Нижегородцев Андрей Артурович"));
        Region.add(new Village("Алзамай", 43, 1242, "Н.Е.Р"));
        Region.add(new Village("Илир", 55, 3032, "Ц.Р.Л"));
        Region.add(new Village("Еланцы", 67, 2532, "Л.П.П"));

        Menu.start();
    }
}