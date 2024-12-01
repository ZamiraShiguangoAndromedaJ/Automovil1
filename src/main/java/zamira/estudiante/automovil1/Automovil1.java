/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package zamira.estudiante.automovil1;

import zamira.estudiante.automovil1.enumeraciones1.TipoCombustible;
import zamira.estudiante.automovil1.enumeraciones2.TipoAutomovil;
import zamira.estudiante.automovil1.enumeraciones3.TipoColor;
import zamira.estudiante.clases.Automovil;

/**
 *
 * @author user
 */
public class Automovil1 {

    public static void main(String[] args) {
        
        
        System.out.println("---------AUTOMOVIL------------");
        
        Automovil objAutomovil = new Automovil("Toyota", "Pick-ups", "V8", TipoCombustible.Biotenol, TipoAutomovil.Familiar, 4, 6, 225, TipoColor.Azul, 0);
        
        System.out.println("---------Atributos-----------");
        objAutomovil.mostrarAtributos();
        
        
        
    }
}
