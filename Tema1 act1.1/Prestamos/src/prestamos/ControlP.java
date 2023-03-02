package prestamos;
import salida.JOPIS;
import JOP.JOP;
import javax.swing.JOptionPane;
import salida.Menu;
public class ControlP {
    String OpPeticiones[]={"Solicitar","Devolver","Regresar"};
    Libros vLibros;
    Revistas vRevistas;

    public ControlP(Libros vLibros, Revistas vRevistas) {
        this.vLibros = vLibros;
        this.vRevistas = vRevistas;
    }
    
    public Fecha creFecha(String msg){
        byte d,m;
        int a;
        
        d=JOP.byteEntero("Dame el dia:");
        m=JOP.byteEntero("Dame el mes:");
        a=JOP.entero("Dame el año:");
        
        return new Fecha(d,m,a);
    }
    
    public void insertaPeticion(Cliente cliente, Peticiones peticion){
        if(cliente.InsertaPeticion(peticion)){
            JOptionPane.showMessageDialog(null,"Se presto el libro");
        }else{
            JOptionPane.showMessageDialog(null,"No esta disponible");
        }
    }
    
    public void solicitaLibro(Cliente cte){
        int numL=JOP.entero("Dame el numero del libro");
        Libro ficha=null;
        
        if((ficha=vLibros.BuscaLibro(numL))!=null){
            Fecha fechaI=creFecha("Fecha inicio");
            Fecha fechaF=creFecha("Fecha final");
            
            Peticiones peticion= new Peticiones(fechaI,fechaF,null,ficha);
            insertaPeticion(cte,peticion);
        }
    }
    
    public void ctrLibros(Cliente cte){
        int opciones;
        
        do {         
            opciones=Menu.menuBotones(OpPeticiones, "Que desea hacer??");
            switch(opciones){
                case 0->solicitaLibro(cte);
                case 1->devuelveLibro();
            } 
        } while (opciones!=2);
    }
    
    public void devuelveLibro(){
    
    }
    
    public void solicitaRevista(Cliente cte){
        int numR=JOP.entero("Dame el numero de la revista");
        Revista ficha=null;
        
        if((ficha=vRevistas.buscaRevista(numR))!=null){
            Fecha fechaI=creFecha("Fecha inicio");
            Fecha fechaF=creFecha("Fecha final");
            
            Peticiones peticion= new Peticiones(fechaI,fechaF,ficha,null);
            insertaPeticion(cte,peticion);
        }
    }
    
    public void ctrRevistas(Cliente cte){
        int opciones;
        
        do {         
            opciones=Menu.menuBotones(OpPeticiones, "Que desea hacer??");
            switch(opciones){
                case 0->solicitaRevista(cte);
                case 1->devuelveRevista();
            } 
        } while (opciones!=2);
    }
    
    public void devuelveRevista(){
        
    }
    
}
