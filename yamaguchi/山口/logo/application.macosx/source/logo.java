import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class logo extends PApplet {

int x,y;

public void setup() {
  
  background(255); 
  frameRate(10);
}

public void draw() {
  for(int i = 0; i<30; i++){
    fill(0xffff00b8);
    noStroke();
   triangle(random(width),random(height),random(width),random(height),random(width),random(height));
}
  for(int i = 0; i<10; i++){
    fill(0xff4bb2fc);
    //noStroke();
    rect(random(width),random(height),random(width),random(height),random(width));
}

  for(int i = 0; i<3; i++){
    fill(0xffafff0f);
    noStroke();
   triangle(random(width),random(height),random(width),random(height),random(width),random(height));
}

 for(int i = 0; i<3; i++){
    fill(0xff0f5bff);
    noStroke();
   triangle(random(width),random(height),random(width),random(height),random(width),random(height));
}


  smooth();
  noStroke();
  fill(255);
  beginShape();
  vertex(820.0f, 990.0f);
  vertex(0, 990.0f);
  vertex(0, 0);
  vertex(820.0f, 0);
  vertex(771.0f, 632.68f);
  vertex(618.69f, 417.09f);
  vertex(728.15f, 237.57f);
  vertex(509.81f, 292.39f);
  vertex(646.16f, 0.0f);
  vertex(446.02f, 152.01f);
  vertex(438.73f, 6.78f);
  vertex(326.74f, 134.18f);
  vertex(144.47f, 45.9f);
  vertex(175.58f, 209.37f);
  vertex(0.0f, 244.14f);
  vertex(164.85f, 426.16f);
  vertex(23.34f, 543.3f);
  vertex(190.56f, 595.32f);
  vertex(43.76f, 789.19f);
  vertex(257.61f, 773.35f);
  vertex(303.77f, 959.72f);
  vertex(466.36f, 774.31f);
  vertex(602.29f, 954.9f);
  vertex(615.81f, 595.92f);
  vertex(771.0f, 632.68f);
  endShape(CLOSE);
  
  for(int i = 0; i<3; i++){
    float y = random(50,990);
    strokeWeight(random(2,50));
    stroke(255);
   line(0,y,990,y);
  }
 
}

public void keyPressed(){
  
  if (key == 's') {
    saveFrame("data/####.png");
  }
}

public void mouseClicked() {
 noLoop();
  
}

public void mouseReleased(){
  loop();
}
   
  public void settings() {  size(770, 990); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "logo" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
