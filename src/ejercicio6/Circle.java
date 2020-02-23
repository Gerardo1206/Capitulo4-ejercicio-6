package ejercicio6;

public class Circle {
    private Double radius;
    private Double diameter;
    private Double area;
    
    public Circle(){
    radius=1.0;
    diameter=radius*2;
    area=(Math.PI)*(Math.pow(radius, 2));
    }

    public void setRadius(Double radius) {
        this.radius = radius;
        diameter=radius*2;
        area=(Math.PI)*(Math.pow(radius, 2));
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", diameter=" + diameter + ", area=" + area + '}';
    }
    
    
    
}
