package com.krakedev.examen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.vendedor.entidades.VendedorMixto;

public class VendedorMixtoTestJUnit {

	@Test
    public void testCalcularSueldo() {

        // Crear objeto
        VendedorMixto vendedor = new VendedorMixto("1723456789","C");

        // Asignar valores
        vendedor.setSueldoFijo(500.0);
        vendedor.setNumeroVentas(10);

        // Validar resultado
        // 500 + (500 * 0.01 * 10) = 550
        assertEquals(550.0, vendedor.calcularSueldo());
    }
}