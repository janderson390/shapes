package edu.cvtc.shapes;

import javax.swing.*;

public class Cuboid extends Shape{

  // Properties
  private float width = 0.0f;
  private float height = 0.0f;
  private float depth = 0.0f;

  // Methods

  // gets the width
  public float getWidth() {
    return this.width;
  }

  // sets the width
  private void setWidth(float width) {
    // Ensure passed value is not negative
    if (width > 0) {
      this.width = width;
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

  // gets the depth
  public float getDepth() {
    return this.depth;
  }

  // sets the depth
  private void setDepth(float depth) {
    // Ensure passed value is not negative
    if (depth > 0) {
      this.depth = depth;
    }
  }

  // Abstract Methods

  // Calculate Surface Area
  @Override
  public float surfaceArea() {
    float retVal = (2 * getHeight() * getWidth()) +
            (2 * getHeight() * getDepth()) +
            (2 * getWidth() * getDepth());
    return retVal;
  }

  // Calculate Volume
  @Override
  public float volume() {
    float retVal = getHeight() * getWidth() * getDepth();
    return retVal;
  }

  // Create a message to be displayed of the object's contents
  @Override
  public void render() {
    String message = "Cuboid-" + "\nWidth: " + getWidth() + "\nHeight: " + getHeight() +
            "\nDepth: " + getDepth() + "\nSurface Area: " + surfaceArea() +
            "\nVolume: " + volume();
    JOptionPane.showMessageDialog(null, message);
  }

  // Constructor
  public Cuboid(float width, float height, float depth) {
    // Ensure passed values are not negative
    if (width > 0 && height > 0 && depth > 0) {
      this.width = width;
      this.height = height;
      this.depth = depth;
    }
  }

}
