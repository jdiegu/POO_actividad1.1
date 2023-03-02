package prestamos;
import JOP.JOP;
import javax.swing.JOptionPane;

public class Revistas {
    private Revista revistas[];
    private int i;
    
    public Revistas(int NRev){
        revistas=new Revista[NRev];
        this.i=-1;
    }
    
    public Revista[] getRevistas(){
        return revistas;
    }
    
    public void alta(){
        if(i<this.revistas.length-1){
            revistas[i]=CreaRevista();
        }else{
            JOptionPane.showMessageDialog(null,"El vector esta lleno!!");
        }
    }
    
    public Revista CreaRevista(){
        String tit, autor, cid;
        tit=JOP.inicializar("Titulo??");
        autor=JOP.inicializar("Autor??");
        cid=JOP.inicializar("Fecha??");
        return new  Revista(cid, tit, autor);
    }
    
    public void muestra(){
        for(int f=0; f<i; f++){
            JOptionPane.showMessageDialog(null, this.revistas[f].getDatosRevista());
        }
    }
    
    public void elimina(){
        try{
            this.revistas[i]=null;
            i--;
        }catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null,"La posicion no existe");
        }
    }
    
    public void elimina(int posicion){
        if(posicion<=i && posicion>=0){
            while(posicion<1){
                this.revistas[posicion]=this.revistas[posicion+1];
                posicion++;
            }
            elimina();
        }
        else{
            JOptionPane.showMessageDialog(null,"Esa posicion no existe!!");
        }
    }
    
    public Revista buscaRevista(int cId){
        int k=0;
        while(k<=i){
            if(this.revistas[k].equals(cId)){
                return revistas[k];
            }
            k++;
        }
        return null;
    }
}
