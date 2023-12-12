package L4.Places;

public class City extends Place { //класс город, потомок place
    protected String head; //мэр

    public City(String name, double area, int population, String head) {
        super(name, area, population);
        this.head = head;
    }


    @Override //переопределение метода report класса place
    protected void report() { //переопределение метода report класса place
        String info = "Город " + this.name + ": площадь - " + this.area + " км²" + ", население - " + this.population + ", мэр - " + this.head;
        System.out.println(info);
    }
}
