package calculardistanciav2;
import javax.swing.JOptionPane;
import JOP.JOP;
public class CalcularDistanciaV2 {
    public Punto creaPunto(String num){
    float x,y;
    x=JOP.flotante("Dame la X");
    y=JOP.flotante("Dame la Y");
    return new Punto(x,y);
    }
    public void calDistancia(){
        Punto puntoA= creaPunto("Primer punto");
        Punto puntoB=creaPunto("Segundo punto");
        Distancia distancia=new Distancia(puntoA,puntoB);
        JOptionPane.showMessageDialog(null,"LA distancia es: "+distancia.getDistancia());
    }
    public static void main(String[] args) {
        
       CalcularDistanciaV2 tester = new CalcularDistanciaV2();
       tester.calDistancia();
       
    }
    
}
