
import java.util.ArrayList;


public class MainCM {

   
    public static void main(String[] args) {
       int cantidadDeMetros;
       
       Auto a=new Auto("Rojo","ABC123");
       
       a.agregarRueda(new Rueda("fate",28));
       a.agregarRueda(new Rueda("fate",28));
       a.agregarRueda(new Rueda("fate",27));
       a.agregarRueda(new Rueda("fate",27));
        
        a.Avanzar(20);
        
    }
    
    
    
}
