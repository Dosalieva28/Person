public class Singer extends Person {
    public Singer() {
    }
    public Singer(String name) {
        super(name);
    }


    @Override
    public void walk(String name) {
        System.out.println("Певица" +name+ "поет в театре");
    }

    @Override
    public String toString() {
        return "Singer{} " + super.toString();
    }
}
