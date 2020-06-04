/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author JaimeGarcia99
 */
public class Cliente {
    private String id;
    private String nombre;
    private double saldo;

    public Cliente(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public Cliente(String id, String nombre, double saldo) {
        this(id, nombre);
        this.saldo = saldo;
    }
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
