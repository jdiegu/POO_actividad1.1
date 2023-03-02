package prestamos;

public class Peticiones {
    private Fecha FecI,FecF;
    private Revista revista;
    private Libro libro;

    public void setFecI(Fecha FecI) {
        this.FecI = FecI;
    }

    public void setFecF(Fecha FecF) {
        this.FecF = FecF;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Fecha getFecI() {
        return FecI;
    }

    public Fecha getFecF() {
        return FecF;
    }

    public Revista getRevista() {
        return revista;
    }

    public Libro getLibro() {
        return libro;
    }

    public Peticiones() {
    }

    public Peticiones(Fecha FecI, Fecha FecF, Revista revista, Libro libro) {
        this.FecI = FecI;
        this.FecF = FecF;
        this.revista = revista;
        this.libro = libro;
    }
}
