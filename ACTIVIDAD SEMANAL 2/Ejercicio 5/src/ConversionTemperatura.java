public class ConversionTemperatura {
    private double temperaturaC;


    public double getTemperaturaCelsius() {
        return temperaturaC;
    }

    public void setTemperaturaCelsius(double temperaturaCelsius) {
        this.temperaturaC = temperaturaCelsius;
    }

    public ConversionTemperatura(double temperaturaCelsius) {
        this.temperaturaC = temperaturaCelsius;
    }
    public double convertirF() {
        return (temperaturaC * 9 / 5) + 32;
    }
}
