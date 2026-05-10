package com.krakedev.vendedor.entidades;

public class VendedorComision extends Vendedor {


    public VendedorComision(String cedula,String tipo) {
        super(cedula,tipo);
    }

    public double calcularSueldo() {
        return getComisionPorVenta() * getNumeroVentas();
    }

}