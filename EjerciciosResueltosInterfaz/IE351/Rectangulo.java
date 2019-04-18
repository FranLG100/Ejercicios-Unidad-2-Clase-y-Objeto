package IE351;

public class Rectangulo {
    double base;
    double altura;
    
    public Rectangulo(){
        base = 100;
        altura = 50;
    }
    
    public void setBase(double base){
        this.base = base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }
    public String getArea(){
        return "Area: "+base*altura +" m cuadrados";
    }
    public String getPerimetro(){
        return "Perimetro: "+((base*2)+(altura*2)) +"m";
    }
    
    public void cuadrar(){
        this.altura=this.base;
    }
}
