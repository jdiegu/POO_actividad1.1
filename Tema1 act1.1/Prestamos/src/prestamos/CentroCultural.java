package prestamos;
import salida.JOPIS;
import JOP.JOP;
import salida.Menu;
public class CentroCultural {
    String opciones[]={"Insertar","Consultar","Modificar","Elimina Ultimimo","Elimina","Regresar"};
    
    public void crudLibros(Libros opLibros){
        int op=0;
        do {            
            op=Menu.menuBotones(opciones,"Menu libros");
            
            switch(op){
                case 0->opLibros.alta();
                case 1->opLibros.muestra();
                case 2 -> {
                    int modi=JOP.entero("Que posicion desea modificar??");
                    opLibros.BuscaLibro(modi);
                }
                case 3->opLibros.elimina();
                case 4-> {
                int p=JOP.entero("Que posicion desea eliminar");
                opLibros.elimina(p);
                }       
            }
        }while (op!=5);
    }
    
    public void crudRevistas(Revistas opRevistas){
        int op=0;
        do {            
            op=Menu.menuBotones(opciones,"Menu revistas");
            
            switch(op){
                case 0->opRevistas.alta();
                case 1->opRevistas.muestra();
                case 2 -> {
                    int modi=JOP.entero("Que posicion desea modificar??");
                    opRevistas.buscaRevista(modi);
                }
                case 3->opRevistas.elimina();
                case 4-> {
                int p=JOP.entero("Que posicion desea eliminar");
                opRevistas.elimina(p);
                }       
            }
        }while (op!=5);
    }
    
    public void ctrPeticiones(Libros vecL, Revistas vecR){
        String opPrincipal[]={"Libro", "Revistas", "Terminar"};
        int op=0;
        Cliente cte=creaCliente();
        ControlP Administrar=new ControlP(vecL,vecR);
        
        do {            
            op=Menu.menuBotones(opPrincipal,"Que desea solicitar\n");
            
            switch(op){
                case 0->Administrar.ctrLibros(cte);
                case 1->Administrar.ctrRevistas(cte);
            } 
        } while (op!=2);
    }
    
    public void MenuP(){
        String opPrincipal[]={"Libro", "Revista","Prestamo","Terminar"};
        int op=0;
        Libros vecL=new Libros(5);
        Revistas vecR=new Revistas(5);
        
        do {            
            op=Menu.menuBotones(opPrincipal, "Menu principal");
            
            switch(op){
                case 0->crudLibros(vecL);
                case 1->crudRevistas(vecR);
                case 2->ctrPeticiones(vecL,vecR);
            }
        } while (op!=3);
    }
    
    public Cliente creaCliente(){
        String Nc=JOP.inicializar("Numero de control?");
        String Nom=JOP.inicializar("Nombre del cliente?");
        
        return new Cliente(Nc,Nom);
    }
    
    public static void main(String[] args) {
        CentroCultural centro=new CentroCultural();
        centro.MenuP();
    }
}