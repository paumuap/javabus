/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tmb;

/**
 *
 * @author pge6971
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        bus b1 = new bus("L16", "Hospital d´Hospitalet", "Ciutat de la Justicia");
        bus b2 = new bus("M12","Cornella", "Diagonal");
        conductor c1 = new conductor("Efrem", 54, b1, semana.DIMARTS);
        
        boolean serveiActivo =true;
        while(serveiActivo){
            System.out.println("Conduce a siguiente parada");
            serveiActivo = !c1.conducirASeguentParada();
        }
        
        System.out.println("Gracias por su servicio");
    }
    
}
