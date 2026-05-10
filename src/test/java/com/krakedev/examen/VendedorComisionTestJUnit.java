package com.krakedev.examen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.vendedor.entidades.VendedorComision;

public class VendedorComisionTestJUnit {

	 @Test
	    public void testCalcularSueldo() {

	        // Crear objeto
	        VendedorComision vendedor = new VendedorComision("1723456789","V");

	        // Asignar valores
	        vendedor.setNumeroVentas(10);
	        vendedor.setComisionPorVenta(25.0);

	        // Validar resultado
	        assertEquals(250.0, vendedor.calcularSueldo());
	    }
	}