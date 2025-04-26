public class Auto {
    public class Motor {
        private String tipo;

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public Motor(String tipo) {
            this.tipo = tipo;
        }

        public void mostrarContenido(){
            if (tipo.equalsIgnoreCase("V8")) {
                System.out.println("El motor es eléctrico, es tipo: " + tipo);
            } else {
                System.out.println("El carro no es eléctrico, es de tipo: " + tipo);
            }
        }
    }
}
