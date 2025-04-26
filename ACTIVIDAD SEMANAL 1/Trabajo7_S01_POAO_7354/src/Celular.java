public class Celular {
    private String marca;
    private String modelo;
    private String gamma;
    private double precio;

//    public Celular(String marca, String modelo, String gamma, double precio) {
//        this.marca = marca;
//        this.modelo = modelo;
//        this.gamma = gamma;
//        this.precio = precio;
//
//    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getGamma() {
        return gamma;
    }

    public void setGamma(String gamma) {
        this.gamma = gamma;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    void verCelular() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Gamma: " + gamma);
        System.out.println("Precio: " + precio);
    }
    void validarGamma() {
        int valueGama = 0;
        if(gamma == "gamma alta"  || gamma == "gamma media" || gamma == "gamma baja") {
            if (gamma == "gamma alta") {
                System.out.println("Celular de gama alta");
                valueGama = 1;
            } else if (gamma == "gamma media") {
                System.out.println("Celular de gama media");
                valueGama = 2;
            } else if (gamma == "gamma baja") {
                System.out.println("Celular de gama baja");
                valueGama = 3;
            }
        } else {
            System.out.println("Gamma no valida");
        }

    }
}
