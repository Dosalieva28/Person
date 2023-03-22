public class Person {
    private String name;
    private int age;
    private int rost;
   public void walk(){

   }
    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public  void walk(String name){
         this.name=name;
        System.out.println(name+ "Гуляет");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rost=" + rost +
                '}';
    }
}
