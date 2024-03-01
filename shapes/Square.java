public class Square extends Rectangle {
    public Square(){
        
    }

    public Square(double side){
        super(side, side); // Call superclass Rectangle(double, double)
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    @Override
    public String toString() {
        return "A Square with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }

    public double getSide(double side){
        return getWidth();
    }

    public void setSide(double side){
        setWidth(side);
    }

    @Override
    public void setLength(double length) {
        setWidth(length);
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        setLength(width);
        super.setWidth(width);
    }
}
