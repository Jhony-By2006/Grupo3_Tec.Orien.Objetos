public class Auto {
    private String placa;

    public Auto(String placa) {
        if (placa.length() == 7) {
            this.placa = placa;
        } else {
            System.out.println("Error: La placa debe tener exactamente 7 caracteres.");
            this.placa = "Inválida";
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa.length() == 7) {
            this.placa = placa;
        } else {
            System.out.println("Error: La placa debe tener exactamente 7 caracteres.");
        }
    }

    @Override
    public String toString() {
        return "La placa del Auto='" + placa + "'";
    }
}