package com.krakedev.vendedor.entidades;

public class VendedorComision extends Vendedor {


    public VendedorComision(String cedula) {
        super(cedula);
    }

    public double calcularSueldo() {
        return getComisionPorVenta() * getNumeroVentas();
    }

}