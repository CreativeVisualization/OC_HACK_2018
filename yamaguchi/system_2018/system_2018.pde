PImage img;

int mosaicWidth = 30;
int mosaicHeight = 20;

void setup(){
size(770,990);
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

void draw(){
  background(0);
  image(img,0,0);
  loadPixels();
  
for(int j = 0; j < height; j+= mosaicHeight){
  for(int i = 0; i < width; i +=mosaicWidth){
    color c = pixels[j* width + i];
    fill(c);
   rect(i,j,mosaicWidth,mosaicHeight);
    
  }
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
  
 // noLoop();
}
void mouseMoved(){
  mosaicWidth = mouseX / 4 + 20;
  mosaicHeight = mouseY / 4 + 20;
  }

void keyPressed() {
  if (key == 's') {
    saveFrame("data/####.png");
  }
}
   