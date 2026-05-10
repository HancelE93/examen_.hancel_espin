package com.krakedev.vendedor.test;

import com.krakedev.vendedor.entidades.AdminVentas;
import com.krakedev.vendedor.entidades.Vendedor;
import com.krakedev.vendedor.entidades.VendedorComision;
import com.krakedev.vendedor.entidades.VendedorMixto;

public class TestAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdminVentas ad = new AdminVentas();
		Vendedor v = new Vendedor("111","V");
		VendedorComision vc =new VendedorComision("222","C");
		VendedorMixto vm = new VendedorMixto("333","M");
	
        v.setSueldoFijo(500);

        vc.setNumeroVentas(10);
        vc.setComisionPorVenta(20);

        vm.setSueldoFijo(500);
        vm.setNumeroVentas(5);

      
        ad.agregar(v);
        ad.agregar(vc);
        ad.agregar(vm);

 
        System.out.println(ad.calcularSueldo("111"));
        System.out.println(ad.calcularSueldo("222"));
        System.out.println(ad.calcularSueldo("333"));

       
        System.out.println(ad.calcularSueldo("999"));
    }
}