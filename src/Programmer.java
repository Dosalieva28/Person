public class Programmer extends Person {
    public Programmer(String name) {
        super(name);
    }

    public Programmer() {
    }

    @Override
    public void walk(String name) {
        System.out.println("Программист" + name+ "пишет код");
    }

    @Override
    public String toString() {
        return "Programmer{} " + super.toString();
    }
}
