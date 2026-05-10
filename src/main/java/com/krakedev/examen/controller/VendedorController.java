package com.krakedev.examen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.examen.entidades.AdminVentas;
import com.krakedev.examen.entidades.Vendedor;
import com.krakedev.examen.entidades.VendedorComision;
import com.krakedev.examen.entidades.VendedorMixto;

@RestController
@RequestMapping("/vendedores")
public class VendedorController {

    private AdminVentas admin = new AdminVentas();

    @PostMapping("/agregar")
    public void agregarVendedor(@RequestBody Vendedor vendedor) {

        Vendedor nuevo = null;

        if (vendedor.getTipo().equals("V")) {
            nuevo = new Vendedor(vendedor.getCedula(), vendedor.getTipo());

        } else if (vendedor.getTipo().equals("C")) {
            nuevo = new VendedorComision(vendedor.getCedula(), vendedor.getTipo());

        } else if (vendedor.getTipo().equals("M")) {
            nuevo = new VendedorMixto(vendedor.getCedula(), vendedor.getTipo());
        }

        nuevo.setNumeroVentas(vendedor.getNumeroVentas());
        nuevo.setSueldoFijo(vendedor.getSueldoFijo());
        nuevo.setComisionPorVenta(vendedor.getComisionPorVenta());

        admin.agregar(nuevo);
    }

    @GetMapping("/sueldo/{cedula}")
    public Double calcularSueldoVendedor(@PathVariable String cedula) {
        return admin.calcularSueldo(cedula);
    }
}