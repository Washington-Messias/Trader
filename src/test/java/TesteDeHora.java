/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Windows 7
 */
public class TesteDeHora {

public static void main(String[] args){
    String horas = new CapturandoHora().horas("09:12:25");
    
    System.out.println(horas);
    
    int valor = Integer.valueOf(horas);
    System.out.println(valor);
}
    
}
