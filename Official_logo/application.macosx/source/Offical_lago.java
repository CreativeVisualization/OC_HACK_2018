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

public class Offical_lago extends PApplet {

// OC2018 Tama Art University

public void setup(){

background(255);

fill(0);
beginShape();
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
vertex(22.34f, 533.3f);
vertex(190.56f, 595.32f);
vertex(43.76f, 789.19f);
vertex(257.61f, 773.35f);
vertex(303.77f, 959.72f);
vertex(466.36f, 774.31f);
vertex(602.29f, 954.9f);
vertex(615.81f, 595.92f);
vertex(770.0f, 631.68f);
endShape(CLOSE);

fill(0xffff00b8);
beginShape();
vertex(593.85f, 564.37f);
vertex(583.25f, 894.16f);
vertex(467.13f, 738.62f);
vertex(315.13f, 913.37f);
vertex(274.54f, 746.57f);
vertex(87.85f, 763.07f);
vertex(223.35f, 583.99f);
vertex(67.92f, 525.8f);
vertex(197.14f, 428.81f);
vertex(41.06f, 257.72f);
vertex(202.61f, 228.05f);
vertex(173.31f, 83.53f);
vertex(333.35f, 164.55f);
vertex(421.95f, 59.68f);
vertex(428.38f, 193.36f);
vertex(592.02f, 67.39f);
vertex(471.06f, 324.86f);
vertex(684.25f, 269.77f);
vertex(592.2f, 418.0f);
vertex(720.41f, 598.34f);
endShape(CLOSE);
}

public void keyPressed() {
  if (key == ENTER) {
    saveFrame("OC2018_stripe-####. jpg");
  }
}
  public void settings() { 
size(770, 960); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Offical_lago" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
