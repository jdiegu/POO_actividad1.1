package prestamos;

public class Fecha {
    private int d,m,a;

    public Fecha(int d, int m, int a) {
        this.d = d;
        this.m = m;
        this.a = a;
    }

    public Fecha() {
    }

    public void setD(int d) {
        this.d = d;
    }

    public void setM(int m) {
        this.m = m;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getD() {
        return d;
    }

    public int getM() {
        return m;
    }

    public int getA() {
        return a;
    }
    
}
