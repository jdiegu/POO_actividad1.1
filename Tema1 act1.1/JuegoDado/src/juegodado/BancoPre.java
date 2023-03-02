package juegodado;

public class BancoPre {
    String Pre[]={"1+1","5+6","Paradigma que usa objetos","Es una plantilla que describe el comportamiento de un objeto","3x3?","raiz de 4?","0^0?","2x2x2?","Año en que se hundio el titanic?","Primer numero primo?","Pesa lo mismo un kilo de clavos que un kilo de plumas","Que fue primero el huevo o la Gallina?"};
    String Res[]={"2","11","POO","clase","9","2","1","8","1912","2","si","la gallina"};
    
    public BancoPre(){ 
    }
    
    public String getPre(int i){
    return Pre[i];
    }
    
    public String getRes(int i){
    return Res[i];
    }
}
