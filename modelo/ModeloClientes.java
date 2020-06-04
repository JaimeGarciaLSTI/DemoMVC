/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.HashMap;

/**
 *
 * @author JaimeGarcia99
 */
public class ModeloClientes {
    
    private HashMap clientes;
    
    public ModeloClientes() {
        clientes = new HashMap();
        
        clientes.put("01", new Cliente("01", "Juan", 20_000.00));
        clientes.put("02", new Cliente("02", "Luis", -15_000.00));
        clientes.put("03", new Cliente("03", "Ana", 0.0));
        clientes.put("04", new Cliente("04", "Graciela"));
    }
    
    public boolean esBuenCliente(String id) {
        Cliente c = (Cliente)clientes.get(id);
        
        boolean bueno = false;
        
        if (c != null && c.getSaldo()>=0) {
            bueno = true;
        }
        
        return bueno;
    }
}
