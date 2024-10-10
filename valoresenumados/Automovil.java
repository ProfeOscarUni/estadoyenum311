package valoresenumados;

public class Automovil {
    String marca;
    int modelo;
    int velocidadMaxima;
    int velocidadActual=0;

    enum tipoCom{
        GASOLINA,
        BIOETANOL,
        DIESEL,
        BIODIESEL,
        GAS_NATURAL
    }
    tipoCom tipoCombustible;

    enum tipoAuto{
        CIUDAD,
        COMPACTO,
        SUBCOMPACTO,
        FAMILIAR,
        EJECUTIVO,
        SUV
    }
    tipoAuto tipoAutomovil;
    public Automovil(String marca, int modelo, int velocidadMaxima, Automovil.tipoCom tipoCombustible,
            Automovil.tipoAuto tipoAutomovil) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
    }
    public int getVelocidadActual() {
        return velocidadActual;
    }
    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    void acelerar(int incremento){
        if (velocidadActual+incremento<velocidadMaxima) {
            velocidadActual=velocidadActual+incremento;
        } else {
            System.out.println("No se puede incrementar a una velocidad superio a la máxima del automovil");
        }
    }
    void desacelerar(int decremento){
        if ((velocidadActual-decremento)>0) {
            velocidadActual=velocidadActual-decremento;
        } else {
            System.out.println("No se puede decrementar la velocidad hasta un valor negativo");
        }
    }
    void frenar(){
        velocidadActual=0;
    }
    double calcularTiempoLlegada(int distancia){
        return distancia/velocidadActual;
    }
    void imprimir(){
        System.out.println("Marca = "+marca);
        System.out.println("Modelo = "+modelo);
        System.out.println("Velocidad Máxima = " +velocidadMaxima + " km/h");
        System.out.println("velocidad Actual = " +velocidadActual+ " km/h");
        System.out.println("Tipo de Combustible = " +tipoCombustible);
        System.out.println("Tipo de Automovil = " +tipoAutomovil);
    }
    
 
    

   

    
}