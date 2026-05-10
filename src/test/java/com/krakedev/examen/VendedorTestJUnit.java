package com.krakedev.examen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.vendedor.entidades.Vendedor;

public class VendedorTestJUnit {

	@Test
    public void testCalcularSueldo() {

        // Crear objeto vendedor
        Vendedor vendedor = new Vendedor("1723456789","V");

        // Asignar sueldo fijo
        vendedor.setSueldoFijo(500.0);

        // Validar resultado esperado
        assertEquals(500.0, vendedor.calcularSueldo());
    }

}
