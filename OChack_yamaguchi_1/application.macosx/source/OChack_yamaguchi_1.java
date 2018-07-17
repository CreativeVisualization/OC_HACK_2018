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

public class OChack_yamaguchi_1 extends PApplet {

PImage img;

int mosaicWidth = 30;
int mosaicHeight = 20;

public void setup(){

noStroke();
img = loadImage("logo2018.png");

for(int i=0; i<img.pixels.length; i++){
    
    float r = red(img.pixels[i]);
    float g = green(img.pixels[i]);
    float b = blue(img.pixels[i]);
    
     img.pixels[i] = color(random(r+150), random(g+150), random(b+150));
}
  img.updatePixels();
  
}

public void draw(){
  background(0);
  image(img,0,0);
  loadPixels();
  
for(int j = 0; j < height; j+= mosaicHeight){
  for(int i = 0; i < width; i +=mosaicWidth){
    int c = pixels[j* width + i];
    fill(c);
   rect(i,j,mosaicWidth,mosaicHeight);
    
  }
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
  
 // noLoop();
}
public void mouseMoved(){
  mosaicWidth = mouseX / 4 + 20;
  mosaicHeight = mouseY / 4 + 20;
  }

public void keyPressed() {
  if (key == 's') {
    saveFrame("data/####.jpg");
  }
}
   
  public void settings() { 
size(770,990); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OChack_yamaguchi_1" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
