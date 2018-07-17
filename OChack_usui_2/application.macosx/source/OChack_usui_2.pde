float[][] outer = {
  {618.69, 417.09}, {728.15, 237.57}, {509.81, 292.39}, {646.16, 0.0}, {446.02, 152.01}, {438.73, 6.78}, {326.74, 134.18}, {144.47, 45.9}, {175.58, 209.37}, {0.0, 244.14}, {164.85, 426.16}, {22.34, 533.3}, {190.56, 595.32}, {43.76, 789.19}, {257.61, 773.35}, {303.77, 959.72}, {466.36, 774.31}, {602.29, 954.9}, {615.81, 595.92}, {770.0, 631.68}
};
float[][] inner = {
  {573.85, 564.37}, {583.25, 894.16}, {467.13, 738.6}, {315.13, 913.37}, {274.54, 746.57}, {87.85, 763.07}, {223.35, 583.99}, {67.92, 525.8}, {197.14, 428.81}, {41.06, 257.7}, {202.61, 228.05}, {173.31, 83.53}, {333.35, 164.55}, {421.95, 59.68}, {428.38, 193.}, {592.02, 67.39}, {471.06, 324.86}, {684.25, 269.7}, {592.2, 418.0}, {720.41, 598.34}
};
void setup() {
  size(900, 1100);
  frameRate(20);
  background(255);
  noStroke();
}
void draw() {

  beginShape();
 
  for (int i = 0; i < 4; i++) { 
     fill(random(0, 100), random(0, 100), random(0, 100));
     triangle(random(width),random(height),random(width),random(height),random(width),random(height));
  }
  endShape(CLOSE);
  fill(#A9BBDB);
  beginShape();
  for (int i = 0; i < 20; i++) { 
    vertex(inner[i][0]+random(-50, 50), inner[i][1]+random(-30, 80));
  }
  endShape(CLOSE);
 {
    fill(#ffffff);
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

void keyPressed(){
  
  if (key == 's') {
    saveFrame("data/####.jpg");
  }
}

void mouseClicked(){
  noLoop();
  
}

void mouseReleased(){
  loop();
}
