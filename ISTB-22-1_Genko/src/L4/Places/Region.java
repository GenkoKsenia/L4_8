package L4.Places;

import java.util.ArrayList;
import java.util.Scanner;
public class Region {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList <Place> places = new ArrayList();

    public static void add(Place p)
    {
        places.add(p);
    }
    public static void print()
    {   for(Place p : places) {
            p.report();
        }
    }

    public static void search()
    {
        System.out.println("Введите название места:");
        String name_s = scanner.next();
        boolean one = false;
        for(Place p : places) {
            if (p.name.equals(name_s)){
                p.report();
                one = true;
            }
        }
        if(!one){
            System.out.println("Место не найдено");
        }
    }
    public static void delete()
    {
        System.out.println("Введите название места:");
        String name_s = scanner.next();
        boolean  one = false;

        for (int i = 0; i < places.size(); i++) {
            if (places.get(i).name.equals(name_s)) {
                places.remove(places.get(i));
                one = true;
            }
        }
        if(!one){
            System.out.println("Место не найдено");
        }
    }
}
