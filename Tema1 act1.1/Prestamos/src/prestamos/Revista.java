package prestamos;

public class Revista {
private String Cid,tit,Autor;    

    public Revista(String Cid, String tit, String Autor) {
        this.Cid = Cid;
        this.tit = tit;
        this.Autor = Autor;
    }

    public Revista() {
    }

    public void setCid(String Cid) {
        this.Cid = Cid;
    }

    public void setTit(String tit) {
        this.tit = tit;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getCid() {
        return Cid;
    }

    public String getTit() {
        return tit;
    }

    public String getAutor() {
        return Autor;
    }
    
    public String getDatosRevista(){
        String msg="Datos revista";
        msg+="El ID de la revista es: "+this.Cid+"\n";
        msg+="El Titulo de la revista es: "+this.tit+"\n";
        msg+="El autor de le revista es: "+this.Autor+"\n";
        return msg;
    }
    
    public void solicitaLibro(Cliente cte){
//        
    }
}
