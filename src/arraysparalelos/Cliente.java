/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysparalelos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Juan Maureira && Christopher Hurtado
 */
public class Cliente {
    private String[] rut;
    private String[] nombre;
    private String[] direccion;
    private String[] telefono;

    public void CargarCliente() throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         rut = new String[5];
         nombre= new String[5];
         direccion= new String[5];
         telefono= new String[5];
         
         for(int i=0;i<rut.length;i++){
            System.out.println("Ingrese rut de cliente " + (i+1) +  " : ");
            rut[i]=br.readLine();
            System.out.println("Ingrese nombre de cliente: " + (i+1) +  " : ");
            nombre[i]=br.readLine();
            System.out.println("Ingrese direccion de cliente: " + (i+1) +  " : ");
            direccion[i]=br.readLine();
            System.out.println("Ingrese telefono de cliente: " + (i+1) +  " : ");   
            telefono[i]=br.readLine();
         }
    }

    public void MuestraClientes(){
        for(int i=0; i<5; i++){
            System.out.println("rut cliente " + (i+1) + ": " + rut[i]);
            System.out.println("nombre cliente " + (i+1) + ": " + nombre[i]);
            System.out.println("direccion cliente " + (i+1) + ": " + direccion[i]);
            System.out.println("telefono cliente " + (i+1) + ": " + telefono[i]);
        }
    }

}