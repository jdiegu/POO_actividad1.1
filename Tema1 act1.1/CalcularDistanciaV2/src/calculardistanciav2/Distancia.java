package calculardistanciav2;

public class Distancia {
   private Punto punto1,punto2;

    public Distancia(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public Distancia() {
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }
   
   public float getDistancia(){
       float distancia;
        float dif1=punto2.getx()-punto1.getx();
        float dif2=punto2.getY()-punto1.getY();
        distancia=(float)(Math.sqrt(Math.pow(dif1,2)+Math.pow(dif2, 2)));
        return distancia;
   }
}
