class Persona {
    private String nombre;
    private String regimenLaboral;

    public Persona(String nombre, String regimenLaboral) {
        this.nombre = nombre;
        this.regimenLaboral = regimenLaboral;
    }

    public String validarRegimen() {
        if (regimenLaboral.equals("CAS") || regimenLaboral.equals("276") || regimenLaboral.equals("728")) {
            return "El régimen laboral es " + regimenLaboral + ".";
        } else {
            return "El régimen laboral no es válido.";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getRegimenLaboral() {
        return regimenLaboral;
    }
}