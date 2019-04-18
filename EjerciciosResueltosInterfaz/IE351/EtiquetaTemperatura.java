package IE351;

import java.awt.Color;
import javax.swing.JLabel;

public class EtiquetaTemperatura extends JLabel{
    private double temperatura;
    
    public EtiquetaTemperatura(){
        this.setTemperatura(0);
    }
    
    private void setTemperatura(double temp){
        temperatura=temp;
        this.setText(temperatura+"ºC");
    }
    
    public double getTemperatura(){
        return temperatura;
    }
    
    public void mostrarRangoColor(){
        try{
            this.setOpaque(true);
            if(temperatura<0){
                this.setBackground(Color.BLUE);
            }else if(temperatura>=0&&temperatura<10){
                this.setBackground(Color.cyan);
            }else if(temperatura>=10&&temperatura<25){
                this.setBackground(Color.magenta);
            }else if(temperatura>=25&&temperatura<35){
                this.setBackground(Color.orange);
            }else{
                this.setBackground(Color.red);
            }
        }catch(NumberFormatException e){
            this.setOpaque(false);
        }
    }
    
    public void cambiarTemperatura(double temp){
        temperatura=temperatura+temp;
        this.mostrarRangoColor();
        this.setText(temperatura+"ºC");
    }
}
