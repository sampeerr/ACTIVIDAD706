public class TrianguloEquilatero {
    private double lado;

    public double getRadio() {
        return lado;
    }
    public void setRadio(double radio) {
        this.lado = radio;
    }
    
    public double area(){
        return (Math.sqrt(Math.pow(lado, 2)-Math.pow(lado/2, 2)*lado)/2);
    }
}
