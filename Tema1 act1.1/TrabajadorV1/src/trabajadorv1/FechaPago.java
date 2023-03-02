package trabajadorv1;

public class FechaPago {
    private int año,mes,dia;
    
    public FechaPago(int dia, int mes, int año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;

    }
    public FechaPago(){
        
    }   
    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
}
