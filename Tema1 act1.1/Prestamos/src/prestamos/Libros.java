package prestamos;
import javax.swing.JOptionPane;
import JOP.JOP;
public class Libros {
   private Libro libros[];
   private int i;
   
    public Libros(int NLibros){
        libros=new Libro[NLibros];
        this.i=-1;  
    }
    
    public Libro[] getLibros(){
        return libros;
    }

    private Libro creaLibro(){
        String Cid, autor, titulo,Npag;
        Cid=JOP.inicializar("Codigo de identificacion?");
        autor=JOP.inicializar("Autor?");
        titulo=JOP.inicializar("Titulo?");
        Npag=JOP.inicializar("Numero de paginas?");
        return new Libro(titulo, Cid,autor,Npag);
    }
    
    public void alta(){
        if(i<libros.length-1){
            libros[++i]=creaLibro();
        }else{
        JOptionPane.showMessageDialog(null,"Prestamos maximos alcanzados!!");
        }
    }
    
    public void muestra(){
        for(int j=0; j<=i; j++){
            JOptionPane.showMessageDialog(null,this.libros[j].getDatosLibro());
        }
    }
    
    public void elimina(){
        try{
            this.libros[i]=null;
            i--;
        }catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null,"La posicion no existe!!");
        }
    }
    
    public void elimina(int posicion){
        if(posicion<=i && posicion>=0){
            while(posicion<i){
                this.libros[posicion]=this.libros[posicion+1];
                posicion++;
            }
            elimina();
        }
        else{
            JOptionPane.showMessageDialog(null,"Esa posicion no existe!!");
        }
    }
    
    public Libro BuscaLibro(int cId){
        int k=0;
        while(k<=i){
            if(libros[k].getCid().equals(cId)){
                return libros[k];
            }
            k++;
        }
        return null;
    }
    
}
    
    

