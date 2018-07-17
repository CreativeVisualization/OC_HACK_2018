int x,y;

void setup() {
  size(770, 990);
  background(255); 
  frameRate(10);
}

void draw() {
  for(int i = 0; i<30; i++){
    fill(#ff00b8);
    noStroke();
   triangle(random(width),random(height),random(width),random(height),random(width),random(height));
}
  for(int i = 0; i<10; i++){
    fill(#4bb2fc);
    //noStroke();
    rect(random(width),random(height),random(width),random(height),random(width));
}

  for(int i = 0; i<3; i++){
    fill(#afff0f);
    noStroke();
   triangle(random(width),random(height),random(width),random(height),random(width),random(height));
}

 for(int i = 0; i<3; i++){
    fill(#0f5bff);
    noStroke();
   triangle(random(width),random(height),random(width),random(height),random(width),random(height));
}


  smooth();
  noStroke();
  fill(255);
  beginShape();
  vertex(820.0, 990.0);
  vertex(0, 990.0);
  vertex(0, 0);
  vertex(820.0, 0);
  vertex(771.0, 632.68);
  vertex(618.69, 417.09);
  vertex(728.15, 237.57);
  vertex(509.81, 292.39);
  vertex(646.16, 0.0);
  vertex(446.02, 152.01);
  vertex(438.73, 6.78);
  vertex(326.74, 134.18);
  vertex(144.47, 45.9);
  vertex(175.58, 209.37);
  vertex(0.0, 244.14);
  vertex(164.85, 426.16);
  vertex(23.34, 543.3);
  vertex(190.56, 595.32);
  vertex(43.76, 789.19);
  vertex(257.61, 773.35);
  vertex(303.77, 959.72);
  vertex(466.36, 774.31);
  vertex(602.29, 954.9);
  vertex(615.81, 595.92);
  vertex(771.0, 632.68);
  endShape(CLOSE);
  
  for(int i = 0; i<3; i++){
    float y = random(50,990);
    strokeWeight(random(2,50));
    stroke(255);
   line(0,y,990,y);
  }
 
}

void keyPressed(){
  
  if (key == 's') {
    saveFrame("data/####.jpg");
  }
}

void mouseClicked() {
 noLoop();
  
}

void mouseReleased(){
  loop();
}
   
