public class Main {
    public static void main(String[] args) {
        //en una tienda de venta de celulares se requiere llevar el control de los smartphones
        // que tienen a la venta requiriendo validar que el tipo de celular
        // sea "gamma alta","gamma media","gamma baja"

        Celular celular = new Celular();
        celular.setGamma("gamma alta");
        celular.setMarca("Samsung");
        celular.setModelo("Galaxy S21");
        celular.setPrecio(799.99);
        celular.verCelular();
        celular.validarGamma();
        Celular celular2 = new Celular();
        celular2.setGamma("gamma media");
        celular2.setMarca("Xiaomi");
        celular2.setModelo("Redmi Note 10");
        celular2.setPrecio(299.99);
        celular2.verCelular();
        celular2.validarGamma();
        Celular celular3 = new Celular();
        celular3.setGamma("gamma baja");
        celular3.setMarca("Nokia");
        celular3.setModelo("Nokia 5.4");
        celular3.setPrecio(199.99);
        celular3.verCelular();
        celular2.validarGamma();
        //funciona prueba.
    }
}