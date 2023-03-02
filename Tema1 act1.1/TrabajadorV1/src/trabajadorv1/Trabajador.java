package trabajadorv1;

public class Trabajador {
    private String app,apm,name;

    public Trabajador(String app, String apm, String name) {
        this.app = app;
        this.apm = apm;
        this.name = name;
    }
    
    public Trabajador() {
    }
    
    public void setApp(String app){
        this.app = app;
    }
    
    public String getApp(){
        return app;
    }
    
    public void setApm(String apm){
        this.apm = apm;
    }
    
    public String getApm(){
        return apm;
    }
    
    public void setName(String name){
        this.name = name;
    }
     
    public String getName(){
        return name;
    }

}
