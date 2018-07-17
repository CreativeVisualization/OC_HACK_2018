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

public class OChack_usui_2 extends PApplet {

float[][] outer = {
  {618.69f, 417.09f}, {728.15f, 237.57f}, {509.81f, 292.39f}, {646.16f, 0.0f}, {446.02f, 152.01f}, {438.73f, 6.78f}, {326.74f, 134.18f}, {144.47f, 45.9f}, {175.58f, 209.37f}, {0.0f, 244.14f}, {164.85f, 426.16f}, {22.34f, 533.3f}, {190.56f, 595.32f}, {43.76f, 789.19f}, {257.61f, 773.35f}, {303.77f, 959.72f}, {466.36f, 774.31f}, {602.29f, 954.9f}, {615.81f, 595.92f}, {770.0f, 631.68f}
};
float[][] inner = {
  {573.85f, 564.37f}, {583.25f, 894.16f}, {467.13f, 738.6f}, {315.13f, 913.37f}, {274.54f, 746.57f}, {87.85f, 763.07f}, {223.35f, 583.99f}, {67.92f, 525.8f}, {197.14f, 428.81f}, {41.06f, 257.7f}, {202.61f, 228.05f}, {173.31f, 83.53f}, {333.35f, 164.55f}, {421.95f, 59.68f}, {428.38f, 193.f}, {592.02f, 67.39f}, {471.06f, 324.86f}, {684.25f, 269.7f}, {592.2f, 418.0f}, {720.41f, 598.34f}
};
public void setup() {
  
  frameRate(20);
  background(255);
  noStroke();
}
public void draw() {

  beginShape();
 
  for (int i = 0; i < 4; i++) { 
     fill(random(0, 100), random(0, 100), random(0, 100));
     triangle(random(width),random(height),random(width),random(height),random(width),random(height));
  }
  endShape(CLOSE);
  fill(0xffA9BBDB);
  beginShape();
  for (int i = 0; i < 20; i++) { 
    vertex(inner[i][0]+random(-50, 50), inner[i][1]+random(-30, 80));
  }
  endShape(CLOSE);
 {
    fill(0xffffffff);
    beginShape();
 for (int i = 0; i < 12; i++) { 
    vertex(inner[i][0]+random(-50, 50), inner[i][1]+random(-30, 80));
  }
    endShape(CLOSE);
  }
  fill(random(0, 143), random(0, 204), random(0, 196));
    beginShape();
 for (int i = 0; i < 9; i++) { 
    vertex(inner[i][0]+random(-100, -10), inner[i][1]+random(10, 80));
   
 }
    endShape(CLOSE);
 
    



}

public void keyPressed(){
  
  if (key == 's') {
    saveFrame("data/####.jpg");
  }
}

public void mouseClicked(){
  noLoop();
  
}

public void mouseReleased(){
  loop();
}
  public void settings() {  size(900, 1100); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OChack_usui_2" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
