
package boletin0.pkg5;


public class Boletin05 {

    
    public static void main(String[] args) {
        // instancio obxecto tipo Semaforo
          Semaforo sema1= new Semaforo();
          String valor=sema1.dameCor();
          System.out.println("cor antes darlle un valor "+ valor);
          sema1.ponCor("verde");
          valor=sema1.dameCor();
          System.out.println("cor :"+valor);
    }
    
}
