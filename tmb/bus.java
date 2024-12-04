/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tmb;

/**
 *
 * @author pge6971
 */
public class bus {
    private String linea;
    private String paradaInici;
    private String paradaFinal;
    private int numParadas;
    private int paradaActual;
    /*
    en java cuando creamos dos que tienen la misma informacion, la informacion que econtiene los objetos tenemos que comparar
    */
    public bus(String linea, String paradaInici, String paradaFinal){
        this.linea = linea;
        this.paradaInici = paradaInici;
        this.paradaFinal = paradaFinal;
        this.numParadas = 10;
        this.paradaActual = 0;
    }
    
    public String getParadaFinal(){
        return this.paradaFinal;
    }
    
   
    
    public boolean equals(Object obj){
        boolean isEqual = false;
        if(obj == null){
            isEqual = false;
        }else{
            if(this == obj){
                //si es el mismo objeto
                isEqual = true;
            }else{
                if(obj instanceof bus other){
                    //si es del mismo tipo de objeto
                    if(this.linea== other.linea){
                        if(this.paradaInici == other.paradaInici){
                            if(this.paradaFinal == other.paradaFinal){
                            isEqual = true;
                            
                            }
                        }
                    }
                    
                }
            }
        }
        return isEqual;
    }
    
    public boolean avancarParada(){
        //metodo del bus
        boolean haAvancat = true;
        if(this.paradaActual != this.numParadas){
            this.paradaActual += 1;
        }else{
            haAvancat = false;
        }
        
        
        
        return haAvancat;
    }
     
    public boolean haArribatFinal(){
        return (this.paradaActual == this.numParadas);
    }
     
}
