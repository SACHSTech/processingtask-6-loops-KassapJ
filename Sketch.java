import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// Quadrant 1
  stroke(0);
  strokeWeight(width / 120);
  for(int lineX = ((width / 2) / 10); lineX < width / 2; lineX += ((width / 2) / 10)){
    line(lineX, 0, lineX, height / 2);
  }
  for(int lineY = ((height / 2) / 10); lineY < height / 2; lineY += ((height / 2) / 10)){
    line(0, lineY, width / 2, lineY);
  }

  // Quadrant 2
  fill(225, 15, 125);
  strokeWeight(width / 300);
  
  for(int i = 0; i < 5; i++){
    int Y = i * ((height / 2) / 5) + height / 20;
    for(int j = 0; j < 5; j++){
      int X = j * ((width / 2) / 5) + (width / 2) + width / 20;

      ellipse(X, Y, width / 17, height / 17);
    }

  }

  //Quadrant 3
  strokeWeight(1);
  //int color = 0;
  for(int i = 0; i <= width / 2; i++){
    stroke(i);
    line(i, height / 2, i, height);
    //color += (255 / (width / 2));
  }

  //Quadrant 4
    for(int j = 0; j <= 90; j += 45){
      stroke(width / 300);
      fill(220,93,52);
      rotateZ(radians(j));
      ellipse((float) (width / 1.333), (float) (height / 1.333), width / 3, height / 20);
    }

    rotateZ(0);
    fill(38,108,45);
    noStroke();
    ellipse((float) (width / 1.333), (float) (height / 1.333), width / 10, height / 10);

  }
  
}