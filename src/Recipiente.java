public class Recipiente {

    private boolean disponible=false;
    private String contenido;


    public synchronized String leer (){

        while (!disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Lectura: "+contenido);
        disponible = false;
        notify();

        return  contenido;
    }

    public synchronized void escribir(String texto){

        while(disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        contenido=texto;
        disponible = true;
        System.out.println("Escribe: "+contenido);

        notify();
    }

}
