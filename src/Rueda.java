
public class Rueda {
    private String marca;
    private double presion;

    public Rueda(String marca, double presion) {
        this.marca = marca;
        this.presion = presion;
    }

    

    
    
    
    public void inflar(){
        presion=28;
    }
    
    public void pinchar(){
        presion=0;
    }
    
    public void desinflar(){
        presion=presion - 0.5;
    }
}
