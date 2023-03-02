package prestamos;

public class Cliente {
    private String NContro, Nom;
    private Peticiones peticion[];

    public Cliente(String NContro, String Nom) {
        this.NContro = NContro;
        this.Nom = Nom;
    }
    private int peticionesT;

    public String getNContro() {
        return NContro;
    }

    public String getNom() {
        return Nom;
    }

    public Peticiones[] getPeticion() {
        return peticion;
    }

    public int getPeticionesT() {
        return peticionesT;
    }

    public void setNContro(String NContro) {
        this.NContro = NContro;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setPeticion(Peticiones[] peticion) {
        this.peticion = peticion;
    }

    public void setPeticionesT(int peticionesT) {
        this.peticionesT = peticionesT;
    }
    
    public Cliente(String NContro, String Nom, Peticiones[] peticion, int peticionesT) {
        this.NContro = NContro;
        this.Nom = Nom;
        this.peticion = peticion;
        this.peticionesT = peticionesT;
    }

    public Cliente() {
    }
    
    public String getDatosCliente(){
        String ms="Numero de control: " +getNContro() +"\n";
        ms+="Nombre: " +getNom();
        
        return ms;
    }
    
    public boolean InsertaPeticion(Peticiones peticion){
        if(peticionesT < this.peticion.length){
            this.peticion[++peticionesT]=peticion;
            return true;
            
        }else    {return false;}
    }
}
