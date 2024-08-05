package telran.shapes;

public class Canvas implements Shape {
    Shape[] shapes;

    public Canvas() {
        shapes = new Shape[0];
    }

    void addShape(Shape shape) {
        shapes = telran.util.Arrays.insert(shapes, shapes.length, shape);
    }

    @Override
    public int perimetr() {
        int total = 0;
        for (Shape shape : shapes)
            total += shape.perimetr();
        return total;
    }

    @Override
    public int square() {
        int total = 0;
        for (Shape shape : shapes) {
            total += shape.square();
        }
        return total;
    }

    public int count() {
        int counter = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Canvas) {
                counter += ((Canvas) shape).count();
            }
            counter++;
        }
        return counter;
    }

}
