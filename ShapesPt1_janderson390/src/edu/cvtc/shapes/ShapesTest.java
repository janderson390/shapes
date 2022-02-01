package edu.cvtc.shapes;

public class ShapesTest {

  // main function
  public static void main(String[] args) {

    // Create Shape objects using the overloaded constructor
    Cuboid cuboid = new Cuboid(12, 10, 4);
    Cylinder cylinder = new Cylinder(15, 12);
    Sphere sphere = new Sphere(20);

    // Display the object's properties and calculated values in
    // a dialog box using the render() method
    cuboid.render();
    cylinder.render();
    sphere.render();

  }

}
