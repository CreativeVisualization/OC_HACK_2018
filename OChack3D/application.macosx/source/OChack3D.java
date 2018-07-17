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

public class OChack3D extends PApplet {

// OChack2018 Tama Art University
float[][] outer = {
  {618.69f, 417.09f}, {728.15f, 237.57f}, {509.81f, 292.39f}, {646.16f, 0.0f}, {446.02f, 152.01f}, {438.73f, 6.78f}, {326.74f, 134.18f}, {144.47f, 45.9f}, {175.58f, 209.37f}, {0.0f, 244.14f}, {164.85f, 426.16f}, {22.34f, 533.3f}, {190.56f, 595.32f}, {43.76f, 789.19f}, {257.61f, 773.35f}, {303.77f, 959.72f}, {466.36f, 774.31f}, {602.29f, 954.9f}, {615.81f, 595.92f}, {770.0f, 631.68f}
};
float[][] inner = {
  {593.85f, 564.37f}, {583.25f, 894.16f}, {467.13f, 738.6f}, {315.13f, 913.37f}, {274.54f, 746.57f}, {87.85f, 763.07f}, {223.35f, 583.99f}, {67.92f, 525.8f}, {197.14f, 428.81f}, {41.06f, 257.7f}, {202.61f, 228.05f}, {173.31f, 83.53f}, {333.35f, 164.55f}, {421.95f, 59.68f}, {428.38f, 193.f}, {592.02f, 67.39f}, {471.06f, 324.86f}, {684.25f, 269.7f}, {592.2f, 418.0f}, {720.41f, 598.34f}
};
public void setup() {
  
  background(255);
  noStroke();
}
public void draw() {
  translate(500, 600);
  fill(0);
  beginShape();
  for (int i = 0; i < 20; i++) { 
    vertex(outer[i][0]+random(-435, -335), outer[i][1]+random(-530, -430));
  }
  endShape(CLOSE);
  rotateX(random(-0.01f, 0.01f));
  rotateY(random(-0.01f, 0.01f));
  rotateZ(random(-0.01f, 0.01f));
  fill(0xffff00b8);
  beginShape();
  for (int i = 0; i < 20; i++) { 
    vertex(inner[i][0]+random(-435, -335), inner[i][1]+random(-530, -430));
  }
  endShape(CLOSE);
  for (int j = 0; j < 3; j++) {
    rotateX(random(-0.01f, 0.01f));
    rotateY(random(-0.01f, 0.01f));
    rotateZ(random(-0.01f, 0.01f));
    fill(random(0, 256), random(128, 256), random(0, 128));
    beginShape();
    for (int i = 0; i < 20; i+=7) {
      int n = PApplet.parseInt(random(i, i+7))%20;
      vertex(inner[n][0]+random(-435, -335), inner[n][1]+random(-530, -430));
    }
    endShape(CLOSE);
  }
  noLoop();
  save("OChack"+str(PApplet.parseInt(random(65535)))+".jpg");
}
  public void settings() {  size(1000, 1200, P3D); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OChack3D" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
