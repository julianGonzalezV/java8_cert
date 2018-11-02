package co.book.chapter2_design_patterns.creational_patterns.d_factory;

public class Hay extends Food {
    /**
     * Es buena practica dejarlo default porque el acceso sería a nivel de paquete
     * así evitamos que desde otros paquetes intenten crear instancias de esta clase
     *
     * NO puede ser privado porque sino el FoodFactory no podrpia instancias objecto de esta
     * clase
     * @param quantity
     */
    Hay(int quantity) {
        super(quantity);
    }
    @Override
    public void consumed() {
        System.out.println("Hay eaten: "+getQuantity());
    }
}
