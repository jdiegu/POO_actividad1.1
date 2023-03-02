package juegodado;
import JOP.JOP;
import javax.swing.JOptionPane;
public class JuegoDado {
    public void Jugar(){
        Dado dado1=new Dado();
        Dado dado2=new Dado();
        
        BancoPre preguntas=new BancoPre();
        int Acierto=0; 
        byte n;
        String respuesta;
        JOptionPane.showMessageDialog(null,"Inicio");
        
        do {   
            n=(byte)(dado1.getTiroDado() + dado2.getTiroDado());
            respuesta=JOP.inicializar(preguntas.getPre(n));
            
            if (respuesta.equalsIgnoreCase(preguntas.getRes(n))) {
            Acierto++;
            JOptionPane.showMessageDialog(null,"Has acertado");        
            } else {
               JOptionPane.showMessageDialog(null,"Gana la ignorancia");
            }
            respuesta=JOP.inicializar("Deseas seguir");
        } while (respuesta.equalsIgnoreCase("si"));
        JOptionPane.showMessageDialog(null, "numero de aciertos: "+Acierto);
    }
    public static void main(String[] args) {
        JuegoDado juego=new JuegoDado();
        juego.Jugar();
    }
    
}
