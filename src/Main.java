import java.util.Scanner;
public class Main{

    public static void main(String[] args)  {

//2.13.5
        Scanner sc = new Scanner(System.in);
        int shapesArrayLength = Integer.parseInt( sc.nextLine());
        Shape [] shapeArr = new Shape[shapesArrayLength];

        for (int i=0; i<shapesArrayLength; i++){
            String ins = sc.nextLine();
            try{
                shapeArr[i]=Shape.parseShape(ins);
            }
            catch (InvalidShapeStringException e){
                System.out.println(e.getMessage());}
        }
        for (Shape shape:shapeArr ) {
            shape.draw();
        }
    }}