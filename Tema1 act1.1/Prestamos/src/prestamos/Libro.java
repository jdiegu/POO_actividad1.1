package prestamos;

public class Libro {
    private String tit, Cid, Autor, pag;

    public void setTit(String tit) {
        this.tit = tit;
    }

    public void setCid(String Cid) {
        this.Cid = Cid;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setPag(String pag) {
        this.pag = pag;
    }

    public String getTit() {
        return tit;
    }

    public String getCid() {
        return Cid;
    }

    public String getAutor() {
        return Autor;
    }

    public String getPag() {
        return pag;
    }

    public Libro() {
    }

    public Libro(String tit, String Cid, String Autor, String pag) {
        this.tit = tit;
        this.Cid = Cid;
        this.Autor = Autor;
        this.pag = pag;
    }
    
    public String getDatosLibro(){
        String msg="Datos libro\n";
        msg+="El ID del lribro es: "+this.Cid+"\n";
        msg+="El Titulo del libro es: "+this.tit+"\n";
        msg+="El autor del libro es: "+this.Autor+"\n";
        msg+="El numero de paginas es: "+this.pag+"\n";
        return msg;
    }
}
