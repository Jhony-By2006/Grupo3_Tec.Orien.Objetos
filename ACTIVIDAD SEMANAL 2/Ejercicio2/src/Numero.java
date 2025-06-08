public class Numero {
    private double numeroReal;

    public Numero(double numeroReal){
        this.numeroReal = numeroReal;
    }
    public double getNumeroReal() {
        return numeroReal;
    }

    public void setNumeroReal(double numeroReal) {
        this.numeroReal = numeroReal;
    }
    public double raizCuadrada(){
        return numeroReal * numeroReal;
    }
    public double calcularcubo(){
        return numeroReal * numeroReal * numeroReal;
    }

}
