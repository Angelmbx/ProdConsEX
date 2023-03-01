public class Consumidor extends Thread {

    Recipiente reci = new Recipiente();

    public Consumidor(Recipiente reci) {
        this.reci = reci;
    }

    @Override
    public void run() {
        String texto;
        char [] caracteres;
        do {
            texto = reci.leer();
            if (texto != "*"){
                texto = texto.toUpperCase();
                caracteres= texto.toCharArray();
                for (int i =0; i<caracteres.length; i++){
                    System.out.println(caracteres[i]);
                }
            }

        } while (!texto.equals("*"));
    }
}
