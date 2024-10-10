package valoresenumados;

import valoresenumados.Automovil.tipoAuto;
import valoresenumados.Automovil.tipoCom;

public class PruebaAutomovil {
    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Mazda", 2024, 280, tipoCom.GASOLINA, tipoAuto.SUV);
        auto1.imprimir();
        auto1.setVelocidadActual(100);
        System.out.println("velocidad Actual = " +auto1.velocidadActual+ " km/h");
        auto1.acelerar(20);
        System.out.println("velocidad Actual = " +auto1.velocidadActual+ " km/h");
        auto1.desacelerar(50);
        System.out.println("velocidad Actual = " +auto1.velocidadActual+ " km/h");
        auto1.frenar();
        System.out.println("velocidad Actual = " +auto1.velocidadActual+ " km/h");
        auto1.desacelerar(10);
        System.out.println("velocidad Actual = " +auto1.velocidadActual+ " km/h");



    }
    
}
