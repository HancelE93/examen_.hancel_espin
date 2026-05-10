package com.krakedev.vendedor.entidades;

import java.util.ArrayList;

public class AdminVentas {

	ArrayList<Vendedor> vendedores;

	public void agregar(Vendedor vendedor) {
		vendedores.add(vendedor);
	}

	   public Double calcularSueldo(String cedula) {

	        for (Vendedor vendedor : vendedores) {

	            if (vendedor.getCedula().equals(cedula)) {
	                return vendedor.calcularSueldo();
	            }
	        }

	        return null;
	    }
	}