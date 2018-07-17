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

public class OChack_nishiyama extends PApplet {

//OC2018 Tama Art University_nishiyama

public void setup() {
  noStroke();
  
  blendMode(BLEND);
  colorMode(RGB, 150, 150, 150);
  frameRate(10);
}
public void draw() {
  beginShape();
  noStroke();
  translate(65, 70);
  fill(random(0, 255), random(0, 255), random(0, 255));
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

  beginShape();
  noStroke();
  fill(random(20, 200), random(20, 190), random(120, 255));
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

  beginShape();
  noStroke();
  fill(random(0, 225), random(0, 255), random(0, 255), 130);
  vertex(246.16f, 0);
  vertex(192.02f, 67.39f);
  vertex(71.06f, 324.86f);
  vertex(284.25f, 269.77f);
  vertex(192.2f, 418.0f);
  vertex(320.41f, 598.34f);
  vertex(193.85f, 564.37f);
  vertex(183.25f, 894.16f);
  vertex(202.29f, 954.9f);
  vertex(215.81f, 595.92f);
  vertex(370.0f, 631.68f);
  vertex(218.69f, 417.09f);
  vertex(328.15f, 237.57f);
  vertex(109.81f, 292.39f);
  vertex(246.16f, 0.0f);
  endShape(CLOSE);

  beginShape();
  noStroke();
  fill(random(0, 225), random(0, 255), random(0, 255), 160);
  vertex(446.16f, 0);
  vertex(392.02f, 67.39f);
  vertex(271.06f, 324.86f);
  vertex(484.25f, 269.77f);
  vertex(392.2f, 418.0f);
  vertex(520.41f, 598.34f);
  vertex(393.85f, 564.37f);
  vertex(383.25f, 894.16f);
  vertex(402.29f, 954.9f);
  vertex(415.81f, 595.92f);
  vertex(570.0f, 631.68f);
  vertex(418.69f, 417.09f);
  vertex(528.15f, 237.57f);
  vertex(309.81f, 292.39f);
  vertex(446.16f, 0.0f);
  endShape(CLOSE);

  for (int i =0; i<350; i++) {
    pushMatrix() ;
    translate(random(width), random(height));
    scale(random(1, 8));
    fill(random(0, 255), random(0, 255), random(0, 255), random(0, 100));
    triangle(random(0, 40), random(0, 40), random(0, 55), random(0, 20), random(0, 25), random(0, 70));
    popMatrix() ;
  }

  fill(0xffFFFFFF);//白枠
  //translate(65, 70);
  beginShape();
  noStroke();
  vertex(770.0f, 631.68f);
  vertex(618.69f, 417.09f);
  vertex(728.15f, 237.57f);
  vertex(509.81f, 292.39f);
  vertex(646.16f, 0.0f);
  vertex(446.02f, 152.01f);
  vertex(438.73f, 6.78f);
  vertex(326.74f, 134.18f);
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
  vertex(900-65, 1100-70);
  vertex(0-65, 1100-70);
  vertex(0-65, 0-70);
  vertex(900-65, 0-70);
  vertex(900-65, 1100-70);
  endShape(CLOSE);

  noFill();
  float r1 =random(20, 200)+random(50);
  float g1 =random(20, 190)+random(50);
  float b1=random(20, 190)+random(50);
  //strokeJoin(ROUND);

  beginShape();
  noFill();
  strokeWeight(25);
  stroke(r1, g1, b1);
  vertex(618.69f, 417.09f);
  stroke(140);
  vertex(728.15f, 237.57f);
  stroke(r1, g1, b1);
  vertex(509.81f, 292.39f);
  stroke(140);
  vertex(646.16f, 0.0f);
  stroke(r1, g1, b1);
  vertex(446.02f, 152.01f);
  stroke(140);
  vertex(438.73f, 6.78f);
  stroke(r1, g1, b1);
  vertex(326.74f, 134.18f);
  stroke(140);
  vertex(144.47f, 45.9f);
  stroke(r1, g1, b1);
  vertex(175.58f, 209.37f);
  stroke(140);
  vertex(0.0f, 244.14f);
  stroke(r1, g1, b1);
  vertex(164.85f, 426.16f);
  stroke(140);
  vertex(22.34f, 533.3f);
  stroke(r1, g1, b1);
  vertex(190.56f, 595.32f);
  stroke(140);
  vertex(43.76f, 789.19f);
  stroke(r1, g1, b1);
  vertex(257.61f, 773.35f);
  stroke(140);
  vertex(303.77f, 959.72f);
  stroke(r1, g1, b1);
  vertex(466.36f, 774.31f);
  stroke(140);
  vertex(602.29f, 954.9f);
  stroke(r1, g1, b1);
  vertex(615.81f, 595.92f);
  stroke(140);
  vertex(770.0f, 631.68f);
  endShape(CLOSE);


  beginShape();
  noFill();
  float r2 =random(20, 200)+random(50.0f);
  float g2 =random(20, 190)+random(50.0f);
  float b2 =random(20, 190)+random(50.0f);
  vertex(593.85f, 564.37f);
  stroke(r2, g2, b2);
  vertex(583.25f, 894.16f);
  stroke(255);
  vertex(467.13f, 738.62f);
  stroke(r2, g2, b2);
  vertex(315.13f, 913.37f);
  stroke(255);
  vertex(274.54f, 746.57f);
  stroke(r2, g2, b2);
  vertex(87.85f, 763.07f);
  stroke(255);
  vertex(223.35f, 583.99f);
  stroke(r2, g2, b2);
  vertex(67.92f, 525.8f);
  stroke(255);
  vertex(197.14f, 428.81f);
  stroke(r2, g2, b2);
  vertex(41.06f, 257.72f);
  stroke(255);
  vertex(202.61f, 228.05f);
  stroke(r2, g2, b2);
  vertex(173.31f, 83.53f);
  stroke(255);
  vertex(333.35f, 164.55f);
  stroke(r2, g2, b2);
  vertex(421.95f, 59.68f);
  stroke(255);
  vertex(428.38f, 193.36f);
  stroke(r2, g2, b2);
  vertex(592.02f, 67.39f);
  stroke(255);
  vertex(471.06f, 324.86f);
  stroke(r2, g2, b2);
  vertex(684.25f, 269.77f);
  stroke(255);
  vertex(592.2f, 418.0f);
  stroke(r2, g2, b2);
  vertex(720.41f, 598.34f);
  endShape(CLOSE);
}


public void mousePressed() {
  loop();      // ボタンを押すと再開
}

public void mouseReleased() {
  noLoop();        // ボタンが離されると停止

  save("OChack"+str(PApplet.parseInt(random(65535)))+".jpg");
}
  public void settings() {  size(900, 1100, P2D); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OChack_nishiyama" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
