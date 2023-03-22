public class Dancer extends Person {
    public Dancer() {
    }
    public Dancer(String name) {
        super(name);
    }


    @Override
    public void walk(String name) {
        System.out.println("Танцор" +name+ "танцует в парке");
    }

    @Override
    public String toString() {
        return "Dancer{} " + super.toString();
    }
}
