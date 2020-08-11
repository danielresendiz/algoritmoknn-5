package kmeans5d;

public class Punto {
    private double[] xyz = new double[5];
    private int etiqueta;
    
    public Punto(){
        this.xyz[0]=0;
        this.xyz[1]=0;
        this.xyz[2]=0;
        this.xyz[3]=0;
        this.xyz[4]=0;
    }
    
    public Punto(double... p){
        for(int x=0; x<p.length; x++){
            xyz[x]=p[x];
        }
        etiqueta=-1;
    }
    
    public double get(int i){
        return xyz[i];
    }
    
    public void set(int i,double v){
        xyz[i]=v;
    }

    public double[] getXyz() {
        return xyz;
    }

    public void setXyz(double[] xyz) {
        this.xyz = xyz;
    }

    public int getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(int etiqueta) {
        this.etiqueta = etiqueta;
    }

   
    public String toString() {
        String cad="(";
        for(int x=0; x<5; x++){
            cad+=this.get(x)+", ";
        }
        cad+=")";
        return cad;
    }
   
    
}
