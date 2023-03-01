public class Main {
    public static void main(String[] args) {

        Recipiente r1 = new Recipiente();
        Productor p = new Productor(r1);
        Consumidor c = new Consumidor(r1);

        p.start();
        c.start();

    }
}