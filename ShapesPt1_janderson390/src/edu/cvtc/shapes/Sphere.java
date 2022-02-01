package edu.cvtc.shapes;

import javax.swing.*;

public class Sphere extends Shape{

  // Properties
  private float radius = 0.0f;

  // Methods

  // gets the radius
  public float getRadius() {
    return this.radius;
  }

  // sets the radius
  private void setRadius(float radius) {
    // Ensure passed value is not negative
    if (radius > 0) {
      this.radius = radius;
    }
  }

  // Abstract Methods

  // Calculate Surface Area
  @Override
  public float surfaceArea() {
    float retVal = (float) (4 * Math.PI * Math.pow(getRadius(), 2));
    return retVal;
  }

  // Calculate Volume
  @Override
  public float volume() {
    float retVal = (float) ((4/3) * Math.PI * Math.pow(getRadius(), 3));
    return retVal;
  }

  // Create a message to be displayed of the object's contents
  @Override
  public void render() {
    String message = "Sphere-" + "\nRadius: " + getRadius() + "\nSurface Area: " +
            surfaceArea() + "\nVolume: " + volume();
    JOptionPane.showMessageDialog(null,
            message);
  }

  // Constructor
  public Sphere(float radius) {
    // Ensure passed value is not negative
    if (radius > 0) {
      this.radius = radius;
    }
  }


}
