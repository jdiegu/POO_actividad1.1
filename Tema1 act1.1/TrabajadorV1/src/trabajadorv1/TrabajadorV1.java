package trabajadorv1;
import JOP.JOP;
public class TrabajadorV1 {
   
    public DatosLaborales CreaDatosLaborales(){
        String puesto=JOP.inicializar("Cual es el puesto??");
        float sueldo=JOP.flotante("Cuanto gana??");
        
        return new DatosLaborales(puesto, sueldo);
    }
    
    public Trabajador creaTrabajador(){
        String App,Apm,Nom;
        App=JOP.inicializar("Apellido paterno??");
        Apm=JOP.inicializar("Apellido materno");
        Nom=JOP.inicializar("Nombre??");
        
        return new Trabajador(App,Apm,Nom);
    }
    
    public FechaPago creaFechaPago(){
        int dia,mes,año;
        dia=JOP.entero("Dia??");
        mes=JOP.entero("Mes??");
        año=JOP.entero("Año??");
        
        return new FechaPago(dia,mes,año);
    }
    
    public float Descuento(String puesto){
        float des=0;
        
        if(puesto.equalsIgnoreCase("Gerente")){des=.32f;}
        if(puesto.equalsIgnoreCase("Subgerente")){des=.25f;}
        if(puesto.equalsIgnoreCase("Supervisor")){des=.20f;}
        if(puesto.equalsIgnoreCase("Operativo")){des=.16f;}
        
        return des;
    }
    
    public void generaComprobanteDePAgo(){
        DatosLaborales datosLaborales= CreaDatosLaborales();
        Trabajador trabajador= creaTrabajador();
        FechaPago fechaPago= creaFechaPago();
        
        float totalPago = (datosLaborales.getSueldoBase()-(Descuento(datosLaborales.getPuesto())*datosLaborales.getSueldoBase()));
        System.out.println("Trabajador: " +trabajador.getName() +" " +trabajador.getApp() +" " +trabajador.getApp());
        System.out.println("Puesto: " +datosLaborales.getPuesto());
        System.out.println("Sueldo: "+datosLaborales.getSueldoBase());
        System.out.println("Fecha pago: " +fechaPago.getDia()+"/" +fechaPago.getMes()+"/" +fechaPago.getAño());
        System.out.println("Se le aplicara un descuento del: " + (Descuento(datosLaborales.getPuesto())*100)+"%");
        System.out.println("Total a pagar: "+totalPago);
    }
    
    public static void main(String[] args) {
        TrabajadorV1 trabajador= new TrabajadorV1();
        trabajador.generaComprobanteDePAgo();
    }
    
    
}
