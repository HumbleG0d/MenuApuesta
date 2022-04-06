
package clases;

public class RegisterAdd {
    
    String nombre;
    String apellido;
    double yape;
    int numero;
    int ID;
    
    public RegisterAdd(){
        nombre = "";
        apellido = "";
        yape = 0;
        numero = 0;
    }
    
    public RegisterAdd(int ID){
        this.ID = ID;
    }
    
    public String getName(){
        return nombre;
    }
    public void setName(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public double getYape(){
        return yape;
    }
    public void setYape(double yape){
        this.yape = yape;
    }
    
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
}
