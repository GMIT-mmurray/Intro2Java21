
import java.util.Date;

public class SimpleGeometricObject {

  private String color;
  private boolean filled;
  private Date dateCreated;
  
  /** Construct a default geometric object */
  public SimpleGeometricObject() {
    color = "white";
    filled = false;
    dateCreated = new Date();
  }

  /** Construct a geometric object with the specified color 
    *  and filled value */
  public SimpleGeometricObject(String color, boolean filled) {
    dateCreated = new Date();
    this.color = color;
    this.filled = filled;
  }

  /** Return color */
  public String getColor() {
    return color;
  }

  /** Set a new color */
  public void setColor(String color) {
    this.color = color;
  }

  /** Return filled. Since filled is boolean, 
     its get method is named isFilled */
  public boolean isFilled() {
    return filled;
  }

  /** Set a new filled */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }
  
  /** Get dateCreated */
  public Date getDateCreated() {
    return dateCreated;
  }
  
  /** Return a string representation of this object */
  @Override
  public String toString() {
    return "SimpleGeometricObject{" +
            "color='" + color + '\'' +
            ", filled=" + filled +
            ", dateCreated=" + dateCreated +
            '}';
  }
}
