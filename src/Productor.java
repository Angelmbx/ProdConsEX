import java.util.Scanner;

public class Productor extends Thread {

    Scanner sc =new Scanner(System.in);
    Recipiente reci= new Recipiente();

    public Productor(Recipiente reci) {
        this.reci = reci;
    }

    @Override
    public void run() {
        String cosas;

        do {
            System.out.println("(* = SALIR) Escriba cosas: ");
            cosas = sc.nextLine();

            reci.escribir(cosas);
        } while (!cosas.equals("*"));

    }
}
