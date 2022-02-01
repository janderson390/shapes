package edu.cvtc.shapes;

import javax.swing.*;

public class Cylinder extends Shape{

  // Properties
  private float radius = 0.0f;
  private float height = 0.0f;

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

  // gets the height
  public float getHeight() {
    return this.height;
  }

  // sets the height
  private void setHeight(float height) {
    // Ensure passed value is not negative
    if (height > 0) {
      this.height = height;
    }
  }

  // Abstract Methods

  // Calculate Surface Area
  @Override
  public float surfaceArea() {
    float retVal = (float) (2 * Math.PI * getRadius() * getHeight());
    return retVal;
  }

  // Calculate Volume
  @Override
  public float volume() {
    float retVal = (float) (Math.PI * Math.pow(getHeight(), 2) * getHeight());
    return retVal;
  }

  // Create a message to be displayed of the object's contents
  @Override
  public void render() {
    String message = "Cylinder-" + "\nRadius: " + getRadius() + "\nHeight: " + getHeight() +
          "\nSurface Area: " + surfaceArea() + "\nVolume: " + volume();
    JOptionPane.showMessageDialog(null,
            message);
  }

  // Constructor
  public Cylinder(float radius, float height) {
    // Ensure passed values are not negative
    if (radius > 0 && height > 0) {
      this.radius = radius;
      this.height = height;
    }
  }

}
