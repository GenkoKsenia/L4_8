package L4.Places;

public abstract class Place { //супер класс место
    protected String name; //название
    protected double area; //площадь
    protected int population; //население


    public Place(String name, double area, int population) {
        this.name = name;
        this.area = area;
        this.population = population;
    }

    protected abstract void report(); //метод для вывода инфо
}
