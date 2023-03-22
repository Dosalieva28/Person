public class Main {
    public static void main(String[] args) {
     Person pr = new Person();
       pr.walk("Jennie");
       Singer sr = new Singer();
       sr.walk("Anelya");
       Dancer dr = new Dancer();
       dr.walk("Danil");
       Programmer pg = new Programmer();
       pg.walk("Adilet");

       Person [] gfg = {pr,sr,dr,pg};
        for (int i = 0; i < gfg.length ; i++) {
            System.out.println(gfg[i].toString());
        }

    }
}