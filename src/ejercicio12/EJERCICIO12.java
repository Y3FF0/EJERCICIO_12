/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author Jeffrey Santiago Navarro Espinosa
 */
public class EJERCICIO12 {

    
    public static void main(String[] args) {
        double horas_semana,pago_hora,por_retencion,Salario_bruto,Salario_neto,Retencion;
        horas_semana=40;
        pago_hora=5000;
        por_retencion= 0.125;
        Salario_bruto=(horas_semana)*5000;
        Retencion=Salario_bruto*por_retencion;
        Salario_neto=Salario_bruto-(Salario_bruto*por_retencion);
        System.out.println("El salario bruto del trabajador seria: "+ Salario_bruto);
        System.out.println("La retencion del trabajador seria: "+ Retencion);
        System.out.println("El salario neto del trabajador seria: "+ Salario_neto);
        
                
        
        
        
        
        
    }
    
}
