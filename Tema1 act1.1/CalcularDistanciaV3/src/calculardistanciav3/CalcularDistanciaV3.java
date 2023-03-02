
package calculardistanciav3;
import JOP.JOP;
import javax.swing.JOptionPane;
public class CalcularDistanciaV3 {
    public Punto creaPunto(String num){
    float x,y;
    x=JOP.flotante("Dame la X");
    y=JOP.flotante("Dame la Y");
    return new Punto(x,y);
    }
    public void calDistancia(){
        Distancia distancia=new Distancia(creaPunto("Primer punto"),creaPunto("Segundo punto"));
        JOptionPane.showMessageDialog(null,"LA distancia es: "+distancia.getDistancia());
    }
    public static void main(String[] args) {
        
       CalcularDistanciaV3 tester = new CalcularDistanciaV3();
       tester.calDistancia();
       
    }
}
