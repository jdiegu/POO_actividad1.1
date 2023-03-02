package trabajadorv1;

public class DatosLaborales {
    private String puesto;
    private float sueldoBase; 
    
    public DatosLaborales(String puesto, float sueldoBase){
        this.puesto = puesto;
        this.sueldoBase = sueldoBase;
    }
    public DatosLaborales(){
        
    }    
    public void setPuesto(String puesto){
        this.puesto = puesto;
    }
    public String getPuesto(){
        return puesto; 
    }
    
    public void setSueldoBase(float sueldoBase){
        this.sueldoBase = sueldoBase;
    }
    public float getSueldoBase(){
        return sueldoBase; 
    }

}
