package calculardistancia;
import JOP.JOP;
public class CalcularDistancia {
    
    public  void muestraDi(){
        Punto puntoA, puntoB;
        
        //puntoA=new Punto(JOP.flotante(""),JOP.flotante(""));
        puntoA=new Punto(3.7F, 4.8F);
        puntoB=new Punto(3.7F, 4.8F);
        Distancia distancia=new Distancia();
        distancia.setPunto1(puntoA);
        distancia.setPunto2(puntoB);
        System.out.println(distancia.getDistancia());
    }
 
    public static void main(String[] args) {
        CalcularDistancia caldis=new CalcularDistancia();
        caldis.muestraDi();
    } 
}
