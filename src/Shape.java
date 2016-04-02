import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public abstract class Shape implements Drawable {

    private String shapeColor;

    public String getShapeColor() {
        return shapeColor;
    }

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor.toUpperCase();
    }

    @Override
    public String toString() {
        return "Shape color is " + shapeColor;
    }

    public abstract double calcArea();

    //2.13.4
    public static Shape parseShape(String str) throws InvalidShapeStringException {

        Shape result =null;
        StringTokenizer st = new StringTokenizer(str, ":, ");
        String shapeType = st.nextToken();
        switch (shapeType) {
            case "Rectangle":
                try {
                    result = Rectangle.parseRectangle(str);
                } catch (InvalidShapeStringException e) {}
            case "Triangle":
                try {
                    result = Triangle.parseTriangle(str);
                } catch (InvalidShapeStringException e) {
                }
            case "Circle":
                try {
                    result = Circle.parceCircle(str);
                } catch (InvalidShapeStringException e) {
                }

        }
        return result;}

}


