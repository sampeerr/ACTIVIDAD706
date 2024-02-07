public class Circulo implements ShapeOperable{
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double area(){
        return Math.PI*(radio*radio);
    }

}
