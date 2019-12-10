/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysparalelos;
import java.io.IOException;
/**
 *
 * @author juaneduardomaureirallanos
 */
public class ArraysParalelos {
    private String[] Cliente = new String[5];
    private String[] Producto = new String[5];    

    public static void main(String[] args) throws IOException{
        Cliente cl = new Cliente();
        cl.CargarCliente();
        cl.MuestraClientes();
        
    }
}
