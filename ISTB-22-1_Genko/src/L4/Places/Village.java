package L4.Places;

public class Village extends Place { //класс деревня, потомок place
    protected String chief; //старейшина
    public Village(String name, double area, int population, String chief) {
        super(name, area, population);
        this.chief = chief;
    }

    @Override //переопределение метода report класса place
    protected void report() {
        String info = "Деревня " + this.name + ": площадь - " + this.area + " км²" + ", население - " + this.population + ", староста - " + this.chief;
        System.out.println(info);
    }
}
