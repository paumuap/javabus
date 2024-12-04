/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tmb;

/**
 *
 * @author pge6971
 */
public class conductor {
    private String nom;
    private int edad;
    private bus busAsignat;
    private semana diaDescans;
    
    public conductor(String nom, int edad){
    this.nom = nom;
    this.edad = edad;
    this.diaDescans = semana.DIUMENGE;
    }
    
    public conductor(String nom, int edad, bus busAsignat, semana diaDescans){
        this.nom = nom;
        this.edad = edad;
        this.busAsignat = busAsignat;
        this.diaDescans = diaDescans;
    }
    
    public void setBus(bus busAsignat){
        this.busAsignat = busAsignat;
    }
    
    public void setDiaDescans(semana diaDescans){
        this.diaDescans = diaDescans;
    }
    
    public boolean equals(Object obj){
        boolean isEqual = false;
        
        if(obj == null){
            isEqual = false;
        }else{
            if(this == obj){
                isEqual = true;
            }else{
                if(obj instanceof conductor other){
                    if(this.nom == other.nom){
                        if(this.edad == other.edad){
                            isEqual = true;
                        }
                    }
                }
            }
        }
        
        
        return isEqual;
    }
    //avancar parada solo podemos desde el conductor , tiene un objeto del tipo bus dentro del objeto Conductor
    //! => this.bus.. == false
    public boolean conducirASeguentParada(){
        boolean paradaFinal = false;
        if(this.busAsignat !=null){
            if(!this.busAsignat.avancarParada()){
            System.out.println("Has arribat al destino final");
            System.out.println(this.busAsignat.getParadaFinal());
            paradaFinal = true;
            }
        }
        return paradaFinal;
        
    } 
    
}


