package juegodado;
import java.util.Random;
public class Dado {
    
    public Dado(){}
   
    public byte getTiroDado(){
      Random R=new Random();
      return  (byte)(R.nextInt(6)+1);
    }
}
