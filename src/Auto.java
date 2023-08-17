
import java.util.ArrayList;


public class Auto {
    private String color;
    private String patente;
    private double combustible=50;
    private ArrayList<Rueda> ruedas;

    public Auto(String color, String patente) {
        this.color = color;
        this.patente = patente;
        this.ruedas=new ArrayList<>();
    }
    
    public void agregarRueda (Rueda r){
        this.ruedas.add(r);
    }
    

    

   
    
    public void Avanzar(int cantidadDeMetros){
        
       
        double cal; //calculo la cantidad de baterias que gasto al avanzar
        cal= ((cantidadDeMetros*1)/10);
        System.out.println("calculo: "+cal);
        
        
        if (cal<combustible) {
            System.out.println("El Auto avanza "+cantidadDeMetros+" metros");
            combustible= combustible-cal;
            System.out.println("Al auto le queda un total de combustible de: " +combustible);
            
                    
        } else {
            System.out.println("No se puede avanzar por carga insuficiente");
        }
    }
    
    public void Retroceder(int cantidadDeMetros){
        double cal; //calculo la cantidad de baterias que gasto al avanzar
        cal= ((cantidadDeMetros*1)/10);
        System.out.println("calculo: "+cal);
        if (cal<combustible) {
            System.out.println("El Auto retrocede "+cantidadDeMetros+" metros");
            combustible= combustible-cal;
            System.out.println("Al auto le queda un total de combustible de: " +combustible);
                    
        } else {
            System.out.println("No se puede retroceder por carga insuficiente");
        }
    }
    
    public void LlenarTanque(){
        combustible=50;
        System.out.println("El tanque esta lleno");
    }
    
    
}
