package telran.shapes;

public class Canvas implements Shape {
    Shape[] shapes;

    // any shape
    public Canvas() {
        shapes = new Shape[0];
    }

    void addShape(Shape shape) {
        // TODO
    }

    @Override
    public int perimetr() {
        // TODO
        // sum of all included shape perimeters
        throw new UnsupportedOperationException("Unimplemented method 'perimetr'");
    }

    @Override
    public int square() {
        // TODO
        /// sum of all included shape squares
        throw new UnsupportedOperationException("Unimplemented method 'square'");
    }

}
