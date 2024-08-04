package telran.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ShapesTest {

  @Test
  public void rectangleTest() {
    Rectangle rectangle = new Rectangle(2, 3);
    assertEquals(10, rectangle.perimetr());
    assertEquals(6, rectangle.square());
  }

  @Test
  public void squareTest() {
    Square square = new Square(5);
    assertEquals(20, square.perimetr());
    assertEquals(25, square.square());
  }

  @Test
  void canvasTest() {
    Canvas canvas = new Canvas();

    Shape rectangle = new Rectangle(10, 5);
    Shape square = new Square(50);

    Canvas canvasWithTwoShapes = new Canvas();
    canvasWithTwoShapes.addShape(rectangle);
    canvasWithTwoShapes.addShape(square);

    canvas.addShape(rectangle);
    canvas.addShape(square);
    canvas.addShape(canvasWithTwoShapes);

    int expectedLength = 3;
    int expectedPerimeter = (rectangle.perimetr() + square.perimetr()) * 2;
    int expectedSquare = (rectangle.square() + square.square()) * 2;

    assertEquals(expectedLength, canvas.shapes.length);
    assertEquals(expectedPerimeter, canvas.perimetr());
    assertEquals(expectedSquare, canvas.square());

  }

  @Test
  void countTest() {
    Canvas canvas = new Canvas();
    Canvas canvasLevel1 = new Canvas();
    Canvas canvasLevel2 = new Canvas();

    Shape rectangle = new Rectangle(10, 5);
    Shape square = new Square(50);

    canvasLevel1.addShape(rectangle);
    canvasLevel1.addShape(square);

    canvasLevel2.addShape(rectangle);
    canvasLevel2.addShape(square);

    canvasLevel1.addShape(canvasLevel2);

    canvas.addShape(rectangle);
    canvas.addShape(square);
    canvas.addShape(canvasLevel1);

    int expectedCount = 6;

    assertEquals(expectedCount, canvas.count());
  }
}
